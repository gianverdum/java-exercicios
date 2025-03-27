package aulas.colecoes;

import java.util.ArrayList;

public class Lista {

    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<>();

        lista.add(new Usuario("Ana"));
        lista.add(new Usuario("Joao"));
        lista.add(new Usuario("Maria"));
        lista.add(new Usuario("Pedro"));
        lista.add(new Usuario("Manu"));

        System.out.println(lista.get(3));

        System.out.println(">>>>>" + lista.remove(1));
        System.out.println(lista.remove(new Usuario("Manu")));
        System.out.println("Tem? " + lista.contains(new Usuario("Joao")));

        for(Usuario usuario : lista) {
            System.out.println(usuario);
        }
    }
}
