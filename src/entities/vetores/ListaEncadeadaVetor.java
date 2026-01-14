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

    public void addMeio(int valor, int posicao) {
        if(posicao < 0) {
            System.out.println("Posição inválida. Tente uma posição maior que 0.");
            return;
        } else if(posicao == 0) {
            addInicio(valor);
            return;
        }

        int contador = 1;
        No novo = new No(valor);
        No atual = cabeca;

        while(atual.proximo != null && contador < posicao) {
            atual = atual.proximo;
            contador++;
        }

        novo.proximo = atual.proximo;
        atual.proximo = novo;
    }

    public void addFim(int valor) {
        No novo = new No(valor);
        No atual = cabeca;

        while(atual.proximo != null) {
            atual = atual.proximo;
        }

        atual.proximo = novo;
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
