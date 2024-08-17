package org.example;

import java.util.List;

public class Order {

    private String id;
    private String customerName;
    private List<String> items;
    private double totalAmount;

    public Order(String id, String customerName, List<String> items, double totalAmount) {
        this.id = id;
        this.customerName = customerName;
        this.items = items;
        this.totalAmount = totalAmount;
    }

    public String getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<String> getItems() {
        return items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }


}
