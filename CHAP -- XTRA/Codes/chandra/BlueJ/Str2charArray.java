/* Example of Char Array to String Conversion */
import java.io.*;
class Str2charArray
{
    public static void main(String args[])throws IOException
    {
        char a[] = new char[10];
        String str;
        int i,len;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String: ");
        str = in.readLine();
        System.out.println("String is: "+str);
        
        a=str.toCharArray();
        
        len =a.length;
        System.out.println("Length is: "+len);
        System.out.println("Char Array Elements are: ");
        for(i=0;i<len;i++)
        {
            System.out.print(a[i]+" ");
        }
       
    }
}
