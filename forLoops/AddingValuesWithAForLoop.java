import java.util.Scanner;

public class AddingValuesWithAForLoop{
  public static void main( String[] args){
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Number: ");
    int num1 = keyboard.nextInt();
    int sum = 0;

    for (int i = 1; i <= num1; i++){
      System.out.print(i + "\t");
      sum = sum + i;
    }
    System.out.println("\nThe sum is " + sum + ".");

  }
}
