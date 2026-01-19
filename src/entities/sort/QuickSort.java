package entities.sort;

public class QuickSort {
    public QuickSort(int[] array) {
        quickSort(array, 0, array.length-1);
    }

    public void quickSort(int[] array, int inicio, int fim) {
        if(inicio < fim) {
            int pivo = particionar(array, inicio, fim);
            quickSort(array, inicio, pivo-1);
            quickSort(array, pivo+1, fim);
        }
    }
    public int particionar(int[]array, int inicio, int fim) {
        int pivo = array[fim];
        int i = inicio;
        for(int j = inicio; j < fim; j++) {
            if(array[j] <= pivo) {
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
