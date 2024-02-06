package com.meuscursos.main.map.pesquisa;

import java.util.*;
import java.util.stream.Collectors;

public class LivrariaOn {

    Map<String, Livros> livrariaMap;

    public LivrariaOn() {
        this.livrariaMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        livrariaMap.put(link, new Livros(titulo, autor, preco));
    }

    public void removerLivro(String titulo) {
        List<String> chavesRemover = new ArrayList<>();
        for (Map.Entry<String, Livros> entry : livrariaMap.entrySet()) {
            if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                chavesRemover.add(entry.getKey());
            }
        }
        for (String chave : chavesRemover) {
            livrariaMap.remove(chave);
        }
    }

    public Map<String, Livros> exibirLivrosOrdenadosPorPreco() {

        Map<String, Livros> livrosOrdenadosPorPreco = livrariaMap.entrySet()  //recebendo todas as entradas pares chave e valor pelo entrySet
                .stream() //manipular collections
                .sorted(new ComparatorPorPreco()) // ordenar pelo comparator que criamos
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new)); // Coletar e um novo Map com construtor Linked, extraindo key e value e em caso de conflito de chave retorna primeira ocorrência

        return livrosOrdenadosPorPreco;

    }

    public Map<String, Livros> exibirLivrosOrdenadosPorAutor() {

        Map<String, Livros> livrosOrdenadosPorAutor = livrariaMap.entrySet()
                .stream()
                .sorted(new ComparatorPorAutor())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));

        return livrosOrdenadosPorAutor;
    }

    public Map<String, Livros> pesquisarLivrosPorAutor(String autor) {
        Map<String, Livros> livrosPorAutor = new LinkedHashMap<>();

        for (Map.Entry<String, Livros> entry : livrariaMap.entrySet()) {
            Livros l = entry.getValue();
            if (l.getAutor().equals(autor)) {
                livrosPorAutor.put(entry.getKey(), l);
            }
        }
        return livrosPorAutor;
    }

    public List<Livros> obterLivrosMaisCaro() {
        List<Livros> livrosMaisCaros = new ArrayList<>();
        double precoMaisAlto = Double.MIN_VALUE;

        if (!livrariaMap.isEmpty()) {
            for (Livros Livros : livrariaMap.values()) {
                if (Livros.getPreco() > precoMaisAlto) {
                    precoMaisAlto = Livros.getPreco();
                }
            }
        } else {
            throw new NoSuchElementException("A livraria está vazia!");
        }

        for(Map.Entry<String, Livros> entry: livrariaMap.entrySet()) {
            if(entry.getValue().getPreco() == precoMaisAlto) {
                Livros livroComPrecoMaisAlto = livrariaMap.get(entry.getKey());
                livrosMaisCaros.add(livroComPrecoMaisAlto);
            }
        }
        return livrosMaisCaros;


    }

    public List<Livros> obterLivroMaisBarato() {
        List<Livros> livrosMaisBaratos = new ArrayList<>();
        double precoMaisBaixo = Double.MAX_VALUE;

        if (!livrariaMap.isEmpty()) {
            for (Livros livro : livrariaMap.values()) {
                if (livro.getPreco() < precoMaisBaixo) {
                    precoMaisBaixo = livro.getPreco();
                }
            }
        } else {
            throw new NoSuchElementException("A livraria está vazia!");
        }

        for (Map.Entry<String, Livros> entry : livrariaMap.entrySet()) {
            if (entry.getValue().getPreco() == precoMaisBaixo) {
                Livros livroComPrecoMaisBaixo = livrariaMap.get(entry.getKey());
                livrosMaisBaratos.add(livroComPrecoMaisBaixo);
            }
        }
        return livrosMaisBaratos;
    }


    public static void main(String[] args) {
        LivrariaOn lo = new LivrariaOn();

        lo.adicionarLivro("https://amzn.to/3EclT8Z", "1984", "George Orwell", 70d);
        lo.adicionarLivro("https://amzn.to/47Umiun", "A Revolução dos Bichos", "George Orwell", 7.05d);
        lo.adicionarLivro("https://amzn.to/3L1FFI6", "Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d);
        lo.adicionarLivro("https://amzn.to/3OYb9jk", "Malorie", "Josh Malerman", 6d);
        lo.adicionarLivro("https://amzn.to/45HQE1L", "E Não Sobrou Nenhum", "Agatha Christie", 50d);
        lo.adicionarLivro("https://amzn.to/45u86q4", "Assassinato no Expresso do Oriente", "Agatha Christie", 5d);

        System.out.println("Ordem por preço: ");
        System.out.println(lo.exibirLivrosOrdenadosPorPreco());


        System.out.println("Ordem por nome autor: ");
        System.out.println(lo.exibirLivrosOrdenadosPorAutor());

        String autorPesquisa = "Josh Malerman";
        System.out.println("Pesquisa por autor: "+lo.pesquisarLivrosPorAutor(autorPesquisa));

        System.out.println("Livro mais caro: " + lo.obterLivrosMaisCaro());

        System.out.println("Livro mais barato: " + lo.obterLivroMaisBarato());

        lo.removerLivro("1984");

        System.out.println("Ordem por preço: ");
        System.out.println(lo.exibirLivrosOrdenadosPorPreco());

    }


}
