package aulas.classe;

public class User {

    String nome;
    String email;

    @Override
    public boolean equals(Object obj) {

        if(obj instanceof User other) {
            return nome.equals(other.nome) && email.equals(other.email);
        } else {
            return false;
        }
    }
}
