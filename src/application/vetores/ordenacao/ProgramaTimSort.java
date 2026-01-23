package application.vetores.ordenacao;

import entities.sort.TimSort;

public class ProgramaTimSort {
    public static void main(String[] args) {
        int[] arrayPequeno = {19,42,2,-4,20,81,6};
        System.out.println("- TimSort -\nArray Desorganizado: ");
        impressaoArray(arrayPequeno);

        long tempoInicialArrayPequeno = System.nanoTime();
        new TimSort(arrayPequeno);
        long tempoFinalArrayPequeno = System.nanoTime();

        System.out.println("Array Organizado: ");
        impressaoArray(arrayPequeno);
        System.out.println("\nTempo para Organizar o Array: "+((tempoFinalArrayPequeno-tempoInicialArrayPequeno)/1_000_000) + "ms.");

        int[] arrayGrande = gerarVetorAleatorio(10000);

        long tempoInicialarrayGrande = System.nanoTime();
        new TimSort(arrayGrande);
        long tempoFinalarrayGrande = System.nanoTime();

        System.out.println("\nTempo para organizar um Array de Tamanho 10.000: "+((tempoFinalarrayGrande-tempoInicialarrayGrande)/1_000_000) + "ms.");
    }

    public static void impressaoArray(int[] array) {
        for(int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] gerarVetorAleatorio(int tamanho) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = (int) (Math.random() * 10000);
        }
        return vetor;
    }
}
