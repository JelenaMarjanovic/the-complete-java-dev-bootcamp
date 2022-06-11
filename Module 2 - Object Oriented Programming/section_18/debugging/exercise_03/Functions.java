public class Functions {
  public static void main(String[] args) {
    int random = random(15);

    System.out.println("Number: " + random);

    // Add case for 1, which is neither prime nor composite number
    System.out.println("Prime or Composite: " + (random == 1 ? "NEITHER" : isPrime(random)));
  }

  public static int random(int range) {
    // double random = Math.random() + range + 1; // will return [0, range+1] number
    double random = Math.random() * range + 1;

    return (int) random;
  }

  public static String isPrime(int random) {
    // String isPrime = "";

    // // for (int i = 0; i < random; i++) { // ArithmeticException: / by 0
    // // for (int i = 1; i < random; i++) { // every number will be composite, of 1
    // // and itself
    // for (int i = 2; i < random; i++) {
    // isPrime = (random % i == 0) ? "COMPOSITE" : "PRIME";

    // // we need to break if number is composite, not continuing
    // if (isPrime.equals("COMPOSITE")) {
    // break;
    // }

    // A bit of refactoring
    // String isPrime = "PRIME";

    // for (int i = 2; i < random; i++) {
    // if (random % i == 0) {
    // isPrime = "COMPOSITE";
    // break;
    // }
    // }

    // return isPrime;

    // Another approach
    for (int i = 2; i < random; i++) {
      if (random % i == 0) {
        return "COMPOSITE";
      }
    }

    return "PRIME";
  }
}
