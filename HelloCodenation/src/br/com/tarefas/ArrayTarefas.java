package br.com.tarefas;

public class ArrayTarefas {

    Tarefa[] tarefas;
    int contador=0;
    public ArrayTarefas (int tamanho){
        this.tarefas = new Tarefa[tamanho];
    }

    public void adicionar(Tarefa tarefa){
            tarefas[contador] = tarefa;
            contador++;
    }

    public void remover(int posicao){
        tarefas[posicao]= null;
    }

    public void exibirTarefas(){
        for(Tarefa tarefa :tarefas){
            tarefa.exibirTarefa();
        }

    }

}
