package Homework1_OOP;

public class HotDrink extends Drink {
    private int temp;

    public HotDrink(String name, double volume, int temp) {
        super(name, volume);
        this.temp = temp;
    }

    public HotDrink(){

    }

    public void setTemp(int temp){
        this.temp = temp;
    }

    public int getTemp(){
        return temp;
    }

    @Override
    public String toString() {
        return super.toString() + ", temp: " + temp + " C";
    }
}
