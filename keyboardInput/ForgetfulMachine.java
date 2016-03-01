import java.util.Scanner;

public class ForgetfulMachine
{
  public static void main( String[] args)
  {

    Scanner keyboard = new Scanner(System.in);

    String word, word2;
    int number, number2;

    System.out.println("Give me a word!");
    word = keyboard.next();

    System.out.println("Give me a second word!");
    word2 = keyboard.next();

    System.out.println("Great, now your favorite number?");
    number = keyboard.nextInt();

    System.out.println("And your second-favorite number...");
    number2 = keyboard.nextInt();

    System.out.println("Whew!  Wasn't that fun?");



  }
}