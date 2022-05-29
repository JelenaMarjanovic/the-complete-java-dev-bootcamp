public class WhileLoops {
  public static void main(String[] args) {
    int number = 25;

    System.out.println("While loop:");
    while (number <= 30) {
      System.out.print(number + " ");
      number++;
    }

    System.out.println("\n\nFor loop:");
    for (int num = 25; num <= 30; num++) {
      System.out.print(num + " ");
    }

    System.out.println();

    double choice = 0.05;
    double guess = 0.99;

    System.out.println("\nGuessing game:");
    while (guess > choice) {
      guess = Math.random();

      System.out.println(guess);
    }
  }
}
