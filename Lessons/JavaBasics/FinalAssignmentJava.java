import java.util.HashSet;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

class Laptop {
    private String brand;
    private int ram;
    private int hdd;
    private String os;
    private String color;
    // Определяем свойства объекта Laptop класса Laptop
    public Laptop(String brand, int ram, int hdd, String os, String color) {
        this.brand = brand;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }
// Создадим каждый отдельный параметр - бренд, озу и т.д.
    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "Ноутбук: " +
                "бренд='" + brand + '\'' +
                ", ОЗУ=" + ram +
                ", ЖД=" + hdd +
                ", ОС='" + os + '\'' +
                ", Цвет='" + color + '\'' +
                '}';
    }
}


public class FinalAssignmentJava {
  public static void main(String[] args) {
    // Создаем коллекцию ноутбуков из класса Laptop, итого у нас будет так будет пять таких объектов:
      Set<Laptop> laptops = new HashSet<>();
      laptops.add(new Laptop("Dell", 2, 256, "Windows 10", "Вишневый"));
      laptops.add(new Laptop("HP", 8, 512, "Kali Linux", "Металлик"));
      laptops.add(new Laptop("Apple", 8, 256, "macOS", "Серый"));
      laptops.add(new Laptop("Asus", 16, 1024, "Ubuntu", "Черный"));
      laptops.add(new Laptop("Lenovo", 4, 128, "Windows 10", "Белый"));

      filter(laptops); // Вызываем функцию filter, котрая принимает нашу коллекцию и далее отсортировывает ее по введенным критериям
  }

  public static void filter(Set<Laptop> laptops) { // Фильтратор + Принимает критерии отбора
      Scanner scanner = new Scanner(System.in);
      Map<String, String> criteria = new HashMap<>(); // Используем Map для того, чтобы принять наши критерии

      System.out.println("Выберите параметр:");
      System.out.println("ОЗУ [1]");
      System.out.println("Объем ЖД [2]");
      System.out.println("Операционная система [3]");
      System.out.println("Цвет [4]");

      String input = scanner.nextLine();
      switch (input) {
          case "1":
              System.out.println("Введите минимальный объем ОЗУ (в ГБ):");
              criteria.put("ram", scanner.nextLine());
              break;
          case "2":
              System.out.println("Введите минимальный объем ЖД (в ГБ):");
              criteria.put("hdd", scanner.nextLine());
              break;
          case "3":
              System.out.println("Введите операционную систему:");
              criteria.put("os", scanner.nextLine());
              break;
          case "4":
              System.out.println("Введите цвет:");
              criteria.put("color", scanner.nextLine());
              break;
          default:
              System.out.println("Некорректный ввод.");
              return;
      }

      Set<Laptop> filteredLaptops = new HashSet<>(laptops); // Удаляет все ноутбуки, которые не прошли отбор и сохраняет в filteredLaptops
      for (Laptop laptop : laptops) {
          if (criteria.containsKey("ram") && laptop.getRam() < Integer.parseInt(criteria.get("ram"))) filteredLaptops.remove(laptop);
          if (criteria.containsKey("hdd") && laptop.getHdd() < Integer.parseInt(criteria.get("hdd"))) filteredLaptops.remove(laptop);
          if (criteria.containsKey("os") && !laptop.getOs().equalsIgnoreCase(criteria.get("os"))) filteredLaptops.remove(laptop);
          if (criteria.containsKey("color") && !laptop.getColor().equalsIgnoreCase(criteria.get("color"))) filteredLaptops.remove(laptop);
      }

      System.out.println("По запросу найдено следующее:");
      for (Laptop laptop : filteredLaptops) { // Выводим наш отфильтрованный список
          System.out.println(laptop);
      }
  }
}
