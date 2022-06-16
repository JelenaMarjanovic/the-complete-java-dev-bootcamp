import java.util.Arrays;

public class ReferenceTrap {
  public static void main(String[] args) {
    String[] greeting = new String[] { "Hello", "John" };
    // Avoid a reference trap
    // String[] farewell = greeting;
    String[] farewell = Arrays.copyOf(greeting, greeting.length);

    farewell[0] = "Goodbye";

    System.out.println(Arrays.toString(greeting));
    System.out.println(Arrays.toString(farewell));
  }
}