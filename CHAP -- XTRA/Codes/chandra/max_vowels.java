import java.util.*;

class max_vowels
{
    public static void main(String args[])
    {
        String str="",str1="",str2="";
        char b=' ',b1=' ';
        int i, len, len1,c=0,max=0;

        Scanner in = new Scanner(System.in);
        System.out.println("enter the string");
        str=in.nextLine();
        str=str+" ";
        len=str.length();

        for(i=0;i<len;i++)
        {
            b=str.charAt(i);
            if(b!=' ')
            {
                str1=str1+b;
                continue;
            }

            len1=str1.length();
            for(int j=0;j<len1;j++)
            {
                b1=str1.charAt(j);
                if(b1=='a'||b1=='e'||b1=='i'||b1=='o'||b1=='u'||b1=='A'||b1=='E'||b1=='I'||b1=='O'||b1=='U')
                {
                    c++;
                }
            }
            if(max<c)
            {
                max=c;
                str2=str1;
            }
            str1="";c=0;
        }
        System.out.println("Max Number of Vowels: "+max);
        System.out.println("Max String is: "+str2);
    }
}