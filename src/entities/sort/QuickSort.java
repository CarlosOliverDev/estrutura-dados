package entities.sort;

public class QuickSort {
    public QuickSort(int[] array) {
        quickSort(array, 0, array.length-1);
    }

    public void quickSort(int[] array, int inicio, int fim) {
        if(fim > inicio) {
            int pivot = particionar(array, inicio, fim);

            quickSort(array, inicio, pivot-1);
            quickSort(array, pivot+1, fim);
        }
    }

    public int particionar(int[] array, int inicio, int fim) {
        int pivot = array[fim];
        int i = inicio;

        for (int j = inicio; j < fim; j++) {
            if(array[j] <= pivot) {
                int aux = array[i];
                array[i] = array[j];
                array[j] = aux;

                i++;
            }
        }

        int aux = array[i];
        array[i] = array[fim];
        array[fim] = aux;

        return i;
    }

    public static void imprimirArray(int[] array) {
        for(int num : array) {
            System.out.print(num + " ");
        }
    }
}
