import java.util.Scanner;

public class KeychainsForSale2{
  public static void main (String[] args){
    Scanner keyboard = new Scanner(System.in);
    int choice;
    int keychains = 0;
    int keychainPrice = 10;

    System.out.println("Ye Olde Keychain Shoppe\n");
    do{
      System.out.println("1. Add Keychains to Order");
      System.out.println("2. Remove Keychains from Order");
      System.out.println("3. View Current Order");
      System.out.println("4. Checkout\n");
      System.out.print("Please enter your choice: ");
      choice = keyboard.nextInt();
        if (choice == 1){
          keychains = add_keychains(keychains);
          System.out.print("You now have " + keychains + ".\n");
        }
        else if (choice == 2){
          keychains = remove_keychains(keychains);
          System.out.print("You now have " + keychains + ".\n");
        }
        else if (choice == 3){
          view_order(keychains, keychainPrice);
        }
        else if (choice == 4){
          checkout(keychainPrice, keychains);
        }
    } while (choice != 4);
  }
  public static int add_keychains(int kchains){
    Scanner keyboard = new Scanner(System.in);
    System.out.print("\nYou have " + kchains + ". How many to add? ");
    int addKeychains = keyboard.nextInt();
    kchains = kchains + addKeychains;
    return kchains;
  }
  public static int remove_keychains(int kchains){
    Scanner keyboard = new Scanner(System.in);
    System.out.print("\nYou have " + kchains + ". How many to remove? ");
    int subtractKeychains = keyboard.nextInt();
    kchains = kchains - subtractKeychains;
    return kchains;
  }
  public static void view_order(int kchains, int kchainPrice){
    int total = kchains * kchainPrice; 
    System.out.println("\nYou have " + kchains + ".");
    System.out.println("Keychains cost $10 each.");
    System.out.println("Total cost is $" + (total) + ".\n");
  }
  public static void checkout(int kchainPrice, int kchains){
    Scanner keyboard = new Scanner(System.in);
    System.out.print("\nWhat is your name? ");
    String name = keyboard.next();
    if (kchains == 1) 
      System.out.println("You have " + kchains + " keychain.");
    else
      System.out.println("You have " + kchains + " keychains.");
    System.out.println("Keychains cost $10 each.");
    System.out.println("Total cost is $" + (kchainPrice * kchains) + ".");
    System.out.println("Thanks for your order, " + name + "!");
  }
}