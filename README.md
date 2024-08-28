Task: Implementing and Testing an Order Management System

Description:

Create a simple order management system for an online store. Your task is to implement the Order class and the OrderService class that will manage orders. Use a Test-Driven Development (TDD) approach: first write the tests and then implement the code to make the tests pass. Utilize JUnit and AssertJ for unit testing.

Step 1: Implement the Order Class
The Order class should have the following properties:

id (String): A unique identifier for the order.
customerName (String): The name of the customer.
items (List<String>): A list of items in the order.
totalAmount (double): The total amount of the order.
Example Order Class:

java
Skopiuj kod
package com.example.orders;

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

    // Optionally, override equals() and hashCode() for better comparison in tests
}
Step 2: Implement the OrderService Class
The OrderService class should:

Allow adding a new order to the list of orders.
Allow removing an order by its ID.
Allow searching for an order by its ID.
Return all orders.
Calculate the total amount of all orders.
Example OrderService Class:

java
Skopiuj kod
package com.example.orders;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OrderService {
    private final List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(String id) {
        orders.removeIf(order -> order.getId().equals(id));
    }

    public Optional<Order> findOrderById(String id) {
        return orders.stream().filter(order -> order.getId().equals(id)).findFirst();
    }

    public List<Order> getAllOrders() {
        return new ArrayList<>(orders);
    }

    public double calculateTotalAmount() {
        return orders.stream().mapToDouble(Order::getTotalAmount).sum();
    }
}
Step 3: TDD - Implementation Steps
Red: Write Unit Tests

Create unit tests for the OrderService class in OrderServiceTest.java:

Test Adding Orders:

Verify that an order is added to the list.
Test Removing Orders:

Verify that an order is removed from the list by its ID.
Test Finding Orders by ID:

Verify that an order can be found by its ID.
Test Returning All Orders:

Verify that the correct list of orders is returned.
Test Calculating Total Amount:

Verify that the total amount is calculated correctly.

Green: Implement Methods

Implement the methods in the OrderService class so that the tests pass. The example OrderService class provided earlier should meet the requirements and pass the tests.

Refactor:

Refactor the code as needed, ensuring adherence to SOLID principles and DRY (Don't Repeat Yourself). Make sure the code is clean and maintainable.

Testing Requirements:

JUnit: Use JUnit for creating tests.
AssertJ: Use AssertJ to enhance readability and expressiveness of assertions.
Lifecycle Methods: Utilize @BeforeEach to set up test data and clean up resources as necessary.
