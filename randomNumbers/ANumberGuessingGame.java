import java.util.Random;
import java.util.Scanner;

public class ANumberGuessingGame{
  public static void main( String[] args){
    Scanner keyboard = new Scanner(System.in);
    Random r = new Random();

    int guess;
    int real = 1 + r.nextInt(10);


    System.out.println("TEH WORST NUBMER GESSING GAME EVAR!!!!!!!!1!");
    System.out.println();
    System.out.print("I\"M THKING OF A NBR FROM 1-10. TRY 2 GESS! ");
    guess = keyboard.nextInt();
    System.out.println();

    if (guess == real){
      System.out.println("LOL!!! U GOT IT! I CANT BELIEVE U GESSED IT WAS " + real + "!");
    }
    else{
      System.out.println("WOOT! U SUXOR!!! I PWN JOO!!! IT WAS " + real + "!");
    }
  }
}