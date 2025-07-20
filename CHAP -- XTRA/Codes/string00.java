package All;

import java.io.*;
class string00
{
    public static void str1()throws IOException
    {
        String s,k;
        int i,j,flag=0,c=0,l;
        char a=' ',b=' ';
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the sentence");
        s=br.readLine();
        s=s+' ';
        l=s.length();
        for(i=0;i<l;i++)
        {
            if(s.charAt(i)==' ')
            {
                k=s.substring(c,i);
                for(j=0;j<k.length();j++)
                {
                    if(j==k.length()-1)
                    {
                        break;
                    }
                    else
                    {
                        a=k.charAt(j);
                        b=k.charAt(j+1);
                        if(a==b)
                        {
                            System.out.println(k);
                        }
                        
                     }
                }    
                     a=' ';
                     b=' ';
                     k="";
                     c=i+1;
            }
        }
    }
     public static void main()throws IOException
{ 
    str1();
}
}    