package entities.vetores;

import java.util.Scanner;

public class PesquisaBinaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[]{10,0,-2,32,41};

        imprimirArray(intArray);

        System.out.print("Digite qual valor você quer buscar: ");
        int item = scanner.nextInt();
        scanner.nextLine();
        
        organizarArray(intArray);

        imprimirArray(intArray);

        int posicao = buscaBinaria(item, intArray);
        if(posicao == -1) {
            System.out.printf("O número %d não está no vetor.",item);
        } else {
            System.out.printf("O número %d está no índice %d da lista.",item,posicao);
        }
        
        scanner.close();
    }

    public static void organizarArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i; j < intArray.length; j++) {
                if(intArray[i]>intArray[j]) {
                    int aux = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = aux;
                }
            }
        }
    }

    public static void imprimirArray(int[] intArray) {
        System.out.print("Array: [");
        for (int i = 0; i < intArray.length; i++) {
            if(i == intArray.length-1) {
                System.out.println(intArray[i]+"]");
            } else {
                System.out.print(intArray[i]+", ");
            }
        }
    }

    public static int buscaBinaria(int item, int[] intArray) {
        int baixo = 0;
        int alto = intArray.length-1;

        while(baixo <= alto) {
            int meio = (alto+baixo)/2;
            int chute = intArray[meio];

            if(chute == item) {
                return meio;
            } else if(chute > item) {
                alto = meio-1;
            } else if(chute < item) {
                baixo = meio+1;
            }
        }

        return -1;
    }
}
