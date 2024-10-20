package BehavioralPatterns2.Strategy;

public class Order {
    private PaymentStrategy paymentStrategy;

        private int orderId;
        private double basePrice; // пример базовой цены

        public Order(int orderId) {
            this.orderId = orderId;
        }

        // Метод для вычисления финальной цены
        public double calculateFinalPrice() {
            // Например, добавление налога к базовой цене
            double tax = basePrice * 0.1; // 10% налог
            return basePrice + tax; // Возвращаем финальную цену
        }


    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public double calculateTotal(double orderAmount) {
        return paymentStrategy.calculateTotal(orderAmount);
    }
}
