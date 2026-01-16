package application.vetores;

import entities.vetores.PilhaVetor;

public class ProgramaPilhaVetor {
    public static void main(String[] args) {
        int tamanhoPilha = 5;

        PilhaVetor pilha = new PilhaVetor(tamanhoPilha);

        pilha.imprimirTopo();
        pilha.imprimirQuantidade();
        pilha.exibirObjetos();

        System.out.println();

        pilha.empilhar("Carlos");
        pilha.empilhar("Oliveira");
        pilha.empilhar(22);
        pilha.empilhar(1.65);
        pilha.empilhar(false);
        pilha.empilhar(true);
        pilha.empilhar(false);
        pilha.empilhar(98);

        System.out.println();

        pilha.imprimirTopo();
        pilha.imprimirQuantidade();
        pilha.exibirObjetos();

        System.out.println();

        pilha.desempilhar();
        pilha.desempilhar();
        pilha.desempilhar();

        System.out.println();

        pilha.imprimirTopo();
        pilha.imprimirQuantidade();
        pilha.exibirObjetos();
    }
}
