package br.com.tarefas;

import java.util.ArrayList;

public class ListaTarefas {
    ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void adicionar(Tarefa tarefa){
        if(tarefa != null && tarefa.obterTamanhoTarefa() <= 20){
            tarefas.add(tarefa);}
        else{
            System.out.println("A tarefa é invalida");
        }
    }

    public void adicionar(String descricao){
       Tarefa tarefa = new Tarefa(descricao);
       adicionar(tarefa);
    }
    public void remover(int pos){
        if(pos < tarefas.size()){
            tarefas.remove(pos);
        }else{
            System.out.println("Tarefa não existe");
        }
    }
    public void remover(Tarefa tarefa){
        tarefas.remove(tarefa);
    }
    public Tarefa buscar(String descricao){
        for(Tarefa tarefa : tarefas){
            if (descricao.equals(tarefa.descricao)){
                 return tarefa;
            }
        }
        return null;
    }

    public void exibirTarefas(){
        for(Tarefa tarefa :tarefas){
            tarefa.exibirTarefa();
        }
    }
}
