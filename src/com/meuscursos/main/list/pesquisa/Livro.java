package com.meuscursos.main.list.pesquisa;

public class Livro {

    private String titulo;

    private String autor;

    private int anoDePublicacao;


    public Livro(String titulo, String autor, int anoDePublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    @Override
    public String toString() {
        return  titulo + '\'' +
                ", autor: '" + autor + '\'' +
                ", ano: "+ anoDePublicacao;
    }
}
