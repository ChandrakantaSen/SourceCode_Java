package All;

import java.io.*;
class stringg
{
    public static void str()throws IOException
    {
        String s;
        int i,j,flag=0,l;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string");
        s=br.readLine();
        l=s.length();
        for(i=0;i<l;i++)
        {
           for(j=i-1;j>=0;j--)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                flag=1;
                break;
            }
        }
        if(flag!=1)
        {
        System.out.print(s.charAt(i));
    }
    flag=0;
}
}
    public static void main()throws IOException
{
    str();
}
}            