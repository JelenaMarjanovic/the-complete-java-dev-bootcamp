public class RandomNumbers {
  public static void main(String[] args) {
    int[][] randomNumbers = new int[100][10];

    for (int i = 0; i < randomNumbers.length; i++) {
      for (int j = 0; j < randomNumbers[i].length; j++) {
        randomNumbers[i][j] = randomNumber();
      }
    }

    print2DArray(randomNumbers);
  }

  /**
   * Function name: randomNumber.
   * @return randomNumber (int)
   * 
   * Inside the function:
   *  1. return a random number between 1 and 100. 
   */
  public static int randomNumber() {
    return (int)(Math.random() * 100 + 1);
  }

  /**
   * Function name: print2DArray
   * @param array ( int[][] )
   *
   * Inside the function:
   *  1. prints the array such that:
   *    • Each row takes up one line.
   *    • There's a space between each value.
   */
  public static void print2DArray(int[][] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        System.out.print(array[i][j] + " ");
      }

      System.out.print("\n");
    }
  }
}