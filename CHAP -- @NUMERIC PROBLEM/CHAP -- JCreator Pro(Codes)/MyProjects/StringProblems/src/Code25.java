/*
 * String Pattern - IX
	   A
	  BBB
     CCCCC
    DDDDDDD
   EEEEEEEEE
    DDDDDDD
     CCCCC
      BBB
       A
*/

public class Code25 
{
 
    public static void main(String[] args) 
    {
        char ch = 'A';
        int number = 5;
        int count = number - 1;
        for (int k = 1; k <= number; k++) 
        {
            for (int i = 1; i <= count; i++)
                System.out.print(" ");
            count--;
            for (int i = 1; i <= 2 * k - 1; i++)
                System.out.print(ch);
            System.out.println();
            ch++;
        }
        count = 1;
        ch--;
        for (int k = 1; k <= number - 1; k++) 
        {
            for (int i = 1; i <= count; i++)
                System.out.print(" ");
            count++;
            ch--;
            for (int i = 1; i <= 2 * (number - k) - 1; i++)
                System.out.print(ch);
            System.out.println();
        }
 
    }
 
}      