package application;

import entities.vetores.FilaInfinitaVetor;

public class ProgramaFilaInfinita {
    public static void main(String[] args) {
        System.out.println("Instanciada fila de tamanho 4:");

        FilaInfinitaVetor fila = new FilaInfinitaVetor(4);

        fila.imprimirFila();
        fila.imprimirQuantidade();

        System.out.println("\nAdicionado 4 itens a fila: ");

        fila.addFila(1);
        fila.addFila(2);
        fila.addFila(3);
        fila.addFila(4);

        fila.imprimirFila();
        fila.imprimirQuantidade();

        System.out.println("\nRemovido 1 item da fila:");

        fila.removeFila();

        fila.imprimirFila();
        fila.imprimirQuantidade();

        System.out.println("\nExcedendo o tamanho total da fila:");

        fila.addFila(5);
        fila.addFila(6);
        fila.addFila(7);
        fila.addFila(8);
        fila.addFila(9);
        fila.addFila(10);

        fila.imprimirFila();
        fila.imprimirQuantidade();
    }
}
