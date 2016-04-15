import java.util.Scanner;

public class CountingMachine{
  public static void main( String[] args){
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Count to: ");
    int num1 = keyboard.nextInt();
    System.out.print(0);
    for (int x = 1; x <= num1; x ++)
      System.out.print("\t" + x);
    System.out.println();
  }
}