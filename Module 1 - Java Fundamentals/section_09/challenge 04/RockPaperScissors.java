import java.util.Scanner;

public class RockPaperScissors {
  public static void main(String[] args) {
      
    Scanner scan = new Scanner(System.in);

    System.out.println("Let's play Rock Paper Scissors.");
    System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
    System.out.println("Are you ready? Write 'yes' if you are.");

    // Task 1: See if the user wants to play.
    String ready = scan.nextLine();

    // Task 2: Set up the game
    if (ready.equals("yes")) {
      System.out.println("\nGreat!");
      System.out.println("rock – paper – scissors, shoot!");

      String userChoice = scan.nextLine();
      String computerChoice = computerChoice();
      String result = result(userChoice, computerChoice);

      printResult(userChoice, computerChoice, result);
    } else {
      System.out.println("Darn, some other time...!");
    }

    scan.close();
  }

  /**
   * Function name: computerChoice - picks randomly between rock paper and scissors
   * @return a choice (String)
   * 
   * Inside the function:
   *  1. Picks a random number between 0 and 2.
   *  2. if 0: returns the choice 'rock'
   *     if 1: returns the choice 'paper'
   *     if 2: returns the choice 'scissors'
   */
  public static String computerChoice() {
    int randomNumber = (int)(Math.random() * 3);

    switch (randomNumber) {
      case 0:
        return "rock";
      case 1:
        return "paper";
      case 2:
        return "scissors";
      default:
        return "no choice";
    }
  }

  /**
   * Function name: result - It returns the result of the game.
   *  @param yourChoice       (String)
   *  @param computerChoice   (String) 
   *  @return result          (String)
   *
   * Inside the function:
   *  1. result is "You win" if:
   *     You: "rock"      Computer: "scissors"
   *     You: "paper"     Computer: "rock"
   *     You: "scissors"  Computer: "paper"
   *  2. result is "You lose" if:
   *     Computer: "rock"      You: "scissors"
   *     Computer: "paper"     You: "rock"
   *     Computer: "scissors"  You: "paper"
   *  3. result is "It's a tie" if:
   *     your choice equals computer choice.
   */
  public static String result(String yourChoice, String computerChoice) {
    String result = "";

    if ((yourChoice.equals("rock") && computerChoice.equals("scissors")) ||
      (yourChoice.equals("paper") && computerChoice.equals("rock")) ||
      (yourChoice.equals("scissors") && computerChoice.equals("paper"))) {
      result = "You win!";
    } else if ((computerChoice.equals("rock") && yourChoice.equals("scissors")) ||
      (computerChoice.equals("paper") && yourChoice.equals("rock")) ||
      (computerChoice.equals("scissors") && yourChoice.equals("paper"))) {
      result = "You lose.";
    } else if (yourChoice.equals(computerChoice)) {
      result = "It's a tie.";
    }

    return result;
  }

  /**
   * Name: printResult - It prints everything (your choice, computer choice, result)
   * @param yourChoice        (String)
   * @param computerChoice    (String)
   * @param result            (String)
   * 
   * Inside the function:
   *  1. prints everything:
   *    – prints: You chose:          <your choice>
   *    – prints: The computer chose: <computer choice>
   *    – prints: <result>
   */
  public static void printResult(String yourChoice, String computerChoice, String result) {
    System.out.println("\nYou chose:\t\t" + yourChoice);
    System.out.println("The computer chose:\t" + computerChoice);
    System.out.println(result);
  }
}