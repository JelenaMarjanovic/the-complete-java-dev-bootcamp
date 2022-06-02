import java.util.Arrays;
import java.util.Scanner;

public class Hangman {

  public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
  "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
  "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
  "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
  "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
  "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
  "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
  "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
  "wombat", "zebra"};

  public static String[] gallows = {"+---+\n" +
  "|   |\n" +
  "    |\n" +
  "    |\n" +
  "    |\n" +
  "    |\n" +
  "=========\n",

  "+---+\n" +
  "|   |\n" +
  "O   |\n" +
  "    |\n" +
  "    |\n" +
  "    |\n" +
  "=========\n",

  "+---+\n" +
  "|   |\n" +
  "O   |\n" +
  "|   |\n" +
  "    |\n" +
  "    |\n" +
  "=========\n",

  " +---+\n" +
  " |   |\n" +
  " O   |\n" +
  "/|   |\n" +
  "     |\n" +
  "     |\n" +
  " =========\n",

  " +---+\n" +
  " |   |\n" +
  " O   |\n" +
  "/|\\  |\n" + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
  "     |\n" +
  "     |\n" +
  " =========\n",

  " +---+\n" +
  " |   |\n" +
  " O   |\n" +
  "/|\\  |\n" +
  "/    |\n" +
  "     |\n" +
  " =========\n",

  " +---+\n" +
  " |   |\n" +
  " O   |\n" +
  "/|\\  |\n" + 
  "/ \\  |\n" +
  "     |\n" +
  " =========\n"};

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // Choose a random word
    String word = randomWord();

    // Prepare the initial word with placeholders instead of letters
    char[] placeholders = new char[word.length()];
    for (int i = 0; i < placeholders.length; i++) {
      placeholders[i] = '_';
    }

    // Show the gallows
    int misses = 0;
    char[] missedGuesses = new char[6];

    while (misses < 6) {
      System.out.print(gallows[misses]);

      // Show the chosen word using placeholders - underscores
      System.out.print("Word:\t");
      printPlaceholders(placeholders);
      System.out.print("\n");

      // Show the missed guesses
      System.out.print("Misses:\t");
      printMissedGuesses(missedGuesses);
      System.out.print("\n\n");

      // Store a guess
      System.out.print("Guess:\t");
      char guess = scan.nextLine().toLowerCase().charAt(0);
      System.out.print("\n");

      // Replace placeholders with correct guesses
      // Otherwise add guess to missed guesses and move to the next try
      if (checkGuess(word, guess)) {
        updatePlaceholders(word, placeholders, guess);
      } else {
        missedGuesses[misses] = guess;
        misses++;
      }

      // If the user wins
      if (Arrays.equals(placeholders, word.toCharArray())) {
        System.out.println(gallows[misses]);
        System.out.println("\nWord:\t");
        printPlaceholders(placeholders);
        System.out.println("\nGOOD WORK!");
        break;
      }

    }

    // If the user loses
    if (misses == 6) {
      System.out.println(gallows[6]);
      System.out.println("\nRIP!");
      System.out.println("\nThe word was: '" + word + "'.");
    }

    scan.close();
  }

  /**
   * Function name: randomWord
   * @return (String)
   * 
   * Returns a random word from the list of random words.
   */
  public static String randomWord() {
    int numOfWords = words.length;
    int randomIdx = (int)(Math.random() * numOfWords);

    return words[randomIdx];
  }
  
  /**
   * Function name: printPlaceholders
   * @param placeholders  (char[])
   * 
   * Prints the placeholders.
   */
  public static void printPlaceholders(char[] placeholders) {
    for (int i = 0; i < placeholders.length; i++) {
      System.out.print(" " + placeholders[i]);
    }
    
    System.out.print("\n");
  }

  /**
   * Function name: printMissedGuesses
   * @param misses  (char[])
   * 
   * Prints guesses that the user missed.
   */
  public static void printMissedGuesses(char[] misses) {
    for (int i = 0; i < misses.length; i++) {
      System.out.print(misses[i] + " ");
    }
  }

  /**
   * Function name: checkGuess
   * @param word    (String)
   * @param guess   (char)
   * @return        (boolean)
   * 
   * Returns true if the user guessed a letter from the word correctly.
   */
  public static boolean checkGuess(String word, char guess) {
    for (int i = 0; i < word.length(); i++) {
      if (word.charAt(i) == guess) {
        return true;
      }
    }

    return false;
  }

  /**
   * Function name: updatePlaceholders
   * @param word          (String)
   * @param placeholders  (char[])
   * @param guess         (char)
   * 
   * Updates the placeholders when the user makes a correct guess.
   */
  public static void updatePlaceholders(String word, char[] placeholders, char guess) {
    for (int i = 0; i < word.length(); i++) {
      if (word.charAt(i) == guess) {
        placeholders[i] = guess;
      }
    }
  }
}
