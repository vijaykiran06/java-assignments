package fooddeilvery.utility;

import fooddeilvery.model.FoodOrder;
import fooddeilvery.services.Discountable;

public class orderutility {

    public static boolean validateAmount(double amount) {
        return amount > 0;
    }

    public static boolean validateCustomerName(String name) {
        return name != null && !name.trim().isEmpty();
    }

    public static void generateOrderSummary(FoodOrder order) {

        double discount = 0;

        if (order instanceof Discountable) {
            Discountable d = (Discountable) order;
            discount = d.applyDiscount();
        }

        double deliveryCharge = order.calculateDeliveryCharge();

        double finalAmount =
                order.getAmount() - discount + deliveryCharge;

        System.out.println("--------------------------------");
        System.out.println("Order ID        : " + order.getOrderId());
        System.out.println("Customer Name   : " + order.getCustomerName());
        System.out.println("Amount          : Rs. " + order.getAmount());
        System.out.println("Discount        : Rs. " + discount);
        System.out.println("Delivery Charge : Rs. " + deliveryCharge);
        System.out.println("Final Payable   : Rs. " + finalAmount);
        System.out.println("--------------------------------");
    }
}