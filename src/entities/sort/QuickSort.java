package entities.sort;

public class QuickSort {
    public QuickSort(int[]array) {
        quicksort(array, 0, array.length-1);
    }

    public void quicksort(int[] array, int inicio, int fim) {
        if(inicio < fim) {
            int pivot = particionar(array, inicio, fim);

            quicksort(array, inicio, pivot-1);
            quicksort(array, pivot+1, fim);
        }
    }

    public int particionar(int[] array, int inicio, int fim) {
        int i = inicio;
        for(int j = inicio; j < fim; j++) {
            if(array[j] < array[fim]) {
                int aux = array[j];
                array[j] =  array[i];
                array[i] = aux;

                i++;
            }
        }
        int aux = array[fim];
        array[fim] = array[i];
        array[i] = aux;

        return i;
    }
}
