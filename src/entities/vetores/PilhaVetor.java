package entities.vetores;

public class PilhaVetor {

    private Object[] vetor;
    private int topo = 0;

    PilhaVetor(int tamanho_maximo) {
        this.vetor = new Object[tamanho_maximo];
    }

    public boolean isEmpty() {
        return topo == 0;
    }
    public boolean isFull() {
        return topo == vetor.length;
    }

    public void empilhar(Object novoObjeto) {
        if(!isFull()) {
            vetor[topo] = novoObjeto;
            topo++;
        } else {
            System.out.println("\nA pilha está cheia, desempilhe um objeto antes de empilhar novamente.");
        }
    }

    public void desempilhar() {
        if(!isEmpty()) {
            System.out.println("\nObjeto " + vetor[topo] + " desempilhado.");
            vetor[topo] = null;
            topo--;
        } else {
            System.out.println("\nA pilha está vazia, empilhe um objeto para desempilhar.");
        }
    }

    public void imprimirTopo() {
        if(!isEmpty()) {
            System.out.println("\nO objeto no topo é " + vetor[topo]);
        } else {
            System.out.println("\nA pilha está vazia.");
        }
    }

    public void imprimirQuantidade() {
        if(isEmpty()) {
            System.out.println("\nA pilha está vazia.");
        } else {
            System.out.printf("\nA pilha tem %d objetos.",topo);
        }
    }

    public void exibirObjetos() {
        if(isEmpty()) {
            System.out.println("\nA pilha está vazia.");
        } else {
            for(int i =0; i < vetor.length; i++) {
                if(vetor[i] != null) {
                    System.out.println("\n" + vetor[i]);
                }
            }
        }
    }

}
