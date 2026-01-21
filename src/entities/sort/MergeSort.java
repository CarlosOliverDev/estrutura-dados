package entities.sort;

public class MergeSort {
    public MergeSort(int[] array) {
        mergesort(array, array.length);
    }

    public void mergesort(int[] array, int tamanho) {
        if(tamanho < 2) {
            return;
        }
        int meio = tamanho/2;

        int[] esquerdo = new int[meio];
        int[] direito = new int[tamanho - meio];

        for(int i = 0; i < meio; i++) {
            esquerdo[i] = array[i];
        }
        for(int i = meio; i < tamanho; i++) {
            direito[i - meio] = array[i];
        }

        mergesort(esquerdo, meio);
        mergesort(direito, tamanho-meio);

        merge(array, esquerdo, meio, direito, tamanho-meio);
    }

    public void merge(int[] array, int[] esquerdo, int tamanhoEsquerdo, int[] direito, int tamanhoDireito ) {
        int indiceEsquerdo = 0;
        int indiceDireito = 0;
        int indiceArray = 0;

        while(indiceEsquerdo < tamanhoEsquerdo && indiceDireito < tamanhoDireito) {
            if(esquerdo[indiceEsquerdo] < direito[indiceDireito]) {
                array[indiceArray] = esquerdo[indiceEsquerdo];
                indiceArray++;
                indiceEsquerdo++;
            } else if(esquerdo[indiceEsquerdo] > direito[indiceDireito]) {
                array[indiceArray] = direito[indiceDireito];
                indiceArray++;
                indiceDireito++;
            }
        }

        while(indiceEsquerdo < tamanhoEsquerdo) {
            array[indiceArray] = esquerdo[indiceEsquerdo];
            indiceArray++;
            indiceEsquerdo++;
        }

        while(indiceDireito < tamanhoDireito) {
            array[indiceArray] = direito[indiceDireito];
            indiceArray++;
            indiceDireito++;
        }
    }

}
