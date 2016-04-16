import java.util.Scanner;

public class CountingMachineRevisited{
  public static void main( String[] args){
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Count from: ");
    int num1 = keyboard.nextInt();
    System.out.print("Count to  : ");
    int num2 = keyboard.nextInt();
    System.out.print("Count by  : ");
    int num3 = keyboard.nextInt();
    System.out.println();

    System.out.print(num1);
    for (int x = (num1 + num3); x <= num2; x = x + num3)
      System.out.print("\t" + x);
    System.out.println();
  }
}