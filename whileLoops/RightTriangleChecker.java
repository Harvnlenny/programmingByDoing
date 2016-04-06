import java.util.Scanner;

public class RightTriangleChecker{
  public static void main( String[] args){
    Scanner keyboard = new Scanner(System.in);

    int num1, num2, num3;

    System.out.println("Enter three integers:");
    System.out.print("side 1: ");
    num1 = keyboard.nextInt();
    
    do{
      System.out.print("side 2: ");
      num2 = keyboard.nextInt();
      if ( num1 > num2 )
        System.out.println(num2 + " is smaller than " + num1 + ". Try again.");
    } while ( num1 > num2 ); 

    do{
      System.out.print("side 3: ");
      num3 = keyboard.nextInt();
      if ( num2 > num3 )
        System.out.println(num3 + " is smaller than " + num2 + ". Try again.");
    } while ( num2 > num3 ); 


    System.out.println("Your three sides are " + num1 + " " + num2 + " " + num3);

    if ( ((num1 * num1) + (num2 * num2)) == ((num3 * num3)) )
      System.out.println("These sides *do* make a right triangle! Yippy-skippy!");
    else
      System.out.println("No! These sides do not make a right triangle!");
  }
}