package org.example;

import java.util.List;

public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void addOrder(Order order) {

    }

    public List<Order> deleteOrder(String id) {
        return null;
    }

    public Order findOrder(String id) {
        return null;
    }

    public List<Order> showAllOrders() {
        return null;
    }

    public double countSumOfAllOrders() {
        return 0;
    }

}
