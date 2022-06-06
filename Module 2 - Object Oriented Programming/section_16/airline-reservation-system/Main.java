import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Person p = new Person("Rayan Slim", "Canadian", "01/01/1111", 5);

    p.setSeatNumber(10);

    System.out.println("Name: " + p.getName() + "\nNationality: " + p.getNationality()
      + "\nDate of Birth: " + p.getDateOfBirth() +"\nSeat Number: " + p.getSeatNumber() + "\n");
  }
}
