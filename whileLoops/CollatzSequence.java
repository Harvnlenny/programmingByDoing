import java.util.Scanner;
public class CollatzSequence{
  public static void main( String[] args){
    Scanner keyboard = new Scanner(System.in);
    int num1;
    int steps = 0;
    int max = 0;

    System.out.print("Starting number: ");
    num1 = keyboard.nextInt();

    while (num1 != 1){
      if (num1 % 2 == 0){
        System.out.print( "\t" + (num1 ));
        num1 = num1 / 2;
        steps ++;
      }

      else if (num1 % 2 == 1){
        System.out.print("\t" + num1 );
        num1 = num1 * 3 + 1;
        steps ++;
      }
      if (num1 > max)
        max = num1;

    }
    System.out.print( "\t" + num1);
    System.out.println();
    System.out.println("Terminated after " + steps +" steps. The highest number was " + max +".");
  }
}