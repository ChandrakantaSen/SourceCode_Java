/**
 * 
 * Print the String in Alphabetical Order.
 * 
 **/
import java.util.*;
class Str_Alphabetical_Order
{
    public static void main(String args[])
    {
        String str,str2="";
        int len,i,j;
        char b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        str = sc.next();
        len=str.length();
        
        for(i=65;i<=90;i++)
        {
            for(j=0;j<len;j++)
            {
                b=str.charAt(j);
                if(b==(char)i||b==(char)(i+32))
                {
                    str2=str2+b;
                }
            }
        }
        System.out.println("string in ascending order is: "+str2);
    }
}
