import java.util.Scanner;

public class ChooseYourOwnAdventure
{
  public static void main( String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    String r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15;

    System.out.println("WElCOME TO MITCHELL'S TINY ADVENTURE!");
    System.out.println();
    System.out.println("You are in a creepy house! Would you like to go \"upstairs\" or into the \"kitchen\"?");
    r1 = keyboard.next();
    System.out.println();

    if (r1.equals( "upstairs"))
    {
      System.out.println("Upstairs you see a hallway. At the end of the hallway is the master \"bedroom\". There is also a \"bathroom\" off the hallway. Where would you like to go?");
      r2 = keyboard.next();

      if (r2.equals("bedroom"))
      {
        System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture. The bed is unmade. In the back of the room, the closet door is ajar. Would you like to open the door? (\"yes\" or \"no\")");
        r4 = keyboard.next();
        if (r4.equals("yes"))
        {
          System.out.println("You choose to look in the closet. It looks like a closet.");
        }
        else{
          System.out.println("Well, then I guess you'll never know what was in there. Thanks for playing, I'm tired of making nested if statements.");
        }
      }
      else
      {
        System.out.println("Eww you choose the bathroom. Do you want to clean it? (\"yes\" or \"no\").");
        r5 = keyboard.next();
        if (r5.equals("yes"))
        {
          System.out.println("Thank you for cleaning the bathroom.");
        }
        else{
          System.out.println("Yeah, nobody wants to clean it.");
        }
      }
    }
    
    else{
      System.out.println("There is a long countertop with dirty dishes everywhere. Off to one side there is, as you'd expect, a refrigerator. You may open the \"refrigerator\" or look in a \"cabinet\".");
      r3 = keyboard.next();
      if (r3.equals("refrigerator"))
      {
        System.out.println("Inside the fridge you see food and stuff. It looks pretty nasty. Would you like to eat some of the food? (\"yes\" or \"no\")");
        r6 = keyboard.next();
        if (r6.equals("yes"))
        {
          System.out.println("You choose yes. You get to eat.");
        }
        else
        {
          System.out.println("You die of starvation.... eventually.");
        }
      }
      else{
        System.out.println("You choose the cabinet. Eat some food? Type yes or no next.");
        r7 = keyboard.next();
        if (r7.equals("yes"))
        {
          System.out.println("You choose yes. Eat.");
        }
        else{
          System.out.println("You choose no. You are hungry.");
        }
      }
    }

  }
}