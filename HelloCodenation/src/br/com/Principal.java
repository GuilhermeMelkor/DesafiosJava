package br.com;


import br.com.tarefas.ListaTarefas;
import br.com.tarefas.Tarefa;

public class Principal {

    public static void main(String[] args){


        Tasks();


    }

    private static void Tasks() {
        System.out.println("Minhas Tarefas");
        System.out.println("-********************-");
        //ArrayTarefas tarefas= new ArrayTarefas(3);

        ListaTarefas tarefas = new ListaTarefas();

        Tarefa tarefa1 = new Tarefa("Regar as Plantas");
        Tarefa tarefa2 = new Tarefa("Trabalhar");
        Tarefa tarefa3 = new Tarefa("Regar as Plantas");

        tarefas.adicionar(tarefa1);
        tarefas.adicionar(tarefa2);
        tarefas.adicionar(tarefa3);
        //tarefas.exibirTarefas();
        System.out.println("-********************-");
        //tarefas.remover(2);
        //tarefas.exibirTarefas();
        Tarefa task = tarefas.buscar("Trabalhar");
        task.exibirTarefa();
    }
}
