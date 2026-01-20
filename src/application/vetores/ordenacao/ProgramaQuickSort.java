package application.vetores.ordenacao;

import entities.sort.QuickSort;

public class ProgramaQuickSort {
    public static void main(String[] args) {
        int[] array = {19,42,2,-4,20,81,6};
        System.out.println("- QuickSort -\nArray Desorganizado: ");
        impressaoArray(array);

        new QuickSort(array);
        System.out.println("\nArray Organizado: ");
        impressaoArray(array);
    }

    public static void impressaoArray(int[] array) {
        for(int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
