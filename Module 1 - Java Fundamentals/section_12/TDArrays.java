// import java.util.Arrays;

public class TDArrays {
  public static void main(String[] args) {
    // int[][] grades = new int[3][4];
    int[][] grades = {
      {72, 74, 78, 76}, // Harry's grades
      {65, 64, 61, 67}, // Ron's grades
      {95, 98, 99, 100}  // Hermione's grades
    };
    String[] names = {"Harry", "Ron", "Hermione"};

    // // Harry's grades
    // grades[0][0] = 72;
    // grades[0][1] = 74;
    // grades[0][2] = 78;
    // grades[0][3] = 76;

    // // Ron's grades
    // grades[1][0] = 65;
    // grades[1][1] = 64;
    // grades[1][2] = 61;
    // grades[1][3] = 67;

    // // Hermione's grades
    // grades[2][0] = 95;
    // grades[2][1] = 98;
    // grades[2][2] = 99;
    // grades[2][3] = 100;

    // System.out.println("Grades:");
    // System.out.println("\tHarry:\t\t" + Arrays.toString(grades[0]));
    // System.out.println("\tRon:\t\t" + Arrays.toString(grades[1]));
    // System.out.println("\tHermione:\t" + Arrays.toString(grades[2]));
    // System.out.println("\tHarry:\t\t" + grades[0][0] + " " + grades[0][1] + " " + grades[0][2] + " " + grades[0][3]);
    // System.out.println("\tRon:\t\t" + grades[1][0] + " " + grades[1][1] + " " + grades[1][2] + " " + grades[1][3]);
    // System.out.println("\tHermione:\t" + grades[2][0] + " " + grades[2][1] + " " + grades[2][2] + " " + grades[2][3]);

    printGrades(grades, names);
  }

  /**
   * Function name - printGrades
   * @param grades (int[][])
   * @param names  (String[])
   * 
   * Inside the function, prints grades by name, line by line
   */
  public static void printGrades(int[][] grades, String[] names) {
    System.out.println("Grades:");
    for (int i = 0; i < grades.length; i++) {
      System.out.print("\t" + names[i] + "'s grades: ");
      for (int j = 0; j < grades[i].length; j++) {
        System.out.print(grades[i][j] + " ");
      }
      System.out.println();
    }
  }
}
