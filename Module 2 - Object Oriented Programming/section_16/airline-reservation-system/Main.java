import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Person p = new Person("Rayan Slim", "Canadian", "01/01/1111", 5);

    System.out.println("Name: " + p.name + "\nNationality: " + p.nationality
      + "\nDate of Birth: " + p.dateOfBirth +"\nSeat Number: " + p.seatNumber + "\n");
  }
}
