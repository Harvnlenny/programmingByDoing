import java.util.Scanner;

public class BMICategories
{
  public static void main( String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    int weight;
    double height, bmi;
    String category = "";

    System.out.print("What is your height in m? ");
    height = keyboard.nextDouble();

    System.out.print("What is your weight in kg? ");
    weight = keyboard.nextInt();
    bmi = weight / (height * height);

    if (bmi < 18.5)
    {
        category = "underweight";
    }
    if (bmi >= 18.5 && bmi < 25)
    {
        category = "normal weight";
    }
    if (bmi >= 25 && bmi < 30)
    {
        category = "overweight";
    }
    if (bmi >= 30)
    {
        category = "obese";
    }

    System.out.println("Your height in m: " + height);
    System.out.println("Your weight in kg: " + weight);
    System.out.println();
    System.out.println("Your BMI is " + bmi);
    System.out.println("BMI Category: " + category);
  }
}