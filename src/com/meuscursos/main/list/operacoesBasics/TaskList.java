package com.meuscursos.main.list.operacoesBasics;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private List<Task> taskList;

    public TaskList() {
        this.taskList = new ArrayList<>();
    }

    public void addTask(String description) {
        taskList.add(new Task(description));
    }

    public void removeTask(String description) {
        List<Task> removeTaskList = new ArrayList<>();

        for(Task t : taskList) {
            if(t.getDescription().equalsIgnoreCase(description)) {
                removeTaskList.add(t);
            }
        }
        taskList.removeAll(removeTaskList);
    }

    public int getTotalTasks() {
        return taskList.size();
    }

    public void getTasksDescriptions() {
        System.out.println(taskList);
    }

    public static void main(String[] args) {
        TaskList taskList = new TaskList();

        System.out.println("Total elementos da lista: " + taskList.getTotalTasks());

        taskList.addTask("Tarefa 1");
        taskList.addTask("Tarefa 2");
        taskList.addTask("Tarefa 3");
        taskList.addTask("Tarefa 4");
        taskList.addTask("Tarefa 4");
        taskList.addTask("Tarefa 5");
        taskList.addTask("Tarefa 4");
        System.out.println("Total elementos da lista: " + taskList.getTotalTasks());

        //taskList.removeTask("Tarefa 4");
        System.out.println("Total elementos da lista: " + taskList.getTotalTasks());

        taskList.getTasksDescriptions();
    }

}
