package com.meuscursos.main.map.basic;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> contatosMap;

    public AgendaContatos() {
        this.contatosMap = new HashMap<>();
    }

    public void addContato(String nome, Integer telefone) {
        contatosMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!contatosMap.isEmpty()){
            contatosMap.remove(nome);
        }
    }

    public void exibirContatos () {
        System.out.println(contatosMap);
    }

    public Integer pesquisaPorNome (String nome) {
        Integer numeroContato = null;
        if(!contatosMap.isEmpty()){
           numeroContato = contatosMap.get(nome); // AO passar a chave dentro do GET recebemos o valor, neste caso o Integer...
        }
        return numeroContato;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        // Adicionar contatos
        agendaContatos.addContato("Camila", 123456);
        agendaContatos.addContato("João", 5665);
        agendaContatos.addContato("Carlos", 1111111);
        agendaContatos.addContato("Ana", 654987);
        agendaContatos.addContato("Maria", 1111111);
        agendaContatos.addContato("Camila", 44444);

        agendaContatos.exibirContatos();

        // Remover um contato
        agendaContatos.removerContato("Maria");
        agendaContatos.exibirContatos();

        // Pesquisar número por nome
        String nomePesquisa = "João";
        Integer numeroPesquisa = agendaContatos.pesquisaPorNome("João");
        System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);

        String nomePesquisaNaoExistente = "Paula";
        Integer numeroPesquisaNaoExistente = agendaContatos.pesquisaPorNome(nomePesquisaNaoExistente);
        System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);
    }

}
