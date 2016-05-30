import java.io.*;
import java.util.Scanner;

public class SummingSeveralNumbersFromAnyFile
{
  public static void main(String[] args) throws IOException
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Which file would you like to read numbers from: (3nums.txt or 4nums.txt)? ");
    String choice = keyboard.next();
    System.out.println("Reading numbers from file \"" + choice + "\"...done\n");

    try
    {
      Scanner s = new Scanner(new File(choice));
      int sum = 0;
      while (s.hasNext())
      {
        int num1 = s.nextInt();
        sum = sum + num1;
        System.out.print(num1 + "\t");
      }
      System.out.println("\nTotal is " + sum);   
      s.close();
    }
    catch ( Exception e)
    {
      System.out.println( "The file was not found.");
      System.exit(1);
    }
  }
}