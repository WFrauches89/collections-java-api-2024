package com.meuscursos.main.set.operacoesBasicas;

import java.util.Objects;

public class Convidado {

    private String nome;

    private int codigoConvite;

    public Convidado(String nome, int codigoConivte) {
        this.nome = nome;
        this.codigoConvite = codigoConivte;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    @Override
    public String toString() {
        return  nome + ", código do convite=" + codigoConvite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return codigoConvite == convidado.codigoConvite;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoConvite);
    }
}
