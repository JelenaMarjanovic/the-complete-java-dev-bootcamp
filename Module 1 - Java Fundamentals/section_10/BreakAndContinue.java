public class BreakAndContinue {
  public static void main(String[] args) {
    System.out.println("Continue - only even numbers from 0 to 10");
    for (int i = 0; i <= 10; i++) {
      if (i % 2 != 0) {
        continue;
      }

      System.out.println(i);
    }

    System.out.println("\nBreak - if dividable with 5 (from 1 to 10), break the loop");
    for (int i = 1; i <= 10; i++) {
      if (i % 5 == 0) {
        break;
      }

      System.out.println(i);
    }
  }
}
