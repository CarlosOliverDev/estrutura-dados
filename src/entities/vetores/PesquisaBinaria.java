package entities.vetores;

import java.util.Scanner;

public class PesquisaBinaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[]{10,0,-2,32,41};

        System.out.print("Digite qual valor você quer buscar: ");
        int item = scanner.nextInt();
        scanner.nextLine();
        
        organizarArray(intArray);

        imprimirArray(intArray);

        buscaBinaria(item, intArray);

        imprimirArray(intArray);
        
        scanner.close();
    }

    public static void organizarArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray.length; j++) {
                if(i>j) {
                    int aux = j;
                    j = i;
                    i = aux;
                }
            }
        }
    }

    
}
