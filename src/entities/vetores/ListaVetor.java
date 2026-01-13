package entities.vetores;

public class ListaVetor {
    private Object[] lista;
    private int tamanhoLista;

    public ListaVetor(int tamanhoLista) {
        this.tamanhoLista = tamanhoLista;
        this.lista = new Object[tamanhoLista];
    }

    public void inserirElemento(Object novoElemento, int indice) {
        if(indice >= tamanhoLista) {
            System.out.println("Número de índice incompatível com o tamanho da lista.");
            return;
        }
        if(lista[indice] == null) {
            lista[indice] = novoElemento;
            System.out.printf("Elemento %s adicionado no índice %d da lista.\n",novoElemento, indice);
        } else {
            System.out.printf("Já existe um elemento no índice %d.\n", indice);
        }
    }

    public void retirarElemento(int indice) {
        if(indice >= tamanhoLista) {
            System.out.println("Número de índice incompatível com o tamanho da lista.");
            return;
        }
        if(lista[indice] == null) {
            System.out.println("Não há nenhum elemento nesse índice.");
        } else {
            System.out.printf("Elemento %s retirado da lista.\n",lista[indice]);
            lista[indice] = null;
        }
    }

    public void substituirElemento(Object novoElemento, int indice) {
        if(indice >= tamanhoLista) {
            System.out.println("Número de índice incompatível com o tamanho da lista.");
            return;
        }
        if(lista[indice] == null) {
            System.out.printf("Índice estava vazio, %s será adicionado nesse índice.\n",novoElemento);
            inserirElemento(novoElemento, indice);
        } else {
            System.out.printf("Elemento | %s | substituído por %s no índice %d.\n",lista[indice],novoElemento,indice);
        }
    }

    public void imprimirLista() {
        if(isEmpty()) {
            System.out.println("Lista vazia.");
        } else {
            System.out.println("Lista:");
            for(int i = 0; i < tamanhoLista; i++) {
                if(lista[i] != null) {
                    System.out.printf("| %s | Índice %d.\n",lista[i],i);
                }
            }
            System.out.println();
        }
    }

    public void apagarLista() {
        for (int i = 0; i < tamanhoLista; i++) {
            lista[i] = null;
        }
        System.out.println("Lista apagada.");
    }

    public void verificarVazios() {
        if(isEmpty()) {
            System.out.println("Lista vazia.");
        } else {
            int contador = 0;
            for (int i = 0; i < tamanhoLista; i++) {
                if(lista[i] == null) {
                    System.out.printf("Espaço vazio encontrado no índice %d.\n",i);
                    contador++;
                }
            }
            if(contador == 0) {
                System.out.println("Não há vazios na lista.");
            }
        }
    }

    public void verificarQuantidade() {
        if(!isEmpty()) {
            int contador = 0;

            for (int i = 0; i < tamanhoLista; i++) {
                if(lista[i] != null) {
                    contador++;
                }
            }

            if(contador == tamanhoLista) {
                System.out.printf("Lista está cheia. Existem %d elementos.\n",tamanhoLista);
            } else {
                System.out.printf("Existem %d elementos na lista.\n",contador);
            }

        } else {
            System.out.println("Lista vazia.");
        }
    }

    private boolean isEmpty() {
        for(int i = 0; i < tamanhoLista; i++) {
            if(lista[i] != null) {
                return false;
            }
        }
        return true;
    }
}
