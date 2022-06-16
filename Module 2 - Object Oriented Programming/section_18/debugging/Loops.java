public class Loops {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      // Will produce 10 lines with 9 *
      // for (int j = 0; j < i; j++) {

      // Avoid "skipping" the first line when j = 0, i = 0, 0 < 0 is false
      // for (int j = 0; j < i; j++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }

      // Switch to the new line after every inner loop
      System.out.print("\n");
    }
  }
}