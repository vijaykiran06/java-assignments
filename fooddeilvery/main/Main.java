package fooddeilvery.main;

import fooddeilvery.model.FoodOrder;
import fooddeilvery.services.regularorder;
import fooddeilvery.services.premiumorder;
import fooddeilvery.utility.orderutility;

public class Main {

    public static void main(String[] args) {

        FoodOrder[] orders = new FoodOrder[6];

        orders[0] = new regularorder(101, "Vijay", 500);
        orders[1] = new premiumorder(102, "Rahul", 1000);
        orders[2] = new regularorder(103, "Aman", 750);
        orders[3] = new premiumorder(104, "Priya", 1200);
        orders[4] = new regularorder(105, "Rohit", 600);
        orders[5] = new premiumorder(106, "Sneha", 1500);

        FoodOrder.displayTotalOrders();

        System.out.println();

        for (FoodOrder order : orders) {

            if (orderutility.validateCustomerName(order.getCustomerName())
                    && orderutility.validateAmount(order.getAmount())) {

                orderutility.generateOrderSummary(order);

            } else {

                System.out.println("Invalid Order");
            }
        }
    }
}