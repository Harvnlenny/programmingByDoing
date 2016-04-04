import java.util.Scanner;

public class AddingValuesInALoop{
  public static void main( String[] args){
    Scanner keyboard = new Scanner(System.in);
    int total = 0;
    int entries = 0;

    System.out.println("I will add up the numbers you give me.");
    System.out.print("Number: ");
    int n1 = keyboard.nextInt();
    total = total + n1;
    while (n1 != 0){
      System.out.println("The total so far is " + total);
      System.out.print("Number: ");
      n1 = keyboard.nextInt();
      total = total + n1;
    }
    System.out.println();
    System.out.println("The total is " + total);
  }
}