package com.meuscursos.main.set.operacoesBasicas;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoPalavrasUnicas implements Comparable<String> {

    private Set<String> palavras;

    public ConjuntoPalavrasUnicas() {
        this.palavras = new HashSet<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConjuntoPalavrasUnicas that)) return false;
        return Objects.equals(palavras, that.palavras);
    }

    @Override
    public int hashCode() {
        return Objects.hash(palavras);
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }

    public Set<String> getPalavras() {
        return palavras;
    }

    public void adicionarPalavra(String palavra) {
        palavras.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!palavras.isEmpty()) {
            if (palavras.contains(palavra)) {
                palavras.remove(palavra);
            } else System.out.println("A palavra, "+palavra+" não foi encontrada.");
        } else System.out.println(" O set está vazio.");
    }

    public boolean verificarPalavra(String palavra) {
        return palavras.contains(palavra);
    }


    public Set<String> exibirPalavrasUnicas() {
        return new TreeSet<>(palavras);
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ConjuntoPalavrasUnicas
        ConjuntoPalavrasUnicas cL = new ConjuntoPalavrasUnicas();

        // Adicionando linguagens únicas ao conjunto
        cL.adicionarPalavra("Java");
        cL.adicionarPalavra("Python");
        cL.adicionarPalavra("JavaScript");
        cL.adicionarPalavra("Python");
        cL.adicionarPalavra("C++");
        cL.adicionarPalavra("Ruby");

//        // Exibindo as linguagens únicas no conjunto
        System.out.println(cL.exibirPalavrasUnicas());

//        // Removendo uma linguagem do conjunto
        cL.removerPalavra("Python");
        System.out.println(cL.exibirPalavrasUnicas());

//        // Removendo uma linguagem inexistente
        cL.removerPalavra("Swift");

//        // Verificando se uma linguagem está no conjunto
        System.out.println("A linguagem 'Java' está no conjunto? " + cL.verificarPalavra("Java"));

        System.out.println("A linguagem 'Python' está no conjunto? " + cL.verificarPalavra("Python"));


//        // Exibindo as linguagens únicas atualizadas no conjunto
        System.out.println(cL.exibirPalavrasUnicas());

    }


}
