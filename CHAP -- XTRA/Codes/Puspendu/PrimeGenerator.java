package Puspendu;

public class PrimeGenerator 
{
  public static void main(String[] args) 
  {
    int max = 100;

    System.out.println("Generate Prime numbers between 1 and 100. \"1\" is not prime.");

    for (int n = 1; n<max; n++) {
      boolean prime = true;

      for (int j = 2; j < n; j++) {
        if (n % j == 0 ) {
          prime = false;
          break; 
        }
      }

      if (prime && n != 1) {    
        System.out.print(n + " ");
      }
    }
  }
}