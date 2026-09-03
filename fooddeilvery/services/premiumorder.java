package fooddeilvery.services;

import fooddeilvery.model.FoodOrder;

public class premiumorder extends FoodOrder implements Discountable {

    public premiumorder(int orderId, String customerName, double amount) {
        super(orderId, customerName, amount);
    }

    @Override
    public double calculateDeliveryCharge() {
        return 50;
    }

    @Override
    public double applyDiscount() {
        return getAmount() * 0.15;
    }
}