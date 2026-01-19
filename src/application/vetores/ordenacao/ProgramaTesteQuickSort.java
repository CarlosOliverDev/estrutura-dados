package application.vetores.ordenacao;

import entities.sort.QuickSort;

public class ProgramaTesteQuickSort {
    public static void main(String[] args) {
        int[] array = {10,14,24,2,5,19,3,83,43,-2};
        new QuickSort(array);
        QuickSort.imprimirArray(array);
    }
}
