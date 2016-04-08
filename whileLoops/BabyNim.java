import java.util.Scanner;

public class BabyNim{
  public static void main( String[] args){
    Scanner keyboard = new Scanner(System.in);
    int pileA = 3, pileB = 3, pileC = 3;
    int counters;
    String piles;

    System.out.println("A: " + pileA + "    B: " + pileB + "    C: " + pileC);
    System.out.println();

    do{
      System.out.print("Choose a pile: ");
      piles = keyboard.next();
      if ( piles.equals("A")){
        System.out.print("How many to remove from pile A: ");
        counters = keyboard.nextInt();
        pileA = pileA - counters;
      }
      else if ( piles.equals("B")){
        System.out.print("How many to remove from pile B: ");
        counters = keyboard.nextInt();
        pileB = pileB - counters;
      }
      else{ 
        System.out.print("How many to remove from pile C: ");
        counters = keyboard.nextInt();
        pileC = pileC - counters;
      } 
      System.out.println();
      System.out.println("A: " + pileA + "    B: " + pileB + "    C: " + pileC);
    } while (pileA > 0 || pileB > 0 || pileC > 0);
    System.out.println("All piles are empty. Good job!");
  }
}