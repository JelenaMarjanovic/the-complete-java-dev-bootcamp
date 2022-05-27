public class Championship {
  public static void main(String[] args) {

      int gryffindor = 400;
      int ravenclaw = 200;

      // Test case 1:
      // int gryffindor = 850;
      // int ravenclaw = 500;

      // Test case 2:
      // int gryffindor = 620;
      // int ravenclaw = 500;

      // Test case 3:
      // int gryffindor = 450;
      // int ravenclaw = 500;

      // Test case 4:
      // int gryffindor = 100;
      // int ravenclaw = 500;

      int margin = gryffindor - ravenclaw;

      if (margin >= 300) {
        System.out.println("Gryffindor takes the house cup!");
      } else if (margin >= 0) {
        System.out.println("In second place, Gryffindor!");
      } else if (margin >= -100) {
        System.out.println("In third place, Gryffindor!");
      } else {
        System.out.println("In fourth place, Gryffindor! ");
      }
  }
}