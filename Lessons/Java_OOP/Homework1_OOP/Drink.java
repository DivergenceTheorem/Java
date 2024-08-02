package Homework1_OOP;

public class Drink {
    private String name;
    private double volume;

    public Drink(String name, double volume) { 
        this.name = name;
        this.volume = volume;
    }

    public Drink(){

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setVolume(double volume){
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "name: " + name + ", volume: " + volume + "ml.";
    }

}
