package com.meuscursos.main.set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void addConvidado (String nome, int codigoConvite) {
        this.convidadoSet.add(new Convidado(nome,codigoConvite));
    }

    public void removerConvidadoPorConvite(int codigoConvite) {
        Convidado cRemove = null;
        if (!convidadoSet.isEmpty()) {
            for (Convidado c : convidadoSet) {
                if (c.getCodigoConvite() == codigoConvite) {
                    cRemove = c;
                    break;
                }
            } if(cRemove == null) {
                throw new RuntimeException(" Não encontramos o código solicitado:" + codigoConvite);
            } else convidadoSet.remove(cRemove);
        } else throw new RuntimeException(" A lista de convidados está vazia...");

    }

    public int contarConvidados () {
        return this.convidadoSet.size();
    }

    public void exibirConvidados () {
        if (!convidadoSet.isEmpty()){
            System.out.println(convidadoSet);
        } else System.out.println(" Lista de convidados vazia!");
    }

    public static void main(String[] args) {
        ConjuntoConvidados cc = new ConjuntoConvidados();

        System.out.println("Lista de convidados: ");
        cc.exibirConvidados();

        cc.addConvidado("A",1);
        cc.addConvidado("Z",8);
        cc.addConvidado("W",7);
        cc.addConvidado("C",4);
        cc.addConvidado("Q",3);
        cc.addConvidado("B",9);
        cc.addConvidado("D",12);
        cc.addConvidado("X",12);
        cc.addConvidado("Y",18);

        System.out.println("Lista de convidados: ");
        cc.exibirConvidados();

        System.out.println("Temos o total de "+ cc.contarConvidados()+" convidados.");

        cc.exibirConvidados();

        System.out.println("Qual o código para remover? "  );
        cc.removerConvidadoPorConvite(8);

        cc.exibirConvidados();
        System.out.println("Temos o total de "+ cc.contarConvidados()+" convidados.");

    }






}
