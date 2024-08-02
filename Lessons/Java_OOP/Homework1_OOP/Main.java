package Homework1_OOP;

public class Main {
    public static void main(String[] args) {
        HotDrinksMachine hotMachine = new HotDrinksMachine();

        Drink drink1 = new Drink("Fanta", 500);
        HotDrink drink2 = new HotDrink("Cappucino", 60, 80);
        Drink drink3 = new Drink("Cola", 300);

        hotMachine.addDrink(drink1);
        hotMachine.addDrink(drink2);
        hotMachine.addDrink(drink3);

        System.out.println(hotMachine);

        System.out.println(drink2.getTemp());
    }
}
