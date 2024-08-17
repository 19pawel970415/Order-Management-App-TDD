package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class OrderServiceTest {

    private final OrderRepository orderRepository = new OrderRepository();
    private final OrderService orderService = new OrderService(orderRepository);

    @Test
    void shouldAddOrder() {
        List<String> items = Arrays.asList("Bread", "Butter", "Cheese");
        Order order = new Order("12345", "Customer_1", items, 50.0);

        orderService.addOrder(order);

        assertThat(orderRepository.getOrdersList())
                .isNotEmpty()
                .hasSize(1)
                .contains(order);
    }

    @Test
    void deleteOrder() {
    }

    @Test
    void findOrder() {
    }

    @Test
    void showAllOrders() {
    }

    @Test
    void countSumOfAllOrders() {
    }
}