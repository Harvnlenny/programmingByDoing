import java.util.Scanner;

public class Nim{
  public static void main( String[] args){
    Scanner keyboard = new Scanner(System.in);
    String name1, name2, piles, going;
    int pileA = 3, pileB = 4, pileC = 5, turns = 0, counters;

    System.out.print("Player 1, enter your name: ");
    name1 = keyboard.next();
    System.out.print("Player 2, enter your name: ");
    name2 = keyboard.next();

    do{
      if (turns % 2 == 0 )
        going = name1;
      else
        going = name2;
      System.out.println();
      System.out.println("A: " + pileA + "    B: " + pileB + "    C: " + pileC);
      System.out.println();
      System.out.print(going + ", choose a pile: ");
      piles = keyboard.next();
      if ( piles.equals("A") && pileA > 0){
        System.out.print("How many to remove from pile A: ");
        counters = keyboard.nextInt();
        if (pileA >= counters)
          pileA = pileA - counters;
        else{
          System.out.print("Nice try, " + going + " Pile A doesn't have that many. Try again: ");
          counters = keyboard.nextInt();
          pileA = pileA - counters;
        }
      }
      else if ( piles.equals("B") && pileB > 0){
        System.out.print("How many to remove from pile B: ");
        counters = keyboard.nextInt();
        if (pileB >= counters)
          pileB = pileB - counters;
        else{
          System.out.print("Nice try, " + going + " Pile B doesn't have that many. Try again: ");
          counters = keyboard.nextInt();
          pileB = pileB - counters;
        }
      }
      else if ( piles.equals("C") && pileC > 0){ 
        System.out.print("How many to remove from pile C: ");
        counters = keyboard.nextInt();
        if (pileC >= counters)
          pileC = pileC - counters;
        else{
          System.out.print("Nice try, " + going + " Pile C doesn't have that many. Try again: ");
          counters = keyboard.nextInt();
          pileC = pileC - counters;
        }
      }
      else {
        turns --;
      }
      turns ++; 
    } while (pileA > 0 || pileB > 0 || pileC > 0);
    if (turns % 2 == 0 )
        going = name1;
      else
        going = name2;
    System.out.println();
    System.out.println("A: " + pileA + "    B: " + pileB + "    C: " + pileC);
    System.out.println();
    System.out.println(going + ", there are no counters left, so you WIN!");
  }
}