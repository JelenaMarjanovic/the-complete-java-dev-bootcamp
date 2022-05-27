import java.util.Scanner;

public class Delimiters {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter two integers (on the same line)");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    // String numbers = scan.nextLine();

    System.out.println(("Enter two very big integers (on the same line)"));
    long bigNum1 = scan.nextLong();
    long bigNum2 = scan.nextLong();
    // String bigNumbers = scan.nextLine();

    System.out.println("Enter two decimals (on the same line)");
    double decimal1 = scan.nextDouble();
    double decimal2 = scan.nextDouble();
    // String decimals = scan.nextLine();

    System.out.println("Enter two text values (on the same line)");
    String text1 = scan.next();
    String text2 = scan.next();
    // String text = scan.nextLine();

    // -----------------------------------------------
    // System.out.println("Please enter a number");
    // int num = scan.nextInt();

    // scan.nextLine();
    // System.out.println("Please write a sentence");
    // String sentence = scan.nextLine();

    // System.out.println("Number: " + num);
    // System.out.println("Sentence: " + sentence);
    // -----------------------------------------------

    scan.close();

    System.out.println("\tIntegers: " + num1 + " " + num2);
    System.out.println("\tBig Integers: " + bigNum1 + " " + bigNum2);
    System.out.println("\tDecimals: " + decimal1 + " " + decimal2);
    System.out.println("\tWords: " + text1 + " " + text2);
    // System.out.println("\tIntegers: " + numbers);
    // System.out.println("\tBig Integers: " + bigNumbers);
    // System.out.println("\tDecimals: " + decimals);
    // System.out.println("\tWords: " + text);
  }
}
