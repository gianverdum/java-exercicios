package aulas.oo.encapsulamento.casaB;

import aulas.oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

    Ana irma = new Ana();

    void testeAcessos() {
//        System.out.println(irma.segredo);
//        System.out.println(irma.facoDentroDeCasa);
//        System.out.println(irma.formaDeFalar); // só acessa via herança
        System.out.println(irma.todosSabem);
        System.out.println(formaDeFalar);
        System.out.println(todosSabem);
    }
}
