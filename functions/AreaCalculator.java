import java.util.Scanner;

public class AreaCalculator{
  public static void main(String [] args){
    Scanner keyboard = new Scanner(System.in);
    int choice;
    do{
      System.out.println("-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-\n");
      System.out.println("1) Triangle");
      System.out.println("2) Rectangle");
      System.out.println("3) Square");
      System.out.println("4) Circle");
      System.out.println("5) Quit");
      System.out.print("Which shape: ");
      choice = keyboard.nextInt();
      if (choice == 1 ){
        System.out.print("\nBase: ");
        int base = keyboard.nextInt();
        System.out.print("Height: ");
        int height = keyboard.nextInt();
        System.out.println("\nThe area is " + area_triangle(base, height) + ".\n");
      } 
      else if (choice == 2){
        System.out.print("\nLength: ");
        int length = keyboard.nextInt();
        System.out.print("Width: ");
        int width = keyboard.nextInt();
        System.out.println("\nThe area is " + area_rectangle( length, width) + ".\n");
      }
      else if (choice == 3){
        System.out.print("\nSide length: ");
        int length = keyboard.nextInt();
        System.out.println("\nThe area is " + area_square(length) + ".\n");
      }
      else if (choice == 4){
        System.out.print("\nRadius: ");
        int radius = keyboard.nextInt();
        System.out.println("\nThe area is " + area_circle(radius) + ".\n");
      }
      else if (choice == 5){
        System.out.println("\nGoodbye.");
      }
    } while ( choice != 5);

  }

  public static double area_circle( int radius ){
    double A = Math.PI * radius * radius;
    return A;
  }

  public static int area_rectangle( int length, int width ){
    int A = length * width;
    return A;
  }

  public static int area_square( int side) {
    int A = side * side;
    return A;

  }
  public static double area_triangle(int base, int height){
    double A = 0.5 * base * height;
    return A;
  }
}