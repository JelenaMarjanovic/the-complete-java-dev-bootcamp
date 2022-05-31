public class Prices {
  public static void main(String[] args) {
    double[][] prices = {
      {12.99, 8.99, 9.99, 10.49, 11.99},
      {0.99, 1.99, 2.49, 1.49, 2.99},
      {8.99, 7.99, 9.49, 9.99, 10.99}
    };
    
    // double[][] prices = new double[3][5];

    // prices[0][0] = 12.99;
    // prices[0][1] = 8.99;
    // prices[0][2] = 9.99;
    // prices[0][3] = 10.49;
    // prices[0][4] = 11.99;

    // prices[1][0] = 0.99;
    // prices[1][1] = 1.99;
    // prices[1][2] = 2.49;
    // prices[1][3] = 1.49;
    // prices[1][4] = 2.99;

    // prices[2][0] = 8.99;
    // prices[2][1] = 7.99;
    // prices[2][2] = 9.49;
    // prices[2][3] = 9.99;
    // prices[2][4] = 10.99;

    // printPricesByDepartment(prices[0], "Baking");
    // printPricesByDepartment(prices[1], "Beverage");
    // printPricesByDepartment(prices[2], "Cereals");

    printPrices(prices);
  }

  /**
   * Function name - printPricesByDepartment
   * @param prices      (double[])
   * @param department  (String)
   * 
   * In function, print one row from 2D array and put department in the beginning of the line
   */
  public static void printPricesByDepartment(double[] prices, String department) {
    if (!(department.equals("Baking") || department.equals("Beverage") || department.equals("Cereals"))) {
      System.out.println("No such department!");
      System.exit(0);
    }

    System.out.print(department + ": ");
    for (int i = 0; i < prices.length; i++) {
      System.out.print(prices[i] + " ");
    }
    System.out.println();
  }

  /**
   * Function name - printPrices
   * @param prices  (double[][])
   * 
   * In function, print prices starting with the name of department, line by line
   */
  public static void printPrices(double[][] prices) {
    System.out.println("Prices:");

    for (int i = 0; i < prices.length; i++) {
      switch (i) {
        case 0:
          System.out.print("\tBaking: ");
          break;
        case 1:
          System.out.print("\tBeverage: ");
          break;
        case 2:
          System.out.print("\tCereals: ");
          break;
        default:
          break;
      }

      for (int j = 0; j < prices[i].length; j++) {
        System.out.print(prices[i][j] + " ");
      }

      System.out.println();
    }
  }
}