import java.util.Scanner;

public class MoreUserInputOfData
{
  public static void main( String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    String nameFirst, nameLast, login;
    int grade, studentId;
    double gpa;

    System.out.println("PLease enter the following information so I can sell it for a profit!");
    System.out.print("First name: ");
    nameFirst = keyboard.next();

    System.out.print("Last name: ");
    nameLast = keyboard.next();

    System.out.print("Grade (9-12): ");
    grade = keyboard.nextInt();

    System.out.print("student ID: ");
    studentId = keyboard.nextInt();

    System.out.print("Login: ");
    login = keyboard.next();

    System.out.print("GPA (0.0-4.0): ");
    gpa = keyboard.nextDouble();

    System.out.println("Your information:");
    System.out.println("        Login: " + login);
    System.out.println("        ID:    " + studentId);
    System.out.println("        Name:  " + nameLast + ", " + nameFirst);
    System.out.println("        GPA:   " + gpa);
    System.out.println("        Grade: " + grade);

  }
}