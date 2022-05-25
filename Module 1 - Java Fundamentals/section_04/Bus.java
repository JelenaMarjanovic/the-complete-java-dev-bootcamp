public class Bus {
  public static void main(String[] args) {
    String sentence = "Number of passengers: ";

    int passengers = 0;
    System.out.println(sentence + passengers);

    System.out.println("First stop...");;
    passengers += 9;
    System.out.println(sentence + passengers);

    System.out.println("Dropping off...");
    passengers -= 5;
    System.out.println(sentence + passengers);

    System.out.println("Last stop...");
    passengers -= 4;
    System.out.println(sentence + passengers);

    // sentence = "End of shift.";
    // System.out.println(sentence);
    System.out.println("End of shift.");
  }
}
