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
        if(cabeca == null) {
            addInicio(valor);
            return;
        }

        No novo = new No(valor);
        No atual = cabeca;

        while(atual.proximo != null) {
            atual = atual.proximo;
        }

        atual.proximo = novo;
    }

    public void removerInicio() {
        if(cabeca == null) {
            System.out.println("Lista vazia.");
            return;
        }
        System.out.println("Elemento "+ cabeca.valor+" excluído.");
        cabeca = cabeca.proximo;
    }

    public void removerMeio(int posicao) {
        if(posicao < 0) {
            System.out.println("Posição inválida. Tente uma posição maior que 0.");
            return;
        } else if(posicao == 0) {
            removerInicio();
            return;
        }

        int contador = 1;
        No atual = cabeca;
        while(contador != posicao) {
            contador++;
            atual = atual.proximo;

            if(atual.proximo == null) {
                System.out.println("A lista é menor do que a posição desejada.");
                return;
            }
        }
        System.out.println("Elemento "+ atual.proximo.valor +" excluído.");
        atual.proximo = atual.proximo.proximo;
    }

    public void removerFim() {
        if(cabeca == null) {
            System.out.println("Lista vazia.");
            return;
        }
        if(cabeca.proximo == null) {
            removerInicio();
            return;
        }

        No atual = cabeca;
        while(atual.proximo.proximo != null) {
            atual = atual.proximo;
        }
        System.out.println("Elemento "+ atual.proximo.valor +" excluído.");
        atual.proximo = null;
    }

    public void imprimirQuantidade() {
        No atual = cabeca;
        int contador = 0;

        while(atual != null) {
            contador ++;
            atual = atual.proximo;
        }

        if(contador == 0) {
            System.out.println("Lista vazia.");
        } else {
            System.out.println("A lista encadeada tem " + contador + " elemento(s).");
        }
    }

    public void imprimirLista() {
        No atual = cabeca;
        while(atual != null) {
            System.out.print(atual.valor + " --> ");
            atual = atual.proximo;
        }
        System.out.println("Null.");
    }
}
