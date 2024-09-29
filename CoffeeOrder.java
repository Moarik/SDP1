/*
  CoffeeOrder — класс, реализующий паттерн Прототип.
  Позволяет клонировать заказы.
 */
public class CoffeeOrder implements Cloneable {
    private String coffeeType;
    private String size;

    public CoffeeOrder(String coffeeType, String size) {
        this.coffeeType = coffeeType;
        this.size = size;
    }

    // Метод для отображения информации о заказе
    public void showOrder() {
        System.out.println("Order: " + size + " " + coffeeType);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new CoffeeOrder(this.coffeeType, this.size);
    }
}
