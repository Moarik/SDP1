package Chain;

public class PaymentC extends PaymentHandler {
    private int limit;

    public PaymentC(int limit) {
        this.limit = limit;
    }

    @Override
    public void pay(int amount) {
        if (amount <= limit) {
            System.out.println("PaymentC processing payment of: " + amount);
        } else {
            System.out.println("Payment amount exceeds limit.");
        }
    }
}
