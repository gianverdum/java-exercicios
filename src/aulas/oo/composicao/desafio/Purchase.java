package aulas.oo.composicao.desafio;

import java.util.ArrayList;

/**
 * Relationship Purchase 1 to n Item
 */

public class Purchase {

    final ArrayList<Item> items = new ArrayList<>();

    void addItem(Product product, int quantity) {
        this.items.add(new Item(product, quantity));
    }

    void addItem(String name, double price, int quantity) {
        this.items.add(new Item(new Product(name, price), quantity));
    }

    double getTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.quantity * item.product.price;
        }
        return total;
    }
}
