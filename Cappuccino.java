/*
  Класс Cappuccino представляет собой другой вид кофе.
 */
public class Cappuccino extends Coffee {
    public Cappuccino() {
        name = "Cappuccino";
        price = 3.00;
    }

    @Override
    public void brew() {
        System.out.println("Brewing " + name + "...");
    }
}
