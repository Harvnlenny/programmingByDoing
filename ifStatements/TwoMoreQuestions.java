import java.util.Scanner;

public class TwoMoreQuestions
{
  public static void main( String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    String q1, q2, object;
    object = "";

    System.out.println("TWO MORE QUESTIONS, BABY!");
    System.out.println("Think of something and I'll try to guess it!");
    System.out.println();

    System.out.println("Question 1) Does it stay inside or outside or both?");
    q1 = keyboard.next();
    System.out.println();

    System.out.println("Question 2) Is it a living thing?");
    q2 = keyboard.next();
    System.out.println();


    if ( q1.equals( "inside" ) && q2.equals("yes"))
    {
      object = "houseplant";
    }
    
    if ( q1.equals( "inside" ) && q2.equals("no"))
    {
      object = "shower curtain";
    }

    if ( q1.equals( "outside" ) && q2.equals( "yes" ))
    {
      object = "bison";
    }

    if ( q1.equals( "outside" ) && q2.equals( "no" ))
    {
      object = "billboard";
    }

    if ( q1.equals( "both" ) && q2.equals( "yes" ))
    {
      object = "dog";
    }

    if ( q1.equals( "both" ) && q2.equals( "no" ))
    {
      object = "cell phone";
    }
    System.out.println("My guess is that you are thinking of a " + object + ".");
    System.out.println("I would ask you if I'm right, but I don't actually care.");
  }
}