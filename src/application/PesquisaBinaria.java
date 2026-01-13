package application;

import java.util.Scanner;

public class PesquisaBinaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao programa de pesquisa binária, nele você criará um vetor de inteiros que será ordenado e poderá pesquisar a posição de um valor do vetor.");

        System.out.print("Digite o tamanho do vetor de inteiros: ");
        int tamanhoVetor = scanner.nextInt();
        scanner.nextLine();

        int[] arrayInt = criarVetorInt(tamanhoVetor, scanner);

        System.out.print("\nVetor Completo: \n[");
        imprimirVetor(arrayInt);

        System.out.println("\nOrdenando vetor.");
        ordenarVetor(arrayInt);

        System.out.print("Vetor Ordenado: \n[");
        imprimirVetor(arrayInt);

        System.out.print("\nDigite o número inteiro que deseja buscar a posição no vetor: ");
        int item = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nPesquisando o número.");
        int posicao = pesquisaBinaria(arrayInt, item);

        imprimirPosicao(item, posicao);

        scanner.close();
    }

    public static int[] criarVetorInt(int tamanhoVetor, Scanner scanner) {
        System.out.println("\nCriando vetor:");
        int[] arrayInt = new int[tamanhoVetor];

        for(int i = 0; i < tamanhoVetor; i++) {
            System.out.printf("Digite o valor da posição %d do vetor: ",i);
            arrayInt[i] = scanner.nextInt();
            scanner.nextLine();
        }

        return arrayInt;
    }

    public static void imprimirVetor(int[] arrayInt) {
        for(int i = 0; i < arrayInt.length; i++) {
            if(i < arrayInt.length-1) {
                System.out.printf("%d, ",arrayInt[i]);
            } else {
                System.out.printf("%d]\n",arrayInt[i]);
            }
        }
    }

    public static void ordenarVetor(int[] arrayInt) {
        for(int i = 0; i < arrayInt.length; i++) {
            for(int j = i; j < arrayInt.length; j++) {
                if(arrayInt[i] > arrayInt[j]) {
                    int aux = arrayInt[j];
                    arrayInt[j] = arrayInt[i];
                    arrayInt[i] = aux;
                }
            }
        }
    }

    public static int pesquisaBinaria(int[] arrayInt, int item) {
        int alto = arrayInt.length-1;
        int baixo = 0;

        while( baixo <= alto) {
            int meio = (alto+baixo)/2;
            int chute = arrayInt[meio];

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

    public static void imprimirPosicao(int item, int posicao) {
        if(posicao == -1) {
            System.out.printf("O número %d não está no vetor.", item);
        } else {
            System.out.printf("O número %d se encontra na posição %d do vetor!",item ,posicao);
        }
    }
}