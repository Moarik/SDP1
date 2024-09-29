/*
  Класс Espresso представляет собой конкретный вид кофе.
 */
public class Espresso extends Coffee {
    public Espresso() {
        name = "Espresso";
        price = 2.50;
    }

    @Override
    public void brew() {
        System.out.println("Brewing " + name + "...");
    }
}
