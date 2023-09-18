package br.com.exercises.sequential.moneychange;

public class MoneyChange {
    private double productUnitPrice;
    private int quantityPurchased;
    private double moneyReceived;

    public MoneyChange(int quantityPurchased, double moneyReceived) {
        this.quantityPurchased = quantityPurchased;
        this.moneyReceived = moneyReceived;
    }

    public int getQuantityPurchased() {
        return quantityPurchased;
    }

    public void setQuantityPurchased(int quantityPurchased) {
        this.quantityPurchased = quantityPurchased;
    }

    public double getMoneyReceived() {
        return moneyReceived;
    }

    public void setMoneyReceived(double moneyReceived) {
        this.moneyReceived = moneyReceived;
    }

    public double getProductUnitPrice() {
        return productUnitPrice;
    }

    public void setProductUnitPrice(double productUnitPrice) {
        this.productUnitPrice = productUnitPrice;
    }


    public double totalPrice() {
        return this.productUnitPrice * this.quantityPurchased;

    }

    public double change() {
        if (getMoneyReceived() < totalPrice()) {
            System.out.println("Sorry, payment invalid!");
        }
        return this.getMoneyReceived() - totalPrice();
    }

}
