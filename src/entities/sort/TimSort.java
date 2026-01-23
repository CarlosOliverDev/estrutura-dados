package entities.sort;

public class TimSort {
    public TimSort(int[] array) {
        timSort(array);
    }

    public void timSort(int[] array) {
        if(array.length <= 4) {
            insertionSort(array);
        } else {
            int metade = array.length/2;
            int[] esquerdo = new int[metade];
            int[] direito = new int[array.length - metade];

            for(int i = 0; i < metade; i++) {
                esquerdo[i] = array[i];
            }
            for(int i = metade; i < array.length; i++) {
                direito[i-metade] = array[i];
            }

            timSort(esquerdo);
            timSort(direito);

            merge(array, esquerdo, direito);
        }
    }

    public void merge(int[] array, int[] esquerdo, int[]direito) {
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

    public void insertionSort(int[] array) {
        for(int i = 1; i < array.length; i++) {
            int elementoASerOrdenado = array[i];
            int j = i-1;
            while(j >=0 && elementoASerOrdenado < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = elementoASerOrdenado;
        }
    }
}
