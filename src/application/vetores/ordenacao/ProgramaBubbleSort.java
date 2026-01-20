package application.vetores.ordenacao;

import entities.sort.BubbleSort;

public class ProgramaBubbleSort {
    public static void main(String[] args) {
        int[] array = {19,42,2,-4,20,81,6};
        System.out.println("- BubbleSort -\nArray Desorganizado: ");
        impressaoArray(array);

        new BubbleSort(array);
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
