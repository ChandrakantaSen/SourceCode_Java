import java.util.*;

class str_Caps_first
{
    public static void main(String args[])
    {
        String str="",str1="";
        char b,b1=' ';
        int len,i;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string: ");
        str = in.nextLine();
        str=" "+str;
        len=str.length();
        
        for(i=0;i<len;i++)
        {
            b=str.charAt(i);
            
            if(b==' ')
            {
                b1 = str.charAt(i+1);
                str1=str1+" "+Character.toUpperCase(b1);
                i++;
            }
            else
            {
                str1=str1+b;
            }
        }
        System.out.println("New String is: "+str1);
    }
}
