import java.util.Random;
import java.util.Scanner;

public class AgainWithTheNumberGuessing{
  public static void main( String[] args){
    Scanner keyboard = new Scanner(System.in);
    Random r = new Random();

    int real = 1 + r.nextInt(10);
    int tries = 0;
    int guess;

    System.out.println("I have chosen a number between 1 and 10. Try to guess it. ");
    
    do
    {
      System.out.print("Your guess: ");
      guess = keyboard.nextInt();
      tries ++;
      if ( guess != real )
        System.out.println("That is incorrect. Guess again.");
      
    } while (guess != real);
    
    System.out.println("That's right! You're a good guesser.");
    if (tries == 1)
      System.out.println("it only took you " + tries + " try.");
    else
      System.out.println("it only took you " + tries + " tries.");

    
  }
}