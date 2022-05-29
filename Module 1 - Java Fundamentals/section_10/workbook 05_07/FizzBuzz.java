public class FizzBuzz {
  public static void main(String[] args) {
    for (int i = 0; i <= 18; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println(i + "\tFizzBuzz");
      } else if (i % 3 == 0) {
        System.out.println(i + "\tFizz");
      } else if (i % 5 == 0) {
        System.out.println(i + "\tBuzz");
      }
    }
  }

}