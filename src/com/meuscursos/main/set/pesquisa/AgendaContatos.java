package com.meuscursos.main.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public Set<Contato> exibirContatos() {
        if(!contatoSet.isEmpty()) {
            return contatoSet;
        } else throw new RuntimeException("A lista está vazia...");
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> listaContatos = new HashSet<>();

        if(!contatoSet.isEmpty()){
            for(Contato c:contatoSet){
                if(c.getNome().contains(nome)){
                    listaContatos.add(c);
                }
            }
            return listaContatos;
        } else {
            throw new RuntimeException("A lista está vazia...");
        }
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contato = null;

        if(!contatoSet.isEmpty()){
            for(Contato c: contatoSet){
                if(c.getNome().equalsIgnoreCase(nome)){
                    c.setNumero(novoNumero);
                    contato = c;
                    break;
                }
            } return contato;
        } else throw new RuntimeException(" A lista está vazia");
    }

    public void removerNomeAgenda (String nome) {

        if(!contatoSet.isEmpty()){
            contatoSet.removeIf(c -> c.getNome().equalsIgnoreCase(nome));
        }
    }

    public static void main(String[] args) {
        AgendaContatos aC = new AgendaContatos();

        aC.adicionarContato("ABC DEF",123456);
        aC.adicionarContato("ABC DEF",999999);
        aC.adicionarContato("GHI JKL",123456);
        aC.adicionarContato("MNO PQR",123456);
        aC.adicionarContato("MNO STU",123456);
        aC.adicionarContato("MNO VXY",123456);

        System.out.println("Lista de contatos "+aC.exibirContatos());

        System.out.println("Lista filtrada: "+aC.pesquisarPorNome("MNO"));

        System.out.println("Alterar numero do contato: "+aC.atualizarNumeroContato("MNO STU",1212));

        System.out.println("Lista de contatos "+aC.exibirContatos());

        aC.removerNomeAgenda("MNO PQR");

        System.out.println("Lista de contatos após deleção...  "+aC.exibirContatos());

    }
}
