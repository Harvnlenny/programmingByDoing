import java.util.Random;
import java.util.Scanner;

public class FortuneCookie{
  public static void main( String[] args){
    Scanner keyboard = new Scanner(System.in);
    Random r = new Random();

    int x = 1 + r.nextInt(6);
    String fortune = "";

    if ( x == 1 )
      fortune = "You will find happiness with a new love.";
    else if ( x == 2 )
      fortune = "Stick with your wife.";
    else if ( x == 3 )
      fortune = "Take some time to think first.";
    else if ( x == 4 )
      fortune = "Ask your parents for advice.";
    else if ( x == 5 )
      fortune = "Number 5.";
    else if ( x == 6 )
      fortune = "Order more fortunes.";

    System.out.println("Fortune cookie says: \"" + fortune + "\"" );
  }
}