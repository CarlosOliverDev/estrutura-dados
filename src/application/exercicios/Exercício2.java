package application.exercicios;

public class Exercício2 {
    public static void main(String[] args) {
        String[] lista = {"banana","maça","biscoito","arroz","suco de laranja","fejião","água","","açúcar","esponja","leite","frango","carne"}; //12 + 1 vazio.
        int quantidadeItensLista = calcularQuantidadesItensLista(lista);
        System.out.println(quantidadeItensLista);
    }

    public static int calcularQuantidadesItensLista(String[] lista) {
        return realCalcularQuantidadesItensLista(lista, 0);
    }

    public static int realCalcularQuantidadesItensLista(String[] lista, int indice) {
        if(indice >= lista.length) {
            return 0;
        }
        int sum = 0;
        if(!lista[indice].isEmpty()) {
            sum++;
        }
        indice++;
        return sum + realCalcularQuantidadesItensLista(lista, indice);
    }
}
