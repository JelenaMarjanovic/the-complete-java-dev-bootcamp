public class ReturnValues {
  public static void main(String[] args) {
    double length1 = 4.3;
    double width1 = 2.2;
    double length2 = 3.2;
    double width2 = 4.1;
    double length3 = 3.5;
    double width3 = 1.2;
    double length4 = 1.6;
    double width4 = 5.6;
    double length5 = 10.1;
    double width5 = 0.7;
    double length6 = 20.2;
    double width6 = 5.6;

    double area1 = measureRectangle(length1, width1);
    double area2 = measureRectangle(length2, width2);
    double area3 = measureRectangle(length3, width3);
    double area4 = measureRectangle(length4, width4);
    double area5 = measureRectangle(length5, width5);
    double area6 = measureRectangle(length6, width6);

    areaPrinter(length1, width1, area1);
    areaPrinter(length2, width2, area2);
    areaPrinter(length3, width3, area3);
    areaPrinter(length4, width4, area4);
    areaPrinter(length5, width5, area5);
    areaPrinter(length6, width6, area6);

  }

  public static double measureRectangle(double length, double width) {
    double area = length * width;

    return area;
  }

  public static void areaPrinter(double length, double width, double area) {
    System.out.println("The area of the rectangle with length "
      + length + " and width " + width + " is equal to " + area + "\n");
  }
}
