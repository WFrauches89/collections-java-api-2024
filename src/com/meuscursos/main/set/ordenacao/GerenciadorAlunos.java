package com.meuscursos.main.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    Set<Aluno> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void addAluno(String nome, Long matricula, double nota) {
        alunosSet.add(new Aluno(nome, matricula, nota));
    }

    public void removeAluno(Long matricula) {
        if (!alunosSet.isEmpty()) {
            for (Aluno a : alunosSet) {
                if (a.getMatricula() == matricula) {
                    alunosSet.remove(a);
                    break;
                }
            }
        } else {
            throw new RuntimeException("Não existe alunos na SET...");
        }
    }

    public void exibirAlunos() {
        if(!alunosSet.isEmpty()){
            System.out.println("Lista de alunos: "+alunosSet);
        } else {
            System.out.println("Não existe aluno cadastrado ainda...");
        }
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunoNome = new TreeSet<>(alunosSet);
        if(!alunosSet.isEmpty()){
            return alunoNome;
        } else {
            throw new RuntimeException("Não existe uma lista de alunos para ser ordenada...");
        }
    }

    public void exibirAlunosPorNota() {
        Set<Aluno> alunoNota = new TreeSet<>(new ComparatorNota());
        if(!alunosSet.isEmpty()){
            alunoNota.addAll(alunosSet);
            System.out.println(alunoNota);
        } else {
            System.out.println("Não existe uma lista de alunos para ser ordenada...");
        }
    }



    public static void main(String[] args) {

        GerenciadorAlunos gA = new GerenciadorAlunos();


        System.out.println("Lista de alunos: ");
        gA.exibirAlunos();

        gA.addAluno("João", 12L, 4.5);
        gA.addAluno("Marcos", 13L, 7.5);
        gA.addAluno("Maria", 14L, 3.5);
        gA.addAluno("Maria das Dores", 15L, 9.5);
        gA.addAluno("Carlos", 16L, 5.5);
        gA.addAluno("Ana C", 17L, 6.5);
        gA.addAluno("Ana", 18L, 8.5);
        gA.addAluno("Ana Lucia", 18L, 9.5);


        System.out.println("Lista de alunos ordenada nome: "+gA.exibirAlunosPorNome());


        System.out.println("Lista de alunos ordenada nota: ");
        gA.exibirAlunosPorNota();

        gA.removeAluno(17L);
        gA.removeAluno(14L);
        gA.removeAluno(16L);
        gA.removeAluno(18L);
        gA.removeAluno(13L);
        gA.removeAluno(2L);

        System.out.println("Lista de alunos ordenada nome: "+gA.exibirAlunosPorNome());

    }
}
