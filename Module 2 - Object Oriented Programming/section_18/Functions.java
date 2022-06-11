public class Functions {
  public static void main(String[] args) {
    // // Initial case
    // int gryffindor = 500;
    // int ravenclaw = 100;

    // // Test case 1
    // int gryffindor = 850;
    // int ravenclaw = 500;

    // // Test case 2
    // int gryffindor = 620;
    // int ravenclaw = 500;

    // // Test case 3
    // int gryffindor = 450;
    // int ravenclaw = 500;

    // Test case 4
    int gryffindor = 100;
    int ravenclaw = 500;

    // int pointsMargin = ravenclaw - gryffindor; // wrong order
    int pointsMargin = gryffindor - ravenclaw;

    int ranking = ranking(pointsMargin);

    System.out.println(ranking);
  }

  public static int ranking(int pointsMargin) {
    // Needs re-ordering, from highest to lowest
    // if (pointsMargin < -100) {
    // return 4;
    // } else if (pointsMargin >= -100) {
    // return 3;
    // } else if (pointsMargin >= 0) {
    // return 2;
    // } else {
    // return 1;
    // }

    if (pointsMargin > 300) {
      return 1;
    } else if (pointsMargin > 0) {
      return 2;
    } else if (pointsMargin > -100) {
      return 3;
    } else {
      return 4;
    }
  }
}