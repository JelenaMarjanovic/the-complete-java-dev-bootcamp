public class HighScore {
  public static void main(String[] args) {
    int[] scores = {randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(),
        randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber()};
    
    System.out.print("Here are the scores: ");
    for (int i = 0; i < scores.length; i++) {
      System.out.print(scores[i] + " ");
    }

    int highScore = 0;
    int seat = 0;

    for (int i = 0; i < scores.length; i++) {
      if (scores[i] > highScore) {
        highScore = scores[i];
        seat = i;
      }
    }

    System.out.println("\nThe highest score is: " + highScore + ". Impressive!");
    System.out.println("It's the gentleman in seat: " + seat + ". Give that man a cookie!");
  }
  
  /**
   * Function name – randomNumber
   * @return random number (int)
   * 
   * Inside the function
   *  - returns a random number between 0 and 50000
   */
  public static int randomNumber() {
    return (int)(Math.random() * 50000);
  }
}