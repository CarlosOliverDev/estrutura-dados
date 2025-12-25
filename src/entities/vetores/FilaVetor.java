package entities.vetores;

public class FilaVetor {
    private Object[] fila;
    private int inicio = 0;
    private int fim = 0;
    private int tamanhoTotal = 0;

    public FilaVetor(int tamanhoVetor) {
        this.tamanhoTotal = tamanhoVetor;
        this.fila = new Object[tamanhoTotal];
    }

    public void adicionarFila(Object novoItem) {
        if(!isFull()) {
            System.out.printf("Item %s adicionado à fila.\n", novoItem);
            fila[fim%tamanhoTotal] = novoItem;
            fim++;
        } else {
            System.out.println("Fila está cheia, por favor, retire um item antes de inserir novamente.");
        }
    }

    public void retirarFila() {
        if(!isEmpty()) {
            System.out.printf("Item %s retirado da fila.\n",fila[inicio%tamanhoTotal]);
            fila[inicio%tamanhoTotal] = null;
            inicio++;
        } else {
            System.out.println("Fila vazia.");
        }
    }

    public void verificarQuantidade() {
        if(isEmpty()) {
            System.out.println("Fila vazia. Não é possível verificar a quantidade.");
        } else if((fim - inicio) == 1) {
            System.out.println("A fila tem 1 item.");
        } else {
            System.out.printf("A fila tem %d itens.\n",(fim - inicio));
        }
    }

    public void imprimirFila() {
        if(isEmpty()) {
            System.out.println("Fila vazia. Não é possível imprimir a fila.");
        } else {
            System.out.println("Itens da fila:");
            for(int i = 0; i < tamanhoTotal; i++) {
                System.out.printf("%s\n",fila[(inicio + i) % tamanhoTotal]);
            }
        }
    }

    private boolean isEmpty() {
        return inicio == fim;
    }

    private boolean isFull() {
        return fim - inicio == tamanhoTotal;
    }
}
