package entities.sort;

public class QuickSort {
    public QuickSort(int[] array) {
        quickSort(array, 0, array.length-1);
    }

    public void quickSort(int[] array, int inicio, int fim){
        if(inicio < fim) {
            int pivo = particionar(array, inicio, fim);

            quickSort(array, inicio, pivo-1);
            quickSort(array,pivo+1, fim);
        }
    }

    public int particionar(int[] array, int inicio, int fim) {
        int pivo = array[fim];
        int i = inicio;
        for(int j = inicio; j < fim; j++) {
            if(array[j] < pivo) {
                int aux = array[j];
                array[j] = array[i];
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
