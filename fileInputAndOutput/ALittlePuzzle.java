import java.util.Scanner;
import java.io.*;

public class ALittlePuzzle
{
  public static void main(String[] args) throws Exception
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Open which file: (puzzle.txt or puzzle2.txt?) ");
    String choice = keyboard.next();
    try
    {
      Scanner s = new Scanner(new File(choice));
      while ( s.hasNext() )
      {
        String message = s.nextLine();
        for ( int i = 2; i < message.length(); i = i + 3 )
          System.out.print( message.charAt(i) );
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