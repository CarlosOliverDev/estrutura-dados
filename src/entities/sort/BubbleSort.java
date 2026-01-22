package entities.sort;

public class BubbleSort {
    public BubbleSort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = i+1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    int aux = array[j];
                    array[j] = array[i];
                    array[i] = aux;
                }
            }
        }
    }
}
