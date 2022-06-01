import java.util.Scanner;

public class Javapedia {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("\n**********Javapedia**********");
    System.out.println("How many historical figures will you register?");
    
    int numOfFigures = scan.nextInt();
    
    String[][] database = new String[numOfFigures][3];

    scan.nextLine();

    for (int i = 0; i < database.length; i++) {
      System.out.println("\n\tFigure " + (i + 1)); 

      System.out.print("\t - Name: ");
      database[i][0] = scan.nextLine();  

      System.out.print("\t - Date of birth: ");
      database[i][1] = scan.nextLine();

      System.out.print("\t - Occupation: ");
      database[i][2] = scan.nextLine(); 

      System.out.print("\n");
    }

    System.out.println("These are the values you stored:"); 
    
    print2DArray(database);

    System.out.print("\nWho do you want information on? ");
    String figureName = scan.nextLine();
    
    printInfo(database, figureName);

    scan.close();
  }

  /**
   * Function name: print2DArray
   * @param array (String[][])
   * 
   * Inside the function
   *  1. print the database
   *     • a tab of space precedes each row.
   *     • each value in database has one space from the other value. 
   *     • print a new line.
   */
  public static void print2DArray(String[][] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print("\t");

      for (int j = 0; j < array[i].length; j++) {
        System.out.print(array[i][j] + " ");
      }

      System.out.print("\n");
    }
  }

  /**
   * Function name: printInfo
   * @param figures     (String[][])
   * @param figureName  (String)
   * 
   * Inside the function
   *  1. print info of the historical figure if exist in database
   *  2. or print info that there's no match
   */
  public static void printInfo(String[][] figures, String figureName) {
    System.out.println();
    
    for (int i = 0; i < figures.length; i++) {
      if (figures[i][0].equals(figureName)) {
        System.out.println("\tName: " + figures[i][0]);
        System.out.println("\tDate of birth: " + figures[i][1]);
        System.out.println("\tOccupation: " + figures[i][2]);

        return;
      }
    }

    System.out.println("There's no historical figure with that name in database.");
  }
}