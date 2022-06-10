public class Conditionals {
  public static void main(String[] args) {
    // Test Case 1
    int age = 24;
    double debt = 4000;

    // // Test Case 2
    // int age = 16;
    // double debt = 4000;

    // // Test Case 3
    // int age = 16;
    // double debt = 0;

    // // Test Case 4
    // int age = 24;
    // double debt = 0;

    // String creditScore = debt > 0 ? "Good" : "Bad";
    String creditScore = debt > 0 ? "Bad" : "Good";
    // boolean canApply = age < 18;
    boolean canApply = age >= 18;

    // if (!canApply && creditScore.equals("Good")) {
    if (canApply && creditScore.equals("Good")) {
      System.out.println("We're processing your application");
    } else {
      System.out.println("You cannot apply");
    }
  }
}