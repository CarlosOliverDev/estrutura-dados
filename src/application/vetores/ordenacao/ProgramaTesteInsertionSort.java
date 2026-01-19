package application.vetores.ordenacao;

import entities.sort.InsertionSort;

public class ProgramaTesteInsertionSort {
    public static void main(String[] args) {
        int[] array = {10,14,24,2,5,19,3};
        new InsertionSort(array);
    }
}
