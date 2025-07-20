/* Example of Char Array to String Conversion */
import java.io.*;
class charArray2Str
{
    public static void main(String args[])throws IOException
    {
        char a[] = new char[10];
        int i;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the elements: ");
        for(i=0;i<5;i++)
        {
            a[i]=(char)in.read();
        }
        System.out.println("Char Array Elements are: ");
        for(i=0;i<5;i++)
        {
            System.out.println(a[i]+" ");
        }
        System.out.println("String is: ");
        String str = new String(a);
        System.out.println(str);
    }
}
