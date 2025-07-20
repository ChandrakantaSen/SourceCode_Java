import java.util.*;
class even_odd
{
   public static void main(String args[]) {
 
    int num; 
   Scanner in =new Scanner(System.in); 
   System.out.println("entere the number: ");
   num = in.nextInt();
   System.out.println();
    if(num%2==0)
            System.out.println(num+" is even");
    else
            System.out.println(num+" is odd");
    }
}