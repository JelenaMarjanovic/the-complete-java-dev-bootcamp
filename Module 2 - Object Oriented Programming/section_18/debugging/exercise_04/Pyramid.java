public class Pyramid {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      // for (int j = 0; j < 10; j++) {
      // 2. Reduce the number of *s in one line
      // for (int j = 0; j < i; j++) {
      // 3. Remove an empty line
      for (int j = 0; j <= i; j++) {
        // 4. Print * only at the end of the current line
        if (j == i) {
          System.out.print(" * ");
        }

        System.out.print("   ");
      }

      // 1. Move to the new line after each inner iteration
      System.out.print("\n");
    }
  }
}