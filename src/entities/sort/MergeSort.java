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

        int[] esquerda = new int[meio];
        int[] direita = new int[array.length - meio];

        for(int i = 0; i < meio; i++) {
            esquerda[i] = array[i];
        }
        for(int i = meio; i < array.length; i++) {
            direita[i-meio] = array[i];
        }

        mergesort(esquerda);
        mergesort(direita);

        merge(array, esquerda, direita);
    }

    public void merge(int[] array, int[]esquerda, int[]direita) {
        int indiceArray = 0;
        int indiceEsquerda = 0;
        int indiceDireita = 0;

        while(indiceEsquerda < esquerda.length && indiceDireita < direita.length) {
            if(esquerda[indiceEsquerda] <= direita[indiceDireita]) {
                array[indiceArray] = esquerda[indiceEsquerda];
                indiceArray++;
                indiceEsquerda++;
            } else {
                array[indiceArray] = direita[indiceDireita];
                indiceArray++;
                indiceDireita++;
            }
        }

        while(indiceEsquerda < esquerda.length) {
            array[indiceArray] = esquerda[indiceEsquerda];
            indiceArray++;
            indiceEsquerda++;
        }

        while(indiceDireita < direita.length) {
            array[indiceArray] = direita[indiceDireita];
            indiceArray++;
            indiceDireita++;
        }
    }
}
