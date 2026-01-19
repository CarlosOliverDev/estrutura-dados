package entities.sort;

public class InsertionSort {
    public InsertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int elementoASerOrdenado = array[i];
            int j = i-1;
            while(j >= 0 && elementoASerOrdenado < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = elementoASerOrdenado;
        }
        impressaoArray(array);
    }
    public void impressaoArray(int[] array) {
        for(int num : array) {
            System.out.print(num + " ");
        }
    }
}
