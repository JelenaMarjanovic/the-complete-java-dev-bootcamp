import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Person p = new Person();

    p.name = "Rayan Slim";
    p.nationality = "Canadian";
    p.dateOfBirth = "01/01/1111";
    p.passport = new String[]{p.name, p.nationality, p.dateOfBirth};
    p.seatNumber = 5;

    System.out.println(p.name);
    System.out.println(p.nationality);
    System.out.println(p.dateOfBirth);
    System.out.println(Arrays.toString(p.passport));
    System.out.println(p.seatNumber);
  }
}
