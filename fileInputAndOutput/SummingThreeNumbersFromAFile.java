import java.io.*;
import java.util.Scanner;

public class SummingThreeNumbersFromAFile
{
  public static void main(String[] args) throws IOException
  {
    Scanner s = null;

    try
    {
      s = new Scanner(new File("3nums.txt"));
      int num1 = s.nextInt();
      int num2 = s.nextInt();
      int num3 = s.nextInt();
      int total = num1 + num2 + num3;
      System.out.println("Reading numbers from file \"3nums.txt\"...done\n");
      System.out.print(num1 + " + " + num2 + " + " + num3 + " = " + total);
      s.close();
    }
    catch ( Exception e)
    {
      System.out.println("3nums.txt was not found.");
      System.exit(1);
    }
  }
}