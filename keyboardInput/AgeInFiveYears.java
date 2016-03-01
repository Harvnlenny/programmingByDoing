import java.util.Scanner;

public class AgeInFiveYears
{
  public static void main( String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    String name;
    int age, ageInFiveYears, ageFiveYearsAgo;
    
    System.out.print("Hello. What is your name? ");
    name = keyboard.next();

    System.out.print("Hi, " + name + "! How old are you? ");
    age = keyboard.nextInt();
    ageInFiveYears = age + 5;
    ageFiveYearsAgo = age - 5;

    System.out.println("Did you know that in five years you will be " + ageInFiveYears + " years old?");
    System.out.println("And five years ago you were " + ageFiveYearsAgo + "! Imagine that!"); 

  }
}