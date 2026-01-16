package application.collections;

import java.util.List;
import java.util.LinkedList;

public class Listas2 {
    public static void main(String[] args) {
        //Adição e remoção de elementos no meio da lista é mais rápida que da lista de arrays.

        //Declaração ArrayList.
        List<String> nomes = new LinkedList<>();

        //Adicionar valores.
        nomes.add("Carlos");
        nomes.addLast("Yuri");
        nomes.add(1, "Flash");
        nomes.addFirst("Thierry");

        for(int i =0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
        System.out.println();

        //Remover todos os valores.
        nomes.clear();

        nomes.add("Joelson");
        nomes.add("Dalma");
        nomes.add("Jennifer");
        nomes.add("Antônio");

        for(String nome : nomes){
            System.out.println(nome);
        }
        System.out.println();

        if(nomes.contains("Jennifer")) {
            int index = (nomes.indexOf("Jennifer"));
            System.out.println(index);
            nomes.remove(index);
        }

        nomes.remove("Joelson");

        for(String nome : nomes){
            System.out.println(nome);
        }

        nomes.clear();
    }
}
