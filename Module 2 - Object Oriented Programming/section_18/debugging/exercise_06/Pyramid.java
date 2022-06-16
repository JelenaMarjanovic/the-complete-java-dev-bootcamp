public class Pyramid {

  public static void main(String[] args) {
    int rows = 5;

    // 1. Reverse to start from the end of the row
    for (int i = rows; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        // 2. Print the * at the end of the current line
        if (j == i) {
          System.out.print("* ");
        }

        // 3. Otherwise, add 2 spaces
        System.out.print("  ");
      }

      System.out.println();
    }
  }
}
