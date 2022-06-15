public class Pyramid {
  public static void main(String[] args) {
    char letter = 'a';

    for (int i = 1; i < 10; i++) {
      if (i % 2 == 0) {
        System.out.print("\n");
        continue;
      }

      // 2. It should print only one letter per row
      // for (int j = 1; j <= 10; j++) {

      for (int j = 1; j <= i; j++) {
        // 1. The first letter should start with 'a', not 'b'
        // letter++;

        if (j < i) {
          System.out.print("   ");
        } else {
          System.out.print(" " + letter + " ");
        }
      }

      letter++;

      System.out.print("\n");
    }
  }
}
