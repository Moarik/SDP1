/*
  FancyCoffeeIngredientFactory — фабрика для создания "продвинутых" ингредиентов.
 */
public class FancyCoffeeIngredientFactory implements CoffeeIngredientFactory {
    @Override
    public String chooseMilk() {
        return "Oat milk";
    }

    @Override
    public String chooseSyrup() {
        return "Caramel syrup";
    }

    @Override
    public String chooseExtra() {
        return "Cinnamon";
    }
}
