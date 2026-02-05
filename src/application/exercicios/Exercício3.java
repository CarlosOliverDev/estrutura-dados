package application.exercicios;

//Achar valor mais alto de uma lista sem o uso do for.

public class Exercício3 {
    public static void main(String[] args) {
        int[] vetor = {10,239,4141,20,37,78,77,69,2,0,-2312312};
        System.out.println(valorMaisAlto(vetor));
    }

    public static int valorMaisAlto(int[] vetor) {
        return realValorMaisAlto(vetor,0,0);
    }

    public static int realValorMaisAlto(int[] vetor, int atualValorMaisAlto, int indice) {
        if(indice >= vetor.length) {
            return atualValorMaisAlto;
        }
        if(atualValorMaisAlto <= vetor[indice]) {
            atualValorMaisAlto = vetor[indice];
        }
        indice++;
        return realValorMaisAlto(vetor, atualValorMaisAlto, indice);
    }
}
