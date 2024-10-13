package Chain;

public class PaymentB extends PaymentHandler {
    private int limit;

    public PaymentB(int limit) {
        this.limit = limit;
    }

    @Override
    public void pay(int amount) {
        if (amount <= limit) {
            System.out.println("PaymentB processing payment of: " + amount);
        } else if (next != null) {
            next.pay(amount);
        }
    }
}
