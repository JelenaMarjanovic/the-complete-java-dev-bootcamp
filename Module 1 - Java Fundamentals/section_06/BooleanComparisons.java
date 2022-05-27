public class BooleanComparisons {
  public static void main(String[] args) {
    int chemistryGrade = 95;
    int biologyGrade = 75;
    int englishGrade = 75;

    System.out.println("Greater than");
    System.out.println(biologyGrade > chemistryGrade);

    System.out.println("\nLess than");
    System.out.println(biologyGrade < chemistryGrade);

    System.out.println("\nGreater than or equal to");
    System.out.println(chemistryGrade >= englishGrade);
    System.out.println(biologyGrade >= englishGrade);

    System.out.println("\nLess than or equal to");
    System.out.println(chemistryGrade <= englishGrade);
    System.out.println(biologyGrade <= englishGrade);

    System.out.println("\nEqual to");
    System.out.println(chemistryGrade == englishGrade);
    System.out.println(biologyGrade == englishGrade);

    System.out.println("\nNot equal to");
    System.out.println(chemistryGrade != englishGrade);
    System.out.println(biologyGrade != englishGrade);

    String sentence1 = "I love this course!";
    String sentence2 = "I love this course!";

    System.out.println("\nEqual to (for String)");
    System.out.println(sentence1.equals(sentence2));

    System.out.println("\nNot equal to (for String)");
    System.out.println(!sentence1.equals(sentence2));

    // double sales = 37.55;
    // double costs = 5.55;

    // System.out.println(sales > costs);
    // System.out.println(sales < costs);
  }
}
