import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Car[] cars = new Car[] {
      new Car("Nissan", 5000, 2020, "red", new String[] {"tires", "keys"}),
      new Car("Dodge", 8500, 2019, "blue", new String[] {"tires", "rim"}),
      new Car("Nissan", 5000, 2017, "yellow", new String[] {"tires", "filter"})
    };

    Dealership dealership = new Dealership();

    for (int i = 0; i < cars.length; i++) {
      dealership.setCar(cars[i], i);
    }

    dealership.sell(2);

    System.out.println("Searching for Nissan with $3000...");
    System.out.println(dealership.search("Nissan", 3000));

    System.out.println("Searching for Dodge with $10000...");
    System.out.println(dealership.search("Dodge", 10000));
  }
}
