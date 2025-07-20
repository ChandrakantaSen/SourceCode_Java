import java.util.*;
class word_frequency
{
    public static void main(String args[])
    {
        String str,str2="";
        int i,len,c=0;
        char b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        str = sc.nextLine();
        str=str+" ";
        len = str.length();

        for(i=0;i<len;i++)
        {
            b=str.charAt(i);
            if(b!=' ')
            {
                str2=str2+b;
            }
            else
            { 
                if(str2.equals("the"))
                {
                    c++;
                }
                str2="";
            }

            if(b=='.')
            {
                break;
            }
        }
        if(c!=0)
        {
            System.out.println("No. of \"the\" is: "+c);
        }
    }
}