package br.com.exercises.sequential.moneychange;

public class Main {
    public static void main(String[] args) {
        MoneyChange change1 = new MoneyChange(2, 20);
        change1.setProductUnitPrice(8.0);

        System.out.println(change1.change());

        MoneyChange change2 = new MoneyChange(3, 100.00);
        change2.setProductUnitPrice(30.00);

        System.out.println(change2.change());
    }
}
