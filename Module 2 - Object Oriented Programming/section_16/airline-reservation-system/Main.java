import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Person p1 = new Person("Rayan Slim", "Canadian", "01/01/1111", 5);
    Person p2 = new Person(p1);

    p1.setSeatNumber(10);

    p2.setName("Jad Slim");
    p2.setSeatNumber(3);

    System.out.println("Name: " + p1.getName() + "\nNationality: " + p1.getNationality()
      + "\nDate of Birth: " + p1.getDateOfBirth() +"\nSeat Number: " + p1.getSeatNumber() + "\n");
    System.out.println("Name: " + p2.getName() + "\nNationality: " + p2.getNationality()
      + "\nDate of Birth: " + p2.getDateOfBirth() +"\nSeat Number: " + p2.getSeatNumber() + "\n");
  }
}
