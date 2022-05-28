public class Weather {
  public static void main(String[] args) {
      double noon = 77;          // temperature at noon in fahrenheit
      double evening = 61;       // temperature during the evening in fahrenheit
      double midnight = 55;      // temperature at midnight in fahrenheit

      System.out.println("Temperature at noon");
      printTemperatures(noon);

      System.out.println("\nTemperature during the evening");
      printTemperatures(evening);

      System.out.println("\nTemperature at midnight");      
      printTemperatures(midnight);
  }

  /**
   * Function name: fahrenheitToCelsius - converts fahrenheit to celsius
   * @param fahrenheit (double)
   * @return celsius (double)
   */
  public static double fahrenheitToCelsius(double fahrenheit) {
    double celsius = (fahrenheit - 32) * 5/9;

    return celsius;
  }
  
  /**
   * Function name: printTemperatures – prints both temperature values. 
   * @param fahrenheit (double)
   */
  public static void printTemperatures(double fahrenheit) {
    System.out.println("F: " + fahrenheit);
    System.out.println("C: " + fahrenheitToCelsius(fahrenheit));
  }
}