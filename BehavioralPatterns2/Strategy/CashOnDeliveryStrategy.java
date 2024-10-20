package BehavioralPatterns2.Strategy;

public class CashOnDeliveryStrategy implements PaymentStrategy {
    @Override
    public double calculateTotal(double orderAmount) {
        return orderAmount + 300;
    }
}