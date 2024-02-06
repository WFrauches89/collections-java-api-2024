package com.meuscursos.main.map.pesquisa;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Eventos> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void addEvento(LocalDate data, String nome, String descricao){
        eventosMap.put(data,new Eventos(nome,descricao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Eventos> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void proximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Eventos> eventosTreeMap = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate, Eventos> entry : eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O proximo evento é: "+ entry.getValue()+"no dia "+entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos aE = new AgendaEventos();

        aE.addEvento(LocalDate.of(2024, Month.FEBRUARY,8),"Evento 1", "Atraçao 1");
        aE.addEvento(LocalDate.of(2024, 5,9),"Evento 2", "Atraçao 2");
        aE.addEvento(LocalDate.of(2020, Month.FEBRUARY,11),"Evento 3", "Atraçao 3");
        aE.addEvento(LocalDate.of(2024, Month.FEBRUARY,6),"Evento 4", "Atraçao 4");

        aE.exibirAgenda();

        aE.proximoEvento();

    }


}
