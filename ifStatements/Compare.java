public class Compare{
  public static void main( String[] args){
    System.out.print("Comparing \"axe\" with \"dog\" produces ");
    int i = "axe".compareTo("dog");
    System.out.println(i);

    System.out.print("Comparing \"applebee's\" with \"apple\" produces ");
    System.out.println( "applebee's".compareTo("apple") );

    System.out.println( "abc".compareTo("abc") );

    System.out.println( "aaa".compareTo("aaab") );

    System.out.println( "aaaaaaa".compareTo("aaaa") );

    System.out.println( "axe".compareTo("coha") );
  }
}