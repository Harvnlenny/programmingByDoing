import java.util.Scanner;

public class ALittleQuiz
{
  public static void main( String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    int score = 0;
    int capital, q2, q3;
    String ready;

    System.out.print("Are you ready for a quiz? ");
    ready = keyboard.next();
    System.out.println("Okay, here it comes! ");
    System.out.println("");

    System.out.println("Q1) What is the capital of Alaska?");
    System.out.println("        1) Melbourne");
    System.out.println("        2) Anchorage");
    System.out.println("        3) Juneau");
    capital = keyboard.nextInt();
    if (capital == 3)
    {
      score ++;
      System.out.println("That's right! ");
    }
    else
    {
      System.out.println("That's not correct. The correct answer was Juneau.");
    }

    System.out.println("");
    System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?");
    System.out.println("        1) yes");
    System.out.println("        2) no");
    q2 = keyboard.nextInt();
    System.out.println("");

    if (q2 == 2)
    {
      score ++;
      System.out.println("That's right.");
    }
    else
    {
      System.out.println("Sorry, \"cat\" is a string. ints can only store numbers.");

    }
    System.out.println("");

    System.out.println("Q3) What is the result of 9+6/3?");
    System.out.println("        1) 5");
    System.out.println("        2) 11");
    System.out.println("        3) 15/3");
    q3 = keyboard.nextInt();
    System.out.println("");

    if (q3 == 2)
    {
      score ++;
      System.out.println("That's correct!");
    }
    else
    {
      System.out.println("No the correct answer was 11.");
    }
    System.out.println("");
    System.out.println("Overall, you got " + score + " out of 3 correct.");
    System.out.println("Thanks for playing!");

  }
}