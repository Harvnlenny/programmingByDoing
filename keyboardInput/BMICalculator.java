import java.util.Scanner;

public class BMICalculator
{
  public static void main( String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    int weight;
    double height, bmi;

    System.out.print("What is your height in m? ");
    height = keyboard.nextDouble();

    System.out.print("What is your weight in kg? ");
    weight = keyboard.nextInt();
    bmi = weight / (height * height);

    System.out.println("Your height in m: " + height);
    System.out.println("Your weight in kg: " + weight);
    System.out.println();
    System.out.println("Your BMI is " + bmi);
  }
}