import java.util.Scanner;

public class AlphaOrder{
  public static void main( String[] args){
    Scanner keyboard = new Scanner(System.in);

    String nameLast;
    String message = "";

    System.out.print("What's your last name? ");
    nameLast = keyboard.next();

    if (nameLast.compareTo("Carswell") <= 0 )
    {
      message = "You don't have to wait long";
    }
    if (nameLast.compareTo("Carswell") > 0 && nameLast.compareTo("Jones") <= 0 )
    {
      message = "That's not bad";
    }
    if (nameLast.compareTo("Jones") > 0 && nameLast.compareTo("Smith") <= 0 )
    {
      message = "Looks like a bit of a wait";
    }
    if (nameLast.compareTo("Smith") > 0 && nameLast.compareTo("Young") <= 0 )
    {
      message = "It's gonna be a while";
    }
    if (nameLast.compareTo("Young") > 0)
    {
      message = "Not going anywhere for a while?";
    }

    System.out.println(message + ", " + nameLast + ".");
  }
}