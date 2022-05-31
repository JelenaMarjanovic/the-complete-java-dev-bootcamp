import java.util.Arrays;

public class ReferenceTrap {
  public static void main(String[] args) {
    String[] staffLastYear = {"Tommy", "Joel", "Ellie"};
    // String[] staffThisYear = staffLastYear;

    // String[] staffThisYear = copyStaff(staffLastYear);

    String[] staffThisYear = Arrays.copyOf(staffLastYear, staffLastYear.length);

    staffThisYear[1] = "Abby";

    System.out.println("Staff last year:\n" + Arrays.toString(staffLastYear));
    System.out.println("\nStaff this year:\n" + Arrays.toString(staffThisYear));
  }

  /**
   * Function name - copyStaff
   * @param staff (String[])
   * @return      (String[])
   * 
   * 1. Inside the function make a copy of provided array and return it.
   */
  public static String[] copyStaff(String[] staff) {
    String[] staffCopy = new String[staff.length];

    for (int i = 0; i < staffCopy.length; i++) {
      staffCopy[i] = staff[i];
    }

    return staffCopy;
  }
}
