import java.util.Scanner;

public class SignIn {
  public static void main(String[] args) {
    String username = "Samantha";
    String password = "Java <3";
    
    Scanner scan = new Scanner(System.in);

    System.out.println("\nWelcome to Javagram! Sign in below\n");
    
    System.out.print("• Username: ");
    String signInUsername = scan.nextLine();
    System.out.print("• Password: ");
    String signInPassword = scan.nextLine();

    while(!signInUsername.equals(username) || !signInPassword.equals(password)) {
      System.out.println("\nIncorrect, please try again!\n");

      System.out.print("• Username: ");
      signInUsername = scan.nextLine();
      System.out.print("• Password: ");
      signInPassword = scan.nextLine();
    }

    System.out.println("\nSign in successful. Welcome!");

    scan.close();
  }
}