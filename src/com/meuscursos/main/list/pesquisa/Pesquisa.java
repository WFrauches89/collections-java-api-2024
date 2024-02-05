package com.meuscursos.main.list.pesquisa;


import java.util.ArrayList;
import java.util.List;

public class Pesquisa {

    private List<Livro> livros;

    public Pesquisa() {
        this.livros = new ArrayList<>();
    }

    public void addLivro (String autor, String titulo, int ano) {
        livros.add(new Livro(autor, titulo, ano));
    }

    public List<Livro> pesquisarAutor (String autor) {
        List<Livro> autorList = new ArrayList<>();

        if(!livros.isEmpty()) {
            for (Livro l : livros) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    autorList.add(l);
                }
            }
            if(autorList.isEmpty()){
                throw new RuntimeException("Não há livros para o autor: "+autor);
            } else return autorList;
        } else throw new RuntimeException("A lista de livros está vazia");
    }

    public List<Livro> pesquisarAno (int ano, int ano2) {
        List<Livro> anoList = new ArrayList<>();
        if(!livros.isEmpty()) {
            if (ano <= ano2) {
                for (Livro l : livros) {
                    int anoLivro = l.getAnoDePublicacao();
                    if (anoLivro >= ano && anoLivro <= ano2) {
                        anoList.add(l);
                    }
                }
            } else {
                for (Livro l : livros) {
                    int anoLivro = l.getAnoDePublicacao();
                    if (anoLivro >= ano2 && anoLivro <= ano) {
                        anoList.add(l);
                    }
                }
            }
        }if(anoList.isEmpty()){
            throw new RuntimeException("Não há livros no intervalo de: "+ano +" e "+ ano2);
        } else return anoList;
    }

    public Livro pesquisarTitulo (String titulo) {

        Livro livroTitulo = null;

        if(!livros.isEmpty()) {
            for (Livro l : livros) {
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroTitulo = l;
                    break;
                }
            }
        } if(livroTitulo == null){
            throw new RuntimeException("Não há nenhum livro com o título: "+ titulo);
        } else return livroTitulo;
    }

    public static void main(String[] args) {
        Pesquisa pqs = new Pesquisa();

        pqs.addLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);

        pqs.addLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);

        pqs.addLivro("Código Limpo", "Robert C. Martin", 2009);

        pqs.addLivro("O Codificador Limpo", "Robert C. Martin", 2012);


        System.out.println("Pesquisa por autor: "+pqs.pesquisarAutor("Robert C. Martin"));

        //System.out.println("Pesquisa por autor inexistente: "+pqs.pesquisarAutor("Azul"));

        System.out.println("Pesquisa por ano: "+pqs.pesquisarAno(2018, 2022));

        System.out.println("Pesquisa por ano invertido: "+pqs.pesquisarAno(2022, 2010));

      //  System.out.println("Pesquisa por ano inexistente: "+pqs.pesquisarAno(2025, 2028));

        System.out.println("Pesquisa por titulo: "+pqs.pesquisarTitulo("Java Guia do Programador"));

       // System.out.println("Pesquisa por titulo inexistente: "+pqs.pesquisarTitulo("Título Inexistente"));



    }



}
