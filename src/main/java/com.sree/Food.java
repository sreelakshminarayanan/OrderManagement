package com.sree;

public class Food {

    private static int id;
    private String name;
    private int  price;
    private int quantity;

    public Food( String name, int price, int quantity) {
        id++;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
