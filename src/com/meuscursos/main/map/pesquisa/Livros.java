package com.meuscursos.main.map.pesquisa;

import java.util.Map;

public class Livros {

    private String titulo;
    private String autor;
    private double preco;

    public Livros(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return titulo +", autor='" + autor + ", R$" + preco + '-';
    }

}




