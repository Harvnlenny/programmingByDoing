import java.io.*;
import java.util.Scanner;

public class DisplayingAFile
{
  public static void main(String[] args) throws IOException
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Open which file: (score.txt or letter.txt?) ");
    String choice = keyboard.next();
    try
    {
      Scanner s = new Scanner(new File(choice));
      while ( s.hasNext() )
      {
        System.out.println("" + s.nextLine());
      }
      s.close();    
    }
    catch ( Exception e )
    {
      System.out.println("The file was not found.");
      System.exit(1);
    }
  }
}