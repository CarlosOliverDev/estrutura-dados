package entities.sort;

public class MergeSort {
    public MergeSort(int[] array) {
        mergesort(array);
    }

    public void mergesort(int[] array) {
        if(array.length < 2) {
            return;
        }

        int meio = array.length/2;

        int[] esquerdo = new int[meio];
        int[] direito = new int[array.length - meio];

        for(int i = 0; i < meio; i++) {
            esquerdo[i] = array[i];
        }
        for(int i = meio; i < array.length; i++) {
            direito[i - meio] = array[i];
        }

        mergesort(esquerdo);
        mergesort(direito);

        merge(array, esquerdo, direito);
    }

    public void merge(int[] array, int[] esquerdo, int[] direito) {
        int indiceArray = 0;
        int indiceEsquerdo = 0;
        int indiceDireito = 0;

        while(indiceEsquerdo < esquerdo.length && indiceDireito < direito.length) {
            if(esquerdo[indiceEsquerdo] <= direito[indiceDireito]) {
                array[indiceArray] = esquerdo[indiceEsquerdo];
                indiceArray++;
                indiceEsquerdo++;
            } else {
                array[indiceArray] = direito[indiceDireito];
                indiceArray++;
                indiceDireito++;
            }
        }

        while(indiceEsquerdo < esquerdo.length) {
            array[indiceArray] = esquerdo[indiceEsquerdo];
            indiceArray++;
            indiceEsquerdo++;
        }

        while(indiceDireito < direito.length) {
            array[indiceArray] = direito[indiceDireito];
            indiceArray++;
            indiceDireito++;
        }
    }
}
