package aulas.oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

/**
 * Relationship Client 1 to n Purchase
 */

public class Client {

    final String name;
    final List<Purchase> purchases = new ArrayList<>();

    Client(String name) {
        this.name = name;
    }

    void addPurchase(Purchase purchase) {
        this.purchases.add(purchase);
    }

    double getTotalSpent() {
        double total = 0;
        for (Purchase purchase : purchases) {
            total += purchase.getTotal();
        }
        return total;
    }


}
