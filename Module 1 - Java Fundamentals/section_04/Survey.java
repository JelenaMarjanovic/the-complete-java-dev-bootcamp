import java.util.Scanner;

public class Survey {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int counter = 0;

    System.out.println("Welcome! Thank you for taking the survey.");
    
    // Question 1
    System.out.println("\nWhat is your name?");
    counter++;
    String name = scan.nextLine();

    // Question 2
    System.out.println("\nHow much money do you spend on coffee?");
    counter++;
    double coffeePrice = scan.nextDouble();

    // Question 3
    System.out.println("\nHow much money do you spend on fast food?");
    counter++;
    double foodPrice = scan.nextDouble();

    // Question 4
    System.out.println("\nHow many times a week do you buy coffee?");
    counter++;
    int coffeeAmount = scan.nextInt();

    // Question 5
    System.out.println("\nHow many time a week do you buy fast food?");
    counter++;
    int foodAmount = scan.nextInt();

    scan.close();

    System.out.println("\nThank you, " + name + ", for answering all " + counter + " questions.");
    System.out.println("Your fast food expenses are " + (foodPrice / coffeePrice) + " times more than your coffee expenses.");
    System.out.println("Weekly, you spend $" + (coffeeAmount * coffeePrice) + " on coffee.");
    System.out.println("Weekly, you spend $" + (foodAmount * foodPrice) + " on food.");
  }
}
