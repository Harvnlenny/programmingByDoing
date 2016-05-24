import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class HighScore
{
  public static void main(String[] args) throws IOException
  {
    PrintWriter textfile = new PrintWriter(new FileWriter("score.txt"));
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Please enter your score: ");
    int score = keyboard.nextInt();
    textfile.println("score: " + score);
    System.out.print("Please enter your name: ");
    String name = keyboard.next();
    textfile.println("name: " + name);
    System.out.println("Data stored into score.txt.");
    textfile.close();
  }
}