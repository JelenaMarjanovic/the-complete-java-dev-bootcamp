import java.util.Scanner;

public class Blackjack {

  public static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("\nWelcome to Java Casino!");
    System.out.println("Do you have a knack for Black Jack?");
    System.out.println("We shall see..");
    System.out.println("..Ready? Press anything to begin!");
    scan.nextLine();

    int yourCard1 = drawRandomCard();
    int yourCard2 = drawRandomCard();

    System.out.println("\nYou get a\n" + cardString(yourCard1) + "\n and a \n" + cardString(yourCard2));

    int yourTotal = Math.min(yourCard1, 10) + Math.min(yourCard2, 10);
    System.out.println("Your total is: " + yourTotal);

    int dealerCard1 = drawRandomCard();
    int dealerCard2 = drawRandomCard();

    System.out.println("\nThe dealer shows\n" + cardString(dealerCard1) + "\nand has a card facing down\n" + faceDown());
    
    int dealerTotal = Math.min(dealerCard1, 10) + Math.min(dealerCard2, 10);
    System.out.println("\nThe dealer's total is hidden.");
    
    while (true) {
      String yourChoice = hitOrStay();

      if (yourChoice.equalsIgnoreCase("stay")) {
        break;
      }

      int yourNewCard = drawRandomCard();

      yourTotal += Math.min(yourNewCard, 10);

      System.out.println("\nYou get a\n" + cardString(yourNewCard));
      System.out.println("\nYour new total is: " + yourTotal);

      if (yourTotal > 21) {
        System.out.println("\nBust! Player loses.");
        System.exit(0);
      }
    }
    
    System.out.println("\nDealer's turn");
    System.out.println("\nThe dealer's cards are\n" + cardString(dealerCard1)
      + "\nand a\n" + cardString(dealerCard2));
    System.out.println("Dealer's total is: " + dealerTotal);

    while (dealerTotal < 17) {
      int dealerNewCard = drawRandomCard();

      dealerTotal += Math.min(dealerNewCard, 10);

      System.out.println("\nDealer gets a\n" + cardString(dealerNewCard));
      System.out.println("Dealer's total is: " + dealerTotal);
    }

    if (dealerTotal > 21) {
      System.out.println("\nBust! Dealer loses.");
      System.exit(0);
    }

    if (yourTotal > dealerTotal) {
      System.out.println("\nPlayer wins!");
    } else {
      System.out.println("\nDealer wins!");
    }

    scan.close();
  }

  /**
   * Function name – drawRandomCard
   * @return (int)
   *
   * Inside the function:
   *   1. Gets a random number between 1 and 13.
   *   2. Returns a card.
   */
  public static int drawRandomCard() {
    return (int)(Math.random() * 13 + 1);
  }

  /**
   * Function name – cardString
   * @param cardNumber (int)
   * @return (String)
   *
   * Inside the function:
   *   1. Returns a String drawing of the card.
   */
  public static String cardString(int cardNumber) {
    switch (cardNumber) {
      case 1:   
        return "   _____\n"+
              "  |A _  |\n"+ 
              "  | ( ) |\n"+
              "  |(_'_)|\n"+
              "  |  |  |\n"+
              "  |____V|\n";
      case 2:
        return  "   _____\n"+              
                "  |2    |\n"+ 
                "  |  o  |\n"+
                "  |     |\n"+
                "  |  o  |\n"+
                "  |____Z|\n";
      case 3:
        return"   _____\n" +
              "  |3    |\n"+
              "  | o o |\n"+
              "  |     |\n"+
              "  |  o  |\n"+
              "  |____E|\n";
      case 4:
        return "   _____\n" +
              "  |4    |\n"+
              "  | o o |\n"+
              "  |     |\n"+
              "  | o o |\n"+
              "  |____h|\n";
      case 5:
        return  "   _____ \n" +
                "  |5    |\n" +
                "  | o o |\n" +
                "  |  o  |\n" +
                "  | o o |\n" +
                "  |____S|\n";
      case 6:
        return  "   _____ \n" +
                "  |6    |\n" +
                "  | o o |\n" +
                "  | o o |\n" +
                "  | o o |\n" +
                "  |____6|\n";
      case 7:
        return  
                "   _____ \n" +
                "  |7    |\n" +
                "  | o o |\n" +
                "  |o o o|\n" +
                "  | o o |\n" +
                "  |____7|\n";
      case 8:
        return  "   _____ \n" +
                "  |8    |\n" +
                "  |o o o|\n" +
                "  | o o |\n" +
                "  |o o o|\n" +
                "  |____8|\n";
      case 9:
        return  "   _____ \n" +
                "  |9    |\n" +
                "  |o o o|\n" +
                "  |o o o|\n" +
                "  |o o o|\n" +
                "  |____9|\n";
      case 10:
        return  "   _____ \n" +
                "  |10  o|\n" +
                "  |o o o|\n" +
                "  |o o o|\n" +
                "  |o o o|\n" +
                "  |___10|\n";
      case 11:
        return  "   _____\n" +
                "  |J  ww|\n"+ 
                "  | o {)|\n"+ 
                "  |o o% |\n"+ 
                "  | | % |\n"+ 
                "  |__%%[|\n";
      case 12:
        return  "   _____\n" +
                "  |Q  ww|\n"+ 
                "  | o {(|\n"+ 
                "  |o o%%|\n"+ 
                "  | |%%%|\n"+ 
                "  |_%%%O|\n";
      case 13:
        return  "   _____\n" +
                "  |K  WW|\n"+ 
                "  | o {)|\n"+ 
                "  |o o%%|\n"+ 
                "  | |%%%|\n"+ 
                "  |_%%%>|\n";
      default:
        return "";
    }
  }

  public static String faceDown() {
    return
    "   _____\n"+
    "  |     |\n"+ 
    "  |  J  |\n"+
    "  | JJJ |\n"+
    "  |  J  |\n"+
    "  |_____|\n";
  }
  
  /**
   * Function name – hitOrStay
   * @return (String)
   *
   * Inside the function:
   *   1. Asks the user to hit or stay.
   *   2. If the user doesn't enter "hit" or "stay", keep asking them to try again by printing:
   *      Please write 'hit' or 'stay'
   *   3. Returns the user's option 
   */
  public static String hitOrStay() {
    System.out.println("\nWould you like to hit or stay?");
    String usersChoice = scan.nextLine();

    while (!(usersChoice.equalsIgnoreCase("hit") || usersChoice.equalsIgnoreCase("stay"))) {
      System.out.println("Please write 'hit' or 'stay'");
      usersChoice = scan.nextLine();
    }

    return usersChoice;
  }
}