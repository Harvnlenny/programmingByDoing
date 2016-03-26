import java.util.Random;

public class Dice{
  public static void main( String[] args){

    Random r = new Random();


    int x = 1 + r.nextInt(6);
    int y = 1 + r.nextInt(6);
    int total = x + y;

    System.out.println("HERE COMES THE DICE!");
    System.out.println();
    System.out.println("Roll #1: " + x);
    System.out.println("Roll #2: " + y);
    System.out.println("The total is " + total + "!"); 
  }
}