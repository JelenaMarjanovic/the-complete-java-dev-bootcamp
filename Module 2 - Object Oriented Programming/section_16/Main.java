import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    String[] parts = {"tires", "keys"};

    Car nissan = new Car("Nissan", 5000, 2020, "red", parts);
    // Car nissan2 = nissan; // Reference trap
    // Car nissan2 = new Car("Nissan", 5000, 2020, "red");

    Car nissan2 = new Car(nissan);  // Copy constructor

    // nissan.make = "Nissan";
    // nissan.price = 5000;
    // nissan.year = 2020;
    // nissan.color = "red";

    // System.out.println(nissan.make);
    // System.out.println(nissan.price);
    // System.out.println(nissan.year);
    // System.out.println(nissan.color);

    parts[1] = "rim";

    Car dodge = new Car("Dodge", 11000, 2019, "blue", parts);

    nissan.setColor("Jet Black");
    dodge.setColor("Jet Black");

    nissan2.setColor("yellow");
    nissan2.setParts(new String[] {"tires", "filter"});

    nissan.setPrice(nissan.getPrice() / 2);
    dodge.setPrice(dodge.getPrice() / 2);

    // String[] outsideVariable = nissan.getParts();
    // outsideVariable[1] = "wheel";

    // System.out.println("Outside var: " + Arrays.toString(outsideVariable));

    // dodge.make = "Dodge";
    // dodge.price = 11000;
    // dodge.year = 2019;
    // dodge.color = "blue";

    // System.out.println("This " + nissan.getMake() + " is worth $" + nissan.getPrice() + ". It was built in " + nissan.getYear()
    //   + ". It is " + nissan.getColor() + ".\n");
    // System.out.println("This " + dodge.getMake() + " is worth $" + dodge.getPrice() + ". It was built in " + dodge.getYear()
    //   + ". It is " + dodge.getColor() + ".\n");
    // System.out.println("This " + nissan2.getMake() + " is worth $" + nissan2.getPrice() + ". It was built in " + nissan2.getYear()
    //   + ". It is " + nissan2.getColor() + ".\n");
    
    // System.out.println("Nissan parts: " + Arrays.toString(nissan.getParts()));
    // System.out.println("Dodge parts: " + Arrays.toString(dodge.getParts()));
    // System.out.println("Nissan2 parts: " + Arrays.toString(nissan2.getParts()));

    System.out.println(nissan);
    System.out.println(dodge);
    System.out.println(nissan2);

    // nissan.drive();
    // dodge.drive();
    // nissan2.drive();

    Dealership dealership = new Dealership();
  }
}
