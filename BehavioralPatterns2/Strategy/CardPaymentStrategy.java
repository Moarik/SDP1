package BehavioralPatterns2.Strategy;

public class CardPaymentStrategy implements PaymentStrategy {
    @Override
    public double calculateTotal(double orderAmount) {
        return orderAmount + orderAmount * 0.02;
    }
}