package org.example;

import java.util.List;

public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void addOrder(Order order) {
        orderRepository.getOrdersList().add(order);
    }

    public void deleteOrder(String id) {
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
