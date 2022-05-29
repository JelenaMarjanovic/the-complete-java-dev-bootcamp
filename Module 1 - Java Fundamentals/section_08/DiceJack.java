public class DiceJack {
  public static void main(String[] args) {
    int roll1 = rollDice();
    int roll2 = rollDice();
    int roll3 = rollDice();

    System.out.println(roll1);
    System.out.println(roll2);
    System.out.println(roll3);
  }

  /**
   * Function name - rollDice
   * @return  (int)
   * 
   * Inside the function
   *  1. return generated random integer between 1 and 6
   */
  public static int rollDice() {
    double randomNumber = Math.random() * 6;
    randomNumber += 1;

    return (int)randomNumber;
  }
}
