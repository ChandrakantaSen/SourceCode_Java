import java.util.*;

class Max_Vowel_Word
{
    public static void main()
    {
        String str,d="",p="";
        char b,c;
        int i,j,len,l,max=0,count=0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the String: ");
        str=sc.nextLine();
        str = str + " ";
        len=str.length();
        
        for(i=0;i<len;i++)
        {
            b = str.charAt(i);
            if(b == ' ')
            {
                l = d.length();
                /*System.out.println(d);
                d="";*/
                for(j=0;j<l;j++)
                {
                    c=d.charAt(j);
                    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                    {
                        count++;
                    }
                }
                if(max<count)
                {
                    max=count;
                    p=d;
                }
                count=0;
                d="";
            }
            else
            {
                d = d + b;
            }
        }
        System.out.println("Required String is: "+p);
        System.out.println("Maximum number of vowel is: "+max);
    }
}