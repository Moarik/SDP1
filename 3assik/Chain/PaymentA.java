package Chain;

public class PaymentA extends PaymentHandler {
    private int limit;

    public PaymentA(int limit) {
        this.limit = limit;
    }

    @Override
    public void pay(int amount) {
        if (amount <= limit) {
            System.out.println("PaymentA processing payment of: " + amount);
        } else if (next != null) {
            next.pay(amount);
        }
    }
}
