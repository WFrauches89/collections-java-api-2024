package com.meuscursos.main.map.basic;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void addPalavra ( String palavra, String descricao){
        dicionarioMap.put(palavra, descricao);
    }

    public void removePalavra (String palavra) {
        dicionarioMap.remove(palavra);
    }

    public void exibirPalavras () {

        if(!dicionarioMap.isEmpty()){
            System.out.println(dicionarioMap);
        } else {
            System.out.println("Dicionário vazio..");
        }
    }

    public String pesquisaPalavra (String palavra) {
        String palavraPesquisada = null;
        if(!dicionarioMap.isEmpty()){
           palavraPesquisada = dicionarioMap.get(palavra);
        }
        if(palavraPesquisada == null){
            System.out.println(" A palavra buscada não foi encontrada na lista...");
        } else {
            System.out.println("Siginificado da palavra - "+palavra+": ");
        }
        return palavraPesquisada;
    }


    public static void main(String[] args) {
        Dicionario dc = new Dicionario();
        dc.addPalavra("Hello", "A common greeting used to address someone.");
        dc.addPalavra("Goodbye","A parting phrase used to bid farewell to someone.");
        dc.addPalavra("Love","An intense feeling of deep affection.");
        dc.addPalavra("Friend", "A person with whom one has a bond of mutual affection.");
        dc.addPalavra("Family", "A group consisting of parents and children living together in a household.");
        dc.addPalavra("Work", "Activity involving mental or physical effort done in order to achieve a purpose or result.");
        dc.addPalavra("Time", "The indefinite continued progress of existence and events in the past, present, and future regarded as a whole.");
        dc.addPalavra("Day","The time between sunrise and sunset; a period of 24 hours.");
        dc.addPalavra("Water","A transparent, odorless, tasteless liquid that forms the seas, lakes, rivers, and rain.\n");
        dc.addPalavra("Food","Any nutritious substance that people or animals eat or drink or that plants absorb in order to maintain life and growth.");
        dc.addPalavra("Bite the bullet","To endure a painful or difficult situation with courage and resilience.");
        dc.addPalavra("Hit the nail on the head","To describe exactly what is causing a situation or problem.");
        dc.addPalavra("Jump on the bandwagon","To join or support something that is already popular or successful.");
        dc.addPalavra("Cut to the chase","To get to the main point or important part of something without wasting time.");
        dc.addPalavra("Turn a blind eye","To ignore or pretend not to notice something, especially something unethical or wrong.");
        dc.addPalavra("Throw in the towel","To give up or surrender; to admit defeat.");
        dc.addPalavra("Burn the midnight oil","To work late into the night; to put in extra effort and time to complete a task.");
        dc.addPalavra("Break the ice","To initiate a conversation or interaction in a social situation to relieve tension or awkwardness.");
        dc.addPalavra("Cost an arm and a leg","To be very expensive; to cost a lot of money.");
        dc.addPalavra("Kick the bucket","a colloquial and somewhat humorous way of referring to someone's death.");

        dc.exibirPalavras();

        String definicaoA = dc.pesquisaPalavra("Bite the bullet");
        System.out.println(definicaoA);

        String definicaoB = dc.pesquisaPalavra("Jump on the bandwagon");
        System.out.println(definicaoB);

        dc.exibirPalavras();

        dc.removePalavra("Hello");

        dc.exibirPalavras();

    }

}
