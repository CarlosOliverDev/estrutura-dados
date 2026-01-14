package application;

import entities.vetores.FilaCircularVetor;

public class ProgramaFilaVetor {
    public static void main(String[] args) {
        FilaCircularVetor fila = new FilaCircularVetor(5);

        fila.retirarFila();
        fila.imprimirFila();
        fila.verificarQuantidade();

        System.out.println();

        fila.adicionarFila("Carlos");
        fila.adicionarFila(22);
        fila.adicionarFila("389");
        fila.adicionarFila("Desenvolvedor Web");
        fila.adicionarFila('O');

        fila.adicionarFila(213.653453);

        System.out.println();

        fila.verificarQuantidade();
        fila.imprimirFila();

        System.out.println();

        fila.retirarFila();

        fila.adicionarFila(213.653453);
        fila.adicionarFila(false);

        System.out.println();

        fila.verificarQuantidade();
        fila.imprimirFila();

        System.out.println();

        fila.retirarFila();
        fila.retirarFila();

        System.out.println();

        fila.adicionarFila(false);
        fila.adicionarFila(true);

        System.out.println();

        fila.verificarQuantidade();
        fila.imprimirFila();

        System.out.println();
        
        fila.retirarFila();
        fila.retirarFila();
        fila.retirarFila();
        fila.retirarFila();
        fila.retirarFila();

        System.out.println();

        fila.verificarQuantidade();
        fila.imprimirFila();
    }
}
