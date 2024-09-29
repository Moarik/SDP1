/*
  CustomCoffeeBuilder — класс, реализующий паттерн Строитель.
  Позволяет шаг за шагом создавать кастомный кофе.
 */
public class CustomCoffeeBuilder {
    private String type;
    private String milk = "No milk";
    private String syrup = "No syrup";
    private String size = "Medium";

    public CustomCoffeeBuilder(String type) {
        this.type = type;
    }

    // Методы для добавления компонентов кофе
    public CustomCoffeeBuilder addMilk(String milk) {
        this.milk = milk;
        return this;
    }

    public CustomCoffeeBuilder addSyrup(String syrup) {
        this.syrup = syrup;
        return this;
    }

    public CustomCoffeeBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    // Метод для создания кофе
    public CustomCoffee build() {
        return new CustomCoffee(type, milk, syrup, size);
    }

    public class CustomCoffee {
        private String type;
        private String milk;
        private String syrup;
        private String size;

        public CustomCoffee(String type, String milk, String syrup, String size) {
            this.type = type;
            this.milk = milk;
            this.syrup = syrup;
            this.size = size;
        }

        @Override
        public String toString() {
            return size + " " + type + " with " + milk + " and " + syrup;
        }
    }
}
