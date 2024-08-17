package org.example;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository {

    private List<Order> ordersList = new ArrayList<Order>();

    public List<Order> getOrdersList() {
        return ordersList;
    }
}
