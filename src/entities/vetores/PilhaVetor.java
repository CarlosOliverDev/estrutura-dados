package entities.vetores;

public class PilhaVetor {

    private Object[] vetor;
    private int topo = 0;

    public PilhaVetor(int tamanho_maximo) {
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
            System.out.println("Objeto " + novoObjeto + " empilhado.");
            topo++;
        } else {
            System.out.println("A pilha está cheia, desempilhe um objeto antes de empilhar novamente.");
        }
    }

    public void desempilhar() {
        if(!isEmpty()) {
            topo--;
            System.out.println("Objeto " + vetor[topo] + " desempilhado.");
            vetor[topo] = null;
        } else {
            System.out.println("A pilha está vazia, empilhe um objeto para desempilhar.");
        }
    }

    public void imprimirTopo() {
        if(!isEmpty()) {
            System.out.println("O objeto no topo é " + vetor[topo-1]);
        } else {
            System.out.println("A pilha está vazia.");
        }
    }

    public void imprimirQuantidade() {
        if(isEmpty()) {
            System.out.println("A pilha está vazia.");
        } else {
            System.out.printf("A pilha tem %d objetos.\n",topo);
        }
    }

    public void exibirObjetos() {
        if(isEmpty()) {
            System.out.println("A pilha está vazia.");
        } else {
            for(int i =0; i < vetor.length; i++) {
                if(vetor[i] != null) {
                    System.out.println(vetor[i]);
                }
            }
        }
    }

}
