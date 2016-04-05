import java.util.Random;
import java.util.Scanner;

public class SafeSquareRoot{
  public static void main( String[] args){
    Scanner keyboard = new Scanner(System.in);
    double num1;

    System.out.println("SQUARE ROOT!");
    System.out.print("Enter a number: ");
    num1 = keyboard.nextDouble();
    while ( num1 <= 0 ){
      System.out.println("You can't take the square root of a negative number, silly.");
      System.out.print("Try again: ");
      num1 = keyboard.nextDouble();
    }
    double num1sq = Math.sqrt(num1);
    System.out.println("The square root of " + num1 + " is " + num1sq + ".");

  }
}