public class Conditionals {
  public static void main(String[] args) {
    String option = "";

    // (int)[0-1) * 1 + 3 = 0 * 1 + 3 = 0 + 3 = 3
    // int random = (int) Math.random() * 1 + 3;

    // (int)([0,1) * 1 + 3) = (int)([0,1) + 3) = (int)([3,4)) = 3
    // int random = (int) (Math.random() * 1 + 3);

    int random = (int) (Math.random() * 3 + 1);

    // Missing breaks after every case
    switch (random) {
      case 1:
        option = "hit";
        break;
      case 2:
        option = "stay";
        break;
      case 3:
        option = "fold";
        break;
      default:
        option = "This should never get called";
        break;
    }

    // Wrong operator
    // if (!option.equals("hit") || !option.equals("stay")) {

    if (!option.equals("hit") && !option.equals("stay")) {
      System.out.println("fold");
    } else {
      System.out.println(option);
    }
  }
}
