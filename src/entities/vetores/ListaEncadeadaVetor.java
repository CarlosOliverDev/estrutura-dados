package entities.vetores;

public class ListaEncadeadaVetor {
    private No cabeca;

    public ListaEncadeadaVetor() {
        this.cabeca = null;
    }

    public void addInicio(int valor) {
        No novo = new No(valor);
        novo.proximo = cabeca;
        cabeca = novo;
    }

    public void imprimirLista() {
        No atual = cabeca;

        while(atual != null) {
            System.out.print(atual.valor + " --> ");
            atual = atual.proximo;
        }
        System.out.println("null.");
    }
}
