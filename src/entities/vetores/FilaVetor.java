package entities.vetores;

public class FilaVetor {
    Object[] fila;
    int inicio = 0;
    int fim = 0;
    int tamanhoTotal = 0;

    public FilaVetor(int tamanhoVetor) {
        this.tamanhoTotal = tamanhoVetor;
        this.fila = new Object[tamanhoTotal];
    }

    public void adicionarFila(Object novoItem) {
        if(!isFull()) {
            System.out.printf("\nItem %s adicionado à fila.", novoItem);
            fila[fim%tamanhoTotal] = novoItem;
            fim++;
        } else {
            System.out.println("\nFila está cheia, por favor, retire um item antes de inserir novamente.");
        }
    }

    public void retirarFila() {
        if(!isEmpty()) {
            System.out.printf("\nItem %s retirado da fila.",fila[inicio%tamanhoTotal]);
            fila[inicio%tamanhoTotal] = null;
            inicio++;
        } else {
            System.out.println("\nFila vazia.");
        }
    }

    public void verificarQuantidade() {
        if(isEmpty()) {
            System.out.println("\nFila vazia. Não é possível verificar a quantidade.");
        } else if((fim - inicio) == 1) {
            System.out.println("\nA fila tem 1 item.");
        } else {
            System.out.printf("\nA fila tem %d itens.",(fim - inicio));
        }
    }

    public void imprimirFila() {
        if(isEmpty()) {
            System.out.println("\nFila vazia. Não é possível imprimir a fila.");
        } else {
            System.out.println("\nItens da fila:");
            for(int i = 0; i < tamanhoTotal; i++) {
                System.out.printf("\n%s",fila[(inicio + i) % tamanhoTotal]);
            }
        }
    }

    public boolean isEmpty() {
        return inicio == fim;
    }

    public boolean isFull() {
        return fim - inicio == fila.length;
    }
}
