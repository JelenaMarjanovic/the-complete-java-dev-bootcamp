import java.util.Scanner;

public class DiceJack {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int roll1 = rollDice();
    int roll2 = rollDice();
    int roll3 = rollDice();

    System.err.println("Enter three numbers between 1 and 6");

    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    int num3 = scan.nextInt();

    if (num1 < 1 || num2 < 1 || num3 < 1) {
      System.out.println("Numbers cannot be less than 1.\nShutting the game down!");
      System.exit(0);
    }

    if (num1 > 6 || num2 > 6 || num3 > 6) {
      System.out.println("Numbers cannot be greater than 6.\nShutting the game down!");
      System.exit(0);
    }

    int sumOfNumbers = num1 + num2 + num3;
    int sumDiceRolls = roll1 + roll2 + roll3;

    System.out.println("Dice sum = " + sumDiceRolls);
    System.out.println("Number sum = " + sumOfNumbers);

    if (checkWin(sumDiceRolls, sumOfNumbers)) {
      System.out.println("Congrats! You win!");
    } else {
      System.out.println("Sorry! You lose");
    }

    scan.close();
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

  /**
   * Function name = checkWin
   * @param sumDiceRolls  (int)
   * @param sumOfNumbers  (int)
   * @return              (boolean)
   * 
   * Inside the function
   *  1. Check if dice rolls sum is smaller than number sum
   *  2. AND the difference between the two numbers is less than 3
   */
  public static boolean checkWin(int sumDiceRolls, int sumOfNumbers) {
    return sumOfNumbers > sumDiceRolls && sumOfNumbers - sumDiceRolls < 3;
  }
}
