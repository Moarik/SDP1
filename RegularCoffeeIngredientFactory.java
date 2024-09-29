/*
  RegularCoffeeIngredientFactory — конкретная фабрика для создания стандартных ингредиентов кофе.
 */
public class RegularCoffeeIngredientFactory implements CoffeeIngredientFactory {
    @Override
    public String chooseMilk() {
        return "Regular milk";
    }

    @Override
    public String chooseSyrup() {
        return "No syrup";
    }

    @Override
    public String chooseExtra() {
        return "No extra";
    }
}
