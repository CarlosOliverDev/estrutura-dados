package entities.vetores;

public class PilhaVetor {
    private Object[] pilha;
    private int topo = 0;
    private int tamanhoMaximo;

    public PilhaVetor(int tamanho) {
        this.pilha = new Object[tamanho];
        this.tamanhoMaximo = tamanho;
    }

    public void empilhar(Object novoObjeto) {
        if(!isFull()) {
            pilha[topo] = novoObjeto;
            System.out.println("Objeto " + novoObjeto + " empilhado.");
            topo++;
        } else {
            aumentarTamanhoPilha();
            System.out.printf("Aumentando tamanho da pilha para %d.\n",tamanhoMaximo);
            empilhar(novoObjeto);
        }
    }

    public void desempilhar() {
        if(!isEmpty()) {
            topo--;
            System.out.println("Objeto " + pilha[topo] + " desempilhado.");
            pilha[topo] = null;
        } else {
            System.out.println("A pilha está vazia, empilhe um objeto para desempilhar.");
        }
    }

    public void imprimirTopo() {
        if(!isEmpty()) {
            System.out.println("O objeto no topo é " + pilha[topo-1]);
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

    private void aumentarTamanhoPilha() {
        tamanhoMaximo *= 2;
        Object[] novaPilha = new Object[tamanhoMaximo];

        for(int i = 0; i< pilha.length; i++) {
            novaPilha[i] = pilha[i];
        }

        pilha = novaPilha;
    }

    public void exibirObjetos() {
        if(isEmpty()) {
            System.out.println("A pilha está vazia.");
        } else {
            for(int i = 0; i < pilha.length; i++) {
                if(pilha[i] != null) {
                    System.out.println(pilha[i]);
                }
            }
        }
    }

    private boolean isEmpty() {
        return topo == 0;
    }

    private boolean isFull() {
        return topo == tamanhoMaximo;
    }
}
