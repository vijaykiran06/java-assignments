package fooddeilvery.services;

import fooddeilvery.model.FoodOrder;

public class regularorder extends FoodOrder implements Discountable {

    public regularorder(int orderId, String customerName, double amount) {
        super(orderId, customerName, amount);
    }

    @Override
    public double calculateDeliveryCharge() {
        return 80;
    }

    @Override
    public double applyDiscount() {
        return getAmount() * 0.10;
    }
}