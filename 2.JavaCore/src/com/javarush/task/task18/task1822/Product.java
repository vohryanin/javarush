package com.javarush.task.task18.task1822;

public class Product {
    private int id;
    private String productName = "";
    private double price;
    private int quantity;

    //Конструктор класса Product
    Product(String line) {
        String[] strings = line.split(" ");

        this.id = Integer.parseInt(strings[0]);
        for (int i = 1; i < strings.length-2; i++) {
            if (i < strings.length-3) {
                this.productName = this.productName + strings[i] + " ";
            } else {
                this.productName = this.productName + strings[i];
            }
        }
        this.price = Double.parseDouble(strings[strings.length - 2]);
        this.quantity = Integer.parseInt(strings[strings.length - 1]);
    }

    public int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
