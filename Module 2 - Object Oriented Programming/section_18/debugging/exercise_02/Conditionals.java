public class Conditionals {
  public static void main(String[] args) {
    int age = 24;
    double debt = 4000;

    // // Test Case 2
    // int age = 16;
    // double debt = 4000;

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