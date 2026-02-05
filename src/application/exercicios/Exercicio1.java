package application.exercicios;

//Algoritmo de soma de um vetor sem utilizar for.

public class Exercicio1 {
    public static void main(String[] args) {
        int[] vetor = {10,15,8,2,3,4};
        int somaTotal = somaRecursividade(vetor);
        System.out.println(somaTotal);
    }

    public static int somaRecursividade(int[] vetor) {
        return realSomaRecursividade(vetor, 0);
    }

    public static int realSomaRecursividade(int[] vetor, int indiceAtual) {
        if(indiceAtual >= vetor.length) {
            return 0;
        }
        int soma = vetor[indiceAtual];
        indiceAtual++;
        soma += realSomaRecursividade(vetor, indiceAtual);
        return soma;
    }
}
