package aulas.colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<Integer, String>();
        usuarios.put(1, "Joao");
        usuarios.put(2, "Maria");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Rebeca");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());
        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());
        System.out.println(usuarios.containsKey(3));
        System.out.println(usuarios.containsValue("Maria"));
        System.out.println(usuarios.get(1));

        for(int chave : usuarios.keySet()) {
            System.out.println(usuarios.get(chave));
        }

        for(String valor : usuarios.values()) {
            System.out.println(valor);
        }

        for(Map.Entry<Integer, String> entry : usuarios.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
