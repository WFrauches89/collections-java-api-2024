package com.meuscursos.main.set.ordenacao;

import java.util.Objects;

public class Aluno implements Comparable<Aluno> {

    private String nome;
    private Long matricula;
    private double nota;

    public Aluno(String nome, Long matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public Long getMatricula() {
        return matricula;
    }


    @Override
    public int compareTo(Aluno a) {
        return nome.compareTo(a.getNome());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return Objects.equals(matricula, aluno.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }


    @Override
    public String toString() {
        return  nome + ", matricula=" + matricula + ", nota=" + nota + "/-/";
    }
}
