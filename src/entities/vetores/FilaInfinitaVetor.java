package entities.vetores;

public class FilaInfinitaVetor {
    private Object[] fila;
    private int tamanhoTotal;
    private int inicio = 0;
    private int fim = 0;

    public FilaInfinitaVetor(int tamanhoTotal) {
        this.tamanhoTotal = tamanhoTotal;
        this.fila = new Object[tamanhoTotal];
    }

    public void addFila(Object item) {
        if(fim == tamanhoTotal) {
            aumentarFila();
            System.out.printf("O tamanho da fila aumentou para %d.\n",tamanhoTotal);
        }

        fila[fim] = item;
        System.out.printf("O item %s foi inserido na fila.\n",item);
        fim++;
    }

    public void removeFila() {
        if(isEmpty()) {
            System.out.println("Fila vazia, adicione um item antes de retirar.");
        } else {
            System.out.printf("O item %s foi retirado da fila.\n",fila[inicio]);
            inicio++;
        }
    }

    private void aumentarFila() {
        Object[] aux = fila;
        tamanhoTotal *= 2;
        fila = new Object[tamanhoTotal];

        for (int i = 0; i < aux.length; i++) {
            fila[i] = aux[i];
        }
    }

    public void imprimirFila() {
        if(isEmpty()) {
            System.out.println("Fila vazia.");
        } else {
            System.out.println("Fila:");
            for (int i = inicio; i < tamanhoTotal; i++) {
                if(fila[i] != null)
                    System.out.printf("-%s\n",fila[i]);
            }
        }
    }

    public void imprimirQuantidade() {
        if(isEmpty()) {
            System.out.println("Fila vazia.");
        } else {
            System.out.printf("A fila tem %d elemento(s).\n",(fim-inicio));
        }
    }

    private boolean isEmpty() {
        if(inicio == fim) {
            return true;
        } else {
            return false;
        }
    }
}
