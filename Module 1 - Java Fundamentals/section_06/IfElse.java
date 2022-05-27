public class IfElse {
  public static void main(String[] args) {
    int grade1 = 65;
    int grade2 = 45;

    int grade3 = 50;

    if (grade1 > 50) {
      System.out.println("Great job, student1, you passed with " + grade1 + "!");
    }

    if (grade2 > 50) {
      System.out.println("Great job, student2, you passed with " + grade2 + "!");
    } else {
      System.out.println("Student2, study hard next time!");
    }

    if (grade3 >= 50) {
      System.out.println("Great job, student3, you passed with " + grade3 + "!");
    }
  }
}
