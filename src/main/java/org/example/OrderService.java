package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void addOrder(Order order) {
        orderRepository.getOrdersList().add(order);
    }

    public void deleteOrder(String id) {
        Optional<Order> order = orderRepository.getOrdersList().stream()
                .filter(o -> o.getId().equals(id))
                .findFirst();

        if (!order.isEmpty()) {
            orderRepository.getOrdersList().remove(order.get());
            System.out.println("The order with id " + id + " removed.");
        } else {
            System.out.println("No such order on the list");
        }
    }

    public Order findOrder(String id) {
        Optional<Order> foundOrder = orderRepository.getOrdersList().stream()
                .filter(o -> o.getId().equals(id))
                .findFirst();

        if (!foundOrder.isEmpty()) {
            return foundOrder.get();
        } else {
            List<String> items = new ArrayList<>();
            return new Order("00000","Customer_0", items, 0.0);
        }
    }

    public List<Order> getAllOrders() {
        return orderRepository.getOrdersList();
    }

    public double countSumOfAllOrders() {
        return 0;
    }

}
