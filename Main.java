public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Одиночка
        CoffeeShop coffeeShop = CoffeeShop.getInstance();

        // Фабричный метод
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        Coffee espresso = coffeeFactory.createCoffee("espresso");
        espresso.brew();
        coffeeShop.takeOrder("Espresso", espresso.getPrice());

        // Абстрактная фабрика
        CoffeeIngredientFactory fancyFactory = new FancyCoffeeIngredientFactory();
        Coffee latte = new Latte(fancyFactory);
        latte.brew();
        coffeeShop.takeOrder("Latte", latte.getPrice());

        // Прототип
        CoffeeOrder originalOrder = new CoffeeOrder("Cappuccino", "Large");
        CoffeeOrder clonedOrder = (CoffeeOrder) originalOrder.clone();
        originalOrder.showOrder();
        clonedOrder.showOrder();

        // Строитель
        CustomCoffeeBuilder customCoffeeBuilder = new CustomCoffeeBuilder("Mocha");
        CustomCoffeeBuilder.CustomCoffee customCoffee = customCoffeeBuilder
                .addMilk("Soy Milk")
                .addSyrup("Hazelnut Syrup")
                .setSize("Large")
                .build();
        System.out.println(customCoffee);

    }
}
