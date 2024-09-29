/*
  Класс CoffeeFactory реализует фабричный метод для создания различных типов кофе.
 */
public class CoffeeFactory {
    // Метод создает кофе по заданному типу
    public Coffee createCoffee(String type) {
        switch (type.toLowerCase()) {
            case "espresso":
                return new Espresso();
            case "cappuccino":
                return new Cappuccino();
            default:
                throw new IllegalArgumentException("Unknown coffee type.");
        }
    }
}
