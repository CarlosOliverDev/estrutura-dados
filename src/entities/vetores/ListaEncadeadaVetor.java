package entities.vetores;

public class ListaEncadeadaVetor {
    private No cabeca;

    public ListaEncadeadaVetor() {
        this.cabeca = null;
    }

    public void addInicio(int valor) {
        No novo = new No(valor);
        novo.proximo = cabeca.proximo;
        cabeca = novo;
    }
}
