package application.collections;

import java.util.Map;
import java.util.TreeMap;

public class Mapa2 {
    public static void main(String[] args) {
        //Uso de Chave-Valor, ordenando por árvores balanceadas.

        //Declaração
        Map<String, String> capitais = new TreeMap<>();

        //Adicionando elementos
        capitais.put("Brasil", "São Paulo");
        capitais.put("País inexistente", "Brasília");
        capitais.put("Brasil", "Brasília");
        capitais.put("Inglaterra", "Londres");

        System.out.println(capitais);

        //Remover elemento
        capitais.remove("País inexistente");

        //Acessar elemento com key
        System.out.println(capitais.get("Inglaterra"));

        //Conferir chave ou valor
        System.out.println(capitais.containsKey("Brasil"));
        System.out.println(capitais.containsValue("Tokyo"));

        capitais.put("Coreia do Sul", "Seul");
        capitais.put("Japão", "Tokyo");
        capitais.put("Peru", "Lima");

        //Uso do for each
        System.out.println("\nCapitais:");
        for(Map.Entry<String, String> capital:capitais.entrySet()) {
            System.out.println("País: " + capital.getKey());
            System.out.println("Capital: " + capital.getValue() + "\n");
        }

        System.out.println(capitais.size());

        //Organiza com base nas keys e não nos valores
        System.out.println(capitais.values());

        capitais.clear();
    }
}
