package com.meuscursos.main.set.pesquisa;

import java.util.Objects;

public class Contato implements Comparable<Contato>{

    private String nome;

    private int numero;

    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return Objects.equals(nome, contato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return nome.toUpperCase() + ", " + numero + " - ";
    }

    @Override
    public int compareTo(Contato c) {
        return nome.compareToIgnoreCase(c.getNome());
    }

}
