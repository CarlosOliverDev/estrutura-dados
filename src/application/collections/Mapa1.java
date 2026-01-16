package application.collections;

import java.util.Map;
import java.util.HashMap;

public class Mapa1 {
    public static void main(String[] args) {
        //Uso de Chave-Valor, sem se importar com ordenação.

        //Declaração
        Map<String, String> capitais = new HashMap<>();

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
        System.out.println(capitais.values());

        capitais.clear();
    }
}
