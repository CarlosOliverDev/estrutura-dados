package entities.vetores;

public class ListaVetor {
    private Object[] lista;
    private int tamanhoLista;

    public ListaVetor(int tamanhoLista) {
        this.tamanhoLista = tamanhoLista;
        this.lista = new Object[tamanhoLista];
    }

    public void inserirElemento(Object novoElemento, int indice) {
        if(lista[indice] == null) {
            lista[indice] = novoElemento;
            System.out.printf("\nElemento %s adicionado a lista.",novoElemento);
        } else {
            System.out.println("\nJá existe um elemento nesse índice.");
        }
    }

    public void retirarElemento(int indice) {
        if(lista[indice] == null) {
            System.out.println("\nNão há nenhum elemento nesse índice.");
        } else {
            lista[indice] = null;
            System.out.printf("\nElemento %s retirado da lista.",lista[indice]);
        }
    }

    public void substituirElemento(Object novoElemento, int indice) {
        if(lista[indice] == null) {
            System.out.printf("\nÍndice estava vazio, será adicionado %s nesse índice.",novoElemento);
            inserirElemento(novoElemento, indice);
        } else {
            System.out.printf("\nElemento %s substituído por %s no índice %d.",lista[indice],novoElemento,indice);
        }
    }

    public void imprimirLista() {
        if(isEmpty()) {
            System.out.println("\nLista vazia.");
        } else {
            System.out.println("\nLista:");
            for(int i = 0; i < tamanhoLista; i++) {
                if(lista[i] != null) {
                    System.out.printf("\nElemento | %s | no índice %d encontrado.",lista[i],i);
                }
            }
            System.out.println();
        }
    }

    public void apagarLista() {
        for (int i = 0; i < tamanhoLista; i++) {
            lista[i] = null;
        }
        System.out.println("\nLista apagada.");
    }

    public void verificarVazios() {
        for (int i = 0; i < tamanhoLista; i++) {
            if(lista[i] == null) {
                System.out.printf("\nEspaço vazio encontrado no índice %d.",i);
            }
        }
    }

    private void verificarQuantidade() {
        if(!isEmpty()) {
            int contador = 0;

            for (int i = 0; i < tamanhoLista; i++) {
                if(lista[i] != null) {
                    contador++;
                }
            }

            if(contador == tamanhoLista) {
                System.out.printf("\nLista está cheia. Existem %d elementos.",tamanhoLista);
            } else {
                System.out.printf("\nExistem %d elementos na lista.",contador);
            }
            
        } else {
            System.out.println("\nLista vazia.");
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
