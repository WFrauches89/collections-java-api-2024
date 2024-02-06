package com.meuscursos.main.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefa {

    Set<Tarefa> tarefaSet;

    public ListaTarefa() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        if (!tarefaSet.isEmpty()) {
            tarefaSet.removeIf(t -> t.getDescricao().equalsIgnoreCase(descricao));
        } else {
            System.out.println("O conjunto está vazio");
        }
    }

    public void exibirTarefas() {
        if (!tarefaSet.isEmpty()) {
            System.out.println(tarefaSet);
        } else System.out.println("Tarefa não encontrada!");
    }

    public int contarTarefas () {
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> listTarefaConcluida = new HashSet<>();
        if(!tarefaSet.isEmpty()) {
            for(Tarefa t : tarefaSet){
                if(t.getRealizado()) {
                    listTarefaConcluida.add(t);
                }
            }
        }
        return listTarefaConcluida;
    }

    public Set<Tarefa> obterTarefasNaoConcluidas() {
        Set<Tarefa> listTarefaNaoConcluida = new HashSet<>();
        if(!tarefaSet.isEmpty()) {
            for(Tarefa t : tarefaSet){
                if(!t.getRealizado()) {
                    listTarefaNaoConcluida.add(t);
                }
            }
        }
        return listTarefaNaoConcluida;
    }

    public void marcarTarefaConcluida(String descricao){
        if(!tarefaSet.isEmpty()){
            for(Tarefa t: tarefaSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setRealizado(true);
                }
            }
        }
    }


    public void marcarTarefaPendente(String descricao){
        if(!tarefaSet.isEmpty()){
            for(Tarefa t: tarefaSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setRealizado(false);
                }
            }
        }
    }

    public Set<Tarefa> limparListaTarefas() {
        if(!tarefaSet.isEmpty()){
            tarefaSet.clear();
        }
        return tarefaSet;
    }



    public static void main(String[] args) {
        ListaTarefa lT = new ListaTarefa();

        //System.out.println("Lista de tarefas: "+lT.exibirTarefas());

        lT.adicionarTarefa("Varrer");
        lT.adicionarTarefa("Lavar");
        lT.adicionarTarefa("Limpar");
        lT.adicionarTarefa("Comer");
        lT.adicionarTarefa("Beber");
        lT.adicionarTarefa("Subir");
        lT.adicionarTarefa("Descer");
        lT.adicionarTarefa("Nadar");

        System.out.println("Lista de tarefas: " );
        lT.exibirTarefas();

        System.out.println("Tarefas na lista: "+lT.contarTarefas());

        System.out.println("Lista de tarefas concluídas: "+lT.obterTarefasConcluidas());

        System.out.println("Lista de tarefas não concluídas: "+lT.obterTarefasNaoConcluidas());

        lT.marcarTarefaConcluida("descer");
        lT.marcarTarefaConcluida("Varrer");
        lT.marcarTarefaConcluida("nadar");

        System.out.println("Lista de tarefas concluídas: "+lT.obterTarefasConcluidas());

        System.out.println("Lista de tarefas não concluídas: "+lT.obterTarefasNaoConcluidas());

        lT.marcarTarefaPendente("varrer");

        System.out.println("Lista de tarefas concluídas: "+lT.obterTarefasConcluidas());

        System.out.println("Lista de tarefas não concluídas: "+lT.obterTarefasNaoConcluidas());

        lT.limparListaTarefas();
        System.out.println("Lista de tarefas após limpar: ");
        lT.exibirTarefas();

        System.out.println("Tarefas na lista: " + lT.contarTarefas());
    }
}
