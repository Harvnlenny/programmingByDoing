import java.util.Random;

public class ShorterDoubleDice{
  public static void main( String[] args){
    Random r = new Random();

    int x = 1 + r.nextInt(6);
    int y = 1 + r.nextInt(6);
    int total = x + y;

    System.out.println("HERE COMES THE DICE!");
    
    do
    {
      x = 1 + r.nextInt(6);
      y = 1 + r.nextInt(6);
      System.out.println();
      System.out.println("Roll #1: " + x );
      System.out.println("Roll #2: " + y );
      System.out.println("The total is " + total + "!");

    } while ( x != y );

  }
}