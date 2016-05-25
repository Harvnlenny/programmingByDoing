import java.io.*;
import java.util.Scanner;

public class SimpleFileInput
{
  public static void main(String[] args) throws IOException
  {
    Scanner s = null;

    try
    {
      s = new Scanner(new File("name.txt"));
      String word1 = s.next();
      System.out.print(word1 + " ");
      String word2 = s.next();
      System.out.print(word2 + "\n");
      s.close();
    }
    catch ( Exception e)
    {
      System.out.println("name.txt was not found.");
      System.exit(1);
    }
  }
}