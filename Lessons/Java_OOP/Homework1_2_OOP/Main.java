package Homework1_2_OOP;

public class Main {

    public static void main(String[] args) { 

        Human startHuman = new Human("Dmitry", 60, "Male");// Тот человек, с которого и начинается семейное древо

        FamilyTree familyTree = new FamilyTree(startHuman);

        Human mary = new Human("Mary", 58, "Female");
        startHuman.setSpouse(mary);  

        Human michael = new Human("Michael", 30, "Male");
        michael.setFather(startHuman);
        michael.setMother(mary);

        familyTree.addMember(mary);
        familyTree.addMember(michael);

        System.out.println(familyTree);

        Human foundHuman = familyTree.findHumanByName("Michael"); // Пробуем искать человека в семейном древе по имени - ищем Майкла
        if (foundHuman != null) {
            System.out.println("Found: " + foundHuman);
        } else {
            System.out.println("Human not found.");
        }
    }
}
