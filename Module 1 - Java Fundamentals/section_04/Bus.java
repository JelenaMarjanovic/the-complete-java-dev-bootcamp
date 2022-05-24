public class Bus {
  public static void main(String[] args) {
    int passengers = 0;

    System.out.println("First stop");;
    passengers += 9;
    System.out.println(passengers);

    System.out.println("Dropping off");
    passengers -= 5;
    System.out.println(passengers);

    System.out.println("Last stop");
    passengers -= 4;
    System.out.println(passengers);
  }
}
