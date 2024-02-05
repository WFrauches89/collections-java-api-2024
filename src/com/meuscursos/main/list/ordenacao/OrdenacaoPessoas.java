package com.meuscursos.main.list.ordenacao;

import java.util.*;

public class OrdenacaoPessoas {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void addPessoa (String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome,idade,altura));
    }

    public List<Pessoa> ordenarIdade () {
        List<Pessoa> pessoaIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaIdade);
        return pessoaIdade;
    }

    public List<Pessoa> ordenarAltura () {
        List<Pessoa> pessoaAltura =new ArrayList<>(pessoaList);
        pessoaAltura.sort(new ComparaAltura());
        return pessoaAltura;
    }


    public static void main(String[] args) {
        OrdenacaoPessoas oP = new OrdenacaoPessoas();

        System.out.println("Lista de pessoas: "+oP.pessoaList);

        oP.addPessoa("Nome 1", 25, 1.65);
        oP.addPessoa("Nome 2", 13, 2.05);
        oP.addPessoa("Nome 3", 14, 1.55);
        oP.addPessoa("Nome 4", 16, 1.75);
        oP.addPessoa("Nome 5", 39, 1.85);
        oP.addPessoa("Nome 6", 18, 1.95);
        oP.addPessoa("Nome 7", 17, 1.65);

        System.out.println("Lista de pessoas: "+oP.pessoaList);
        System.out.println("Lista ordenada por idade: "+oP.ordenarIdade());
        System.out.println("A pessoa mais nova é: "+oP.ordenarIdade().get(0));
        System.out.println("Lista ordenada por altura é: "+oP.ordenarAltura());
        System.out.println("A pessoa mais baixa é: "+oP.ordenarAltura().get(0));

    }

}
