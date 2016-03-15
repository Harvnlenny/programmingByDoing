import java.util.Scanner;

public class GenderGame{
  public static void main( String[] args){
    Scanner keyboard = new Scanner(System.in);

    String gender, nameFirst, nameLast, married, surName;
    int age;

    surName = "";

    System.out.print("What is your gender (M or F): ");
    gender = keyboard.next();
    System.out.print("First name: ");
    nameFirst = keyboard.next();
    System.out.print("Last name: ");
    nameLast = keyboard.next();
    System.out.print("Age: ");
    age = keyboard.nextInt();
    System.out.println();
    
    if (age >= 20)
    {
      if (gender.equals("F"))
      {
        System.out.print("Are you married, " + nameFirst + " (y or n)? ");
        married = keyboard.next();
        System.out.println();
        if (married.equals("y"))
        {
          surName = "Mrs.";
        }
        if (married.equals("n"))
        {
          surName = "Ms.";
        }         
      }
      
      if (gender.equals("M"))
      {
        surName = "Mr.";
      }
    }

    if (age < 20)
    {
      surName = nameFirst;
    }
    

    System.out.println("Then I shall call you " + surName + " " + nameLast + ".");
  }
}