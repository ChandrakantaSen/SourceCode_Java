import java.util.*;
class Encode
{
    public static void main(String args[])
    {
        int i,j=0,len;
        char b,b1=' ';
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        str = sc.nextLine();
        len = str.length();
        for(i=0;i<len;i++)
        {
            b = str.charAt(i);

            if((b>='a' && b<='x'))
            {
                j = (int)(b+2);
                b1 = (char)j;
            }
            
            if((b>='y' && b<='z'))
            {
                j = (int)(b-24);
                b1 = (char)j;
            }
            System.out.print(" "+b1);
        }
    }
}
