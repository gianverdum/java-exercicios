package aulas.oo.composicao.desafio;

/**
 * Relationship Item n to 1 Product
 */

public class Item {

    final Product product;
    final int quantity;

    public Item(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
}
