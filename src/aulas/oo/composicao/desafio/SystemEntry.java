package aulas.oo.composicao.desafio;

public class SystemEntry {

    public static void main(String[] args) {

        Client client1 = new Client("Maria Julia Moraes");

        Purchase purchase1 = new Purchase();
        purchase1.addItem("Pen", 1, 100);
        purchase1.addItem(new Product("Notebook", 2000), 2);
        Purchase purchase2 = new Purchase();
        purchase2.addItem("Journal", 10, 10);
        purchase2.addItem(new Product("Printer", 1000), 1);

        client1.addPurchase(purchase1);
        client1.addPurchase(purchase2);

        System.out.println(client1.getTotalSpent());
    }
}
