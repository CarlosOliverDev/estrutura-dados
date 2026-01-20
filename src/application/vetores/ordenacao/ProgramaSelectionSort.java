package application.vetores.ordenacao;

import entities.sort.SelectionSort;

public class ProgramaSelectionSort {
    public static void main(String[] args) {
        int[] array = {19,42,2,-4,20,81,6};
        System.out.println("- SelectionSort -\nArray Desorganizado: ");
        impressaoArray(array);

        new SelectionSort(array);
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
