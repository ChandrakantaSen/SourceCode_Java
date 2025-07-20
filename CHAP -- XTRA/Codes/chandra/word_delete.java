import java.util.*;

class word_delete
{
    public static void main(String args[])
    {
        String str,str1,str2="",str3="";
        int i,len;
        char b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        str = sc.nextLine();
        System.out.println("Enter the Word: ");
        str1=sc.nextLine();
        str=str+" ";
        len = str.length();
        for(i=0;i<len;i++)
        {
            b = str.charAt(i);
            if(b!=' ')
            {
                str2=str2+b;
                continue;
            }
            if(str2.equals(str1))
            {
                str2="";
            }
            str3=str3+str2+" ";
            str2="";
        }
        System.out.println("Resultant String is: "+str3);
    }
}