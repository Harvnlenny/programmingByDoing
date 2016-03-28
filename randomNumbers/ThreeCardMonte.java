import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte{
  public static void main( String[] args){

    Scanner keyboard = new Scanner(System.in);
    Random r = new Random();

    int real = 1 + r.nextInt(3);
    int guess;

    System.out.println("You slide up to Fast Eddie's card table and plop down your cash.");
    System.out.println("He glances at you out of the corner of his eye and starts shuffling.");
    System.out.println("He lays down three cards.");
    System.out.println();
    System.out.println("Which one is the ace?");
    System.out.println();
    System.out.println("        ##  ##  ##");
    System.out.println("        ##  ##  ##");
    System.out.println("        1   2   3 ");
    System.out.println();
    guess = keyboard.nextInt();
    System.out.println();

    if (guess == real)
      System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
    else 
      System.out.println("Ha! Fast Eddie wins again! The ace was card number " + real + ".");
    
    if ( real == 1 ){
      System.out.println("        AA  ##  ##");
      System.out.println("        AA  ##  ##");
    }
    else if ( real == 2 ){
      System.out.println("        ##  AA  ##");
      System.out.println("        ##  AA  ##");
    }
    else if ( real == 3 ){
      System.out.println("        ##  ##  AA");
      System.out.println("        ##  ##  AA");
    }

    System.out.println("        1   2   3 ");
  }
}