public class FindingPrimeNumbers{
  public static void main( String[] args){
    for (int j = 2; j <= 20; j++){
      System.out.print(j+" ");
      if (isPrime(j))
        System.out.print("<");
      System.out.println();
    }
  }  
  public static boolean isPrime( int n){
    boolean is = true;
    for (int i = 2; i < n; i++ ){
      if (n % i == 0)
        is = false;
    }
    return is;
  }
}