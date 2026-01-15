package application;

import entities.vetores.ListaVetor;

public class ProgramaListaVetor {
    public static void main(String[] args) {
        ListaVetor lista = new ListaVetor(4);

        lista.imprimirLista();
        lista.apagarLista();
        lista.verificarVazios();

        System.out.println();

        lista.inserirElemento("Corinthians", 0);
        lista.inserirElemento("Carlos", 0);
        lista.inserirElemento("Carlos", 1);
        lista.inserirElemento(22, 2);
        lista.inserirElemento(22, 3);

        System.out.println();

        lista.imprimirLista();
        lista.verificarVazios();
        lista.verificarQuantidade();
        lista.aumentarTamanhoLista();

        System.out.println();

        lista.substituirElemento(1459123.123, 2);

        System.out.println();

        lista.retirarElemento(3);
        lista.retirarElemento(2);
        lista.retirarElemento(5);

        System.out.println();

        lista.imprimirLista();
        lista.verificarVazios();
        lista.verificarQuantidade();

        System.out.println();

        lista.apagarLista();
        lista.imprimirLista();
        lista.verificarVazios();

    }
}
