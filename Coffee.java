/*
  Абстрактный класс Coffee. Определяет общие свойства для всех видов кофе.
 */
public abstract class Coffee {
    protected String name;
    protected double price;

    // Абстрактный метод для приготовления кофе
    public abstract void brew();

    // Метод для получения цены кофе
    public double getPrice() {
        return price;
    }
}
