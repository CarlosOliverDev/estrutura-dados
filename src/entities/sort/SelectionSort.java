package entities.sort;

public class SelectionSort {
    public SelectionSort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int minValue = i;

            for(int j = i+1; j < array.length; j++) {
                if(array[j] < array[minValue]) {
                    minValue = j;
                }
            }

            int aux = array[minValue];
            array[minValue] = array[i];
            array[i] = aux;
        }
        impressaoArray(array);
    }

    public void impressaoArray(int[] array) {
        for(int num : array) {
            System.out.println(num);
        }
    }
}
