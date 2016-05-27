import java.io.*;
import java.util.Scanner;

public class SummingThreeNumbersFromAnyFile
{
  public static void main(String[] args) throws IOException
  {
    Scanner s = null;
    Scanner keyboard = new Scanner(System.in);

    try
    {
      System.out.print("Which file would you like to read numbers from: (3nums1.txt or 3nums2.txt)? ");
      String choice = keyboard.next();
      s = new Scanner(new File(choice));
      int num1 = s.nextInt();
      int num2 = s.nextInt();
      int num3 = s.nextInt();
      int total = num1 + num2 + num3;
      System.out.println("Reading numbers from file \"" + choice + "\"...done\n");
      System.out.print(num1 + " + " + num2 + " + " + num3 + " = " + total);
      s.close();
    }
    catch ( Exception e)
    {
      System.out.println( "The file was not found.");
      System.exit(1);
    }
  }
}