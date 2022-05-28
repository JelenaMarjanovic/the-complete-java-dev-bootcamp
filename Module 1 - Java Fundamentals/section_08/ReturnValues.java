public class ReturnValues {
  public static void main(String[] args) {
    double length1 = 4.3;
    double width1 = 2.2;
    String option1 = "area";
    double length2 = 3.2;
    double width2 = 4.1;
    String option2 = "perimeter";
    double length3 = -1;
    double width3 = 2.2;
    String option3 = "area";

    double measure1 = measureRectangle(length1, width1, option1);
    double measure2 = measureRectangle(length2, width2, option2);
    double measure3 = measureRectangle(length3, width3, option3);

    measurePrinter(length1, width1, measure1, option1);
    measurePrinter(length2, width2, measure2, option2);
    measurePrinter(length3, width3, measure3, option3);

  }

  public static double measureRectangle(double length, double width, String option) {
    if (length < 0 || width < 0) {
      System.out.println("Length or width cannot be negative!");
      System.exit(0);
    }
    switch (option) {
      case "area":
        return length * width;
      case "perimeter":
        return 2 * (length + width);
      default:
        return 404;
    }
  }

  public static void measurePrinter(double length, double width, double measure, String option) {
    System.out.println("The " + option + " of the rectangle with length "
      + length + " and width " + width + " is equal to " + measure + "\n");
  }
}
