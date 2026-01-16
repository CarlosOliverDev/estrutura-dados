package application.collections;

import java.util.Set;
import java.util.TreeSet;

public class Colecao2 {
    public static void main(String[] args) {
        //Conjunto de elementos únicos, organizada por uma árvore balanceada.

        //Declaração
        Set<Integer> conjuntoA = new TreeSet<>();

        //Adicionando elementos
        conjuntoA.add(1);
        conjuntoA.add(4);
        conjuntoA.add(3);
        conjuntoA.add(7);
        conjuntoA.add(18);
        conjuntoA.add(18);
        conjuntoA.add(11);

        //Impressão
        System.out.println(conjuntoA);

        System.out.println(conjuntoA.contains(18));

        //Remoção
        conjuntoA.remove(18);

        System.out.println(conjuntoA.contains(18));

        System.out.println();
        for(Integer item : conjuntoA) {
            System.out.println(item);
        }
        System.out.println();

        Set<Integer> conjuntoB = new TreeSet<>(Set.of(1,2,5,6,7,10,19,21,18,4,0));

        System.out.println("União dos conjuntos A e B: ");

        Set<Integer> uniao = new TreeSet<>();
        uniao.addAll(conjuntoA);
        uniao.addAll(conjuntoB);
        System.out.println(uniao + "\n");

        System.out.println("Inserção do conjunto B em A: ");

        Set<Integer> interseccao = new TreeSet<>(conjuntoA);
        interseccao.retainAll(conjuntoB);
        System.out.println(interseccao + "\n");

        System.out.println("Remoção do conjunto B em A: ");

        Set<Integer> remocao = new TreeSet<>(conjuntoA);
        remocao.removeAll(conjuntoB);
        System.out.println(remocao);

        conjuntoA.clear();
        conjuntoB.clear();
        uniao.clear();
        interseccao.clear();
        remocao.clear();
    }
}
