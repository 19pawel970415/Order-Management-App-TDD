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
                .containsExactly(order);
    }

    @Test
    void shouldDeleteOrder() {
        List<String> items = Arrays.asList("Bread", "Butter", "Cheese");
        Order order = new Order("12345", "Customer_1", items, 50.0);
        orderService.addOrder(order);

        orderService.deleteOrder("12345");

        assertThat(orderRepository.getOrdersList())
                .doesNotContain(order)
                .hasSize(0)
                .isEmpty();
    }

    @Test
    void shouldNotDeleteNonexistentOrder() {
        List<String> items = Arrays.asList("Bread", "Butter", "Ham");
        Order order = new Order("54321", "Customer_2", items, 30.0);
        orderService.addOrder(order);

        orderService.deleteOrder("12345");

        assertThat(orderRepository.getOrdersList())
                .isNotEmpty()
                .hasSize(1)
                .containsExactly(order);
    }

    @Test
    void shouldFindOrder() {
        List<String> items = Arrays.asList("Bread", "Butter", "Cheese");
        Order order = new Order("12345", "Customer_1", items, 50.0);
        orderService.addOrder(order);
        String id = "12345";

        Order foundOrder = orderService.findOrder(id);

        assertThat(foundOrder)
                .isEqualTo(order);
    }

    @Test
    void showAllOrders() {
    }

    @Test
    void countSumOfAllOrders() {
    }
}