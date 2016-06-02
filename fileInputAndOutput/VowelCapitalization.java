import java.util.Scanner;
import java.io.*;

public class VowelCapitalization
{
  public static void main(String[] args) throws Exception
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Open which file: (vowels.txt or letter.txt? ");
    String choice = keyboard.next();
    System.out.println();
    try
    {
      Scanner s = new Scanner(new File(choice));
      while (s.hasNext() )
      {
        String message = s.nextLine();
        message = message.replace('a', 'A');
        message = message.replace('e', 'E');
        message = message.replace('i', 'I');
        message = message.replace('o', 'O');
        message = message.replace('u', 'U');
        System.out.println(message);
      }
      s.close();
    }
    catch (Exception e)
    {
      System.out.println("The file was not found.");
      System.exit(1);
    }

    
  }
}