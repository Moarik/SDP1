package BehavioralPatterns2.Strategy;

public class WalletPaymentStrategy implements PaymentStrategy {
    @Override
    public double calculateTotal(double orderAmount) {
        return orderAmount;
    }
}