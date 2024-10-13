package Chain;

public abstract class PaymentHandler {
    protected PaymentHandler next;

    public void setNext(PaymentHandler next) {
        this.next = next;
    }

    public abstract void pay(int amount);
}
