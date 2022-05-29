public class Scope {
  static int dogs = 7;
  public static void main(String[] args) {
    // int apples = 5;
    someFunction();
    // System.out.println(apples);
    System.out.println("The main method: " + dogs);
  }

  public static void someFunction() {
    // int apples = 5;
    // System.out.println(apples);
    System.out.println("The function: " + dogs);
  }
}
