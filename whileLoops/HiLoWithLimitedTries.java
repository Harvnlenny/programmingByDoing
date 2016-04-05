import java.util.Random;
import java.util.Scanner;

public class HiLoWithLimitedTries{
  public static void main( String[] args){
    Scanner keyboard = new Scanner(System.in);
    Random r = new Random();

    int guess;
    int real = 1 + r.nextInt(10);
    int tries = 0;


    System.out.println("I have chosen a number between 1 and 100. You have 7 guesses. ");
    System.out.print("First guess: ");
    guess = keyboard.nextInt();
    tries ++;

    while (guess != real && tries < 7){
      if (guess < real)
        System.out.println("Sorry, you are too low.");
      else if ( guess > real )
        System.out.println("Sorry, that guess is too high.");
      System.out.print("Guess # " + (tries + 1) + ": ");
      guess = keyboard.nextInt();
      tries ++;
    }
    if ( tries == 7 && real != guess )
      System.out.println("Sorry, you didn't get it in 7 tries. You lose.");
    
    else if ( guess == real )
      System.out.println("You guessed it! What are the odds?!?");

    
  }
}