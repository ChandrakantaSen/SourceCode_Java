import java.util.*;
 
class Palindrome
{
   public static void main(String args[])
   {
      int org, rev;
      int i;
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter a no:");
      org=in.nextInt();
 
      int length = org.length();
 
      for ( i = len - 1 ; i >= 0 ; i-- )
         rev = rev + original.(i);
 
      if (org.equals(rev))
         System.out.println("Entered no is a palindrome.");
      else
         System.out.println("Entered no is not a palindrome.");
 
   }
}	