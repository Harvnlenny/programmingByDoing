import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class LetterRevisited
{
  public static void main(String[] args) throws IOException
  {
    PrintWriter textfile = new PrintWriter(new FileWriter("letter.txt"));

    textfile.println( "+-----------------------------+");
    textfile.println( "|                             |");
    textfile.println( "|                             |");
    textfile.println( "|                             |");
    textfile.println( "|            John Smith       |");
    textfile.println( "|           666 N. Satan St.  |");
    textfile.println( "|            Togday, NV 89320 |");
    textfile.println( "|                             |");
    textfile.println( "+-----------------------------+");
    textfile.close();
  }
}