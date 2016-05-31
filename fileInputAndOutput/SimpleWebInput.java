import java.net.URL;
import java.util.Scanner;

public class SimpleWebInput
{
  public static void main(String[] args) throws Exception
  {
    URL mcool = new URL("http://www.greens.org/about/software/editor.txt");
    Scanner webIn = new Scanner( mcool.openStream() );
    while ( webIn.hasNext() )
      {
        System.out.println("" + webIn.nextLine());
      }
      webIn.close();
  
  }
}
