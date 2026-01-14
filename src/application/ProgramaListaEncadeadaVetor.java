package application;

import entities.vetores.ListaEncadeadaVetor;

public class ProgramaListaEncadeadaVetor {
    public static void main(String[] args) {
        ListaEncadeadaVetor lista = new ListaEncadeadaVetor();

        System.out.println("Testando os métodos de impressão com a lista encadeada vazia:");

        lista.imprimirLista();
        lista.imprimirQuantidade();
        System.out.println();

        System.out.println("Testando a inserção de novos elementos no início da lista:");
        lista.addInicio(10);
        lista.addInicio(20);
        lista.addInicio(30);

        lista.imprimirLista();
        lista.imprimirQuantidade();
        System.out.println();

        System.out.println("Testando a inserção de novos elementos com posições específicas do usuário:");
        lista.addMeio(50, 2);
        lista.addMeio(60, 7);
        lista.addMeio(40, 0);

        lista.imprimirLista();
        lista.imprimirQuantidade();
        System.out.println();

        System.out.println("Testando a inserção de um novo elemento no fim da lista:");
        lista.addFim(70);

        lista.imprimirLista();
        lista.imprimirQuantidade();
        System.out.println();

        System.out.println("Testando a remoção de elementos no fim e início da lista:");
        lista.removerInicio();
        lista.removerFim();

        lista.imprimirLista();
        lista.imprimirQuantidade();
        System.out.println();

        System.out.println("Testando a remoção de elementos com posições específicas do usuário:");
        lista.removerMeio(2);
        lista.removerMeio(4);

        lista.imprimirLista();
        lista.imprimirQuantidade();
    }
}
