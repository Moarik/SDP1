/**
 * CoffeeShop класс реализует паттерн Singleton.
 * Гарантирует, что существует только один экземпляр кофейни.
 */
public class CoffeeShop {
    private static CoffeeShop instance;
    private int orderCount;
    private double totalRevenue;

    // Приватный конструктор для предотвращения создания новых экземпляров
    private CoffeeShop() {
        orderCount = 0;
        totalRevenue = 0;
    }

    // Метод для получения единственного экземпляра кофейни
    public static CoffeeShop getInstance() {
        if (instance == null) {
            instance = new CoffeeShop();
        }
        return instance;
    }

    // Метод для оформления заказа
    public void takeOrder(String coffeeType, double price) {
        System.out.println("Order #" + (++orderCount) + " for " + coffeeType + " received.");
        totalRevenue += price;
    }

    // Метод для получения общей выручки кофейни
    public double getTotalRevenue() {
        return totalRevenue;
    }
}
