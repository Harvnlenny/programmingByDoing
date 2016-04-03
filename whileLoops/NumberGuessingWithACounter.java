import java.util.Random;
import java.util.Scanner;

public class NumberGuessingWithACounter{
  public static void main( String[] args){
    Scanner keyboard = new Scanner(System.in);
    Random r = new Random();

    int guess;
    int real = 1 + r.nextInt(10);
    int tries = 0;


    System.out.println("I have chosen a number between 1 and 10. Try to guess it. ");
    System.out.print("Your guess: ");
    guess = keyboard.nextInt();
    tries ++;

    while (guess != real){
      System.out.println("That is incorrect. Guess again.");
      System.out.print("Your guess: ");
      guess = keyboard.nextInt();
      tries ++;
    }
    
    System.out.println("That's right! You're a good guesser.");
    if (tries == 1)
      System.out.println("it only took you " + tries + " try.");
    else
      System.out.println("it only took you " + tries + " tries.");

    
  }
}