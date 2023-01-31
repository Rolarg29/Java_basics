package rola.data.structures;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

    public static void main(String[] args) {

        //Map<llaves valores> nombre del mapa
        Map<String, String> personas = new HashMap<>();

        personas.put("124578A", "Rolando Ramirez");
        personas.put("124578B", "Andrea Leyva");
        personas.put("124578C", "Ricardo Silva");

        System.out.println(personas);
        System.out.println("=======================================");

        for(String key : personas.keySet()){//keySet nos devuelve los llaves del mapa
            System.out.println(key);
        }
        System.out.println("=======================================");
        for(String value : personas.values()){//values nos devuelve los valores del mapa
            System.out.println(value);
        }

        System.out.println("=======================================");

        for(Map.Entry<String, String> pair : personas.entrySet()){//Entry nos devuelve tanto llaves como valores del mapa
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }

    }
}
