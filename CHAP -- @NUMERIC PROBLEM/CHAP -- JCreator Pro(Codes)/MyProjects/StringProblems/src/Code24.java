/*
 * String Patter - VIII
	 	  A
	     BBB
	    CCCCC
	   DDDDDDD
	  EEEEEEEEE
	 FFFFFFFFFFF
	GGGGGGGGGGGGG
 */
 
public class Code24 
{ 
    public static void main(String[] args) 
    {
        char ch = 'A';
        
        int number = 7;
        int count = number - 1;
        for (int k = 1; k <= number; k++) 
        {
            for (int i = 1; i <= count; i++)
            {
            	System.out.print(" ");
            }
            count--;
            for (int i = 1; i <= 2*k-1; i++)
            {
            	System.out.print(ch);
            }
            System.out.println();
            ch++;
        } 
    } 
}