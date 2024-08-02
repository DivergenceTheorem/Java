package Homework1_OOP;
import java.util.ArrayList;
import java.util.List;

public class HotDrinksMachine {
    private List<Drink> drinks;

    public HotDrinksMachine() {
        drinks = new ArrayList<>();
    }

    public int size() {
        return drinks.size();
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public Drink getByName(String name) {
        for (Drink drink : drinks){
            if(drink.getName().equals(name)){
                return drink;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список напитков: \n");
        for (Drink drink : drinks) {
            stringBuilder.append(drink);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
