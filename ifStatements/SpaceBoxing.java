import java.util.Scanner;

public class SpaceBoxing
{
  public static void main( String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    
    int planet; 
    double weight, weight2, gravity;

    gravity = 0;

    System.out.print("Please enter your current earth weight: ");
    weight = keyboard.nextDouble();

    System.out.println("");
    System.out.println("I have information for the following planets: ");
    System.out.println("   1. Venus   2. Mars    3. Jupiter");
    System.out.println("   4. Saturn  5. Uranus  6. Neptune");
    System.out.println("");

    System.out.print("Which planet are you visiting? ");
    planet = keyboard.nextInt();
    System.out.println("");

    if ( planet == 1 )
    {
      gravity = 0.78; 
    }
    else if ( planet == 2 )
    {
      gravity = 0.39;
    }
    else if ( planet == 3 )
    {
      gravity = 2.65;
    }
    else if ( planet == 4 )
    {
      gravity = 1.17;
    }
    else if ( planet == 5 )
    {
      gravity = 1.05;
    }
    else if ( planet == 6 )
    {
      gravity = 1.23;
    }

    weight2 = weight * gravity;


    System.out.println("Your weight would be " + weight2 + " pounds on that planet.");

  }
}