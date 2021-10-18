package com.example;

public class Order2 {
    boolean isFilled;
    double billAmount;
    String shipping;

    public Order2(boolean filled, double cost, String shippingMethod) {
        if (cost > 24.00) {
            System.out.println("High value item!");
        }
        isFilled = filled;
        billAmount = cost;
        shipping = shippingMethod;
    }

    public void ship() {
        if (isFilled) {
            System.out.println("Shipping");
            System.out.println("Shipping cost: " + calculateShipping());
        } else {
            System.out.println("Order not ready");
        }
    }

    public double calculateShipping() {
        // declare conditional statement here
        if (shipping.equals("Regular")) {
            return 0;
        } else if (shipping.equals("Express")) {
            return 1.75;
        } else {
            return .50;
        }
    }

    public static void main(String[] args) {
        // do not alter the main method!
        Order2 book = new Order2(true, 9.99, "Express");
        Order2 chemistrySet = new Order2(false, 72.50, "Regular");

        book.ship();
        chemistrySet.ship();
    }
}
