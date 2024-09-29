/*
  Класс Latte использует абстрактную фабрику для выбора ингредиентов.
 */
public class Latte extends Coffee {
    CoffeeIngredientFactory ingredientFactory;

    public Latte(CoffeeIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        name = "Latte";
        price = 3.50;
    }

    @Override
    public void brew() {
        System.out.println("Brewing " + name + "...");
        prepare();
    }

    // Метод для подготовки кофе с выбранными ингредиентами
    private void prepare() {
        System.out.println("Adding: " + ingredientFactory.chooseMilk());
        System.out.println("Adding: " + ingredientFactory.chooseSyrup());
        System.out.println("Adding: " + ingredientFactory.chooseExtra());
    }
}
