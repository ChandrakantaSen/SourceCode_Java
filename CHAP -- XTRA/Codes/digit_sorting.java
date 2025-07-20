package All;

import java.io.*;
class digit_sorting
{
    public static void main(String args[])throws IOException
    {
        int i,d,n;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number: ");
        n = Integer.parseInt(in.readLine());
        for(i=0;i<10;i++)
        {
            int p=n;
            while(p!=0)
            {
                d=p%10;
                
                if(d==i)
                {
                    System.out.print(d+" ");
                }
                p=p/10;
            }
            
        }
        System.out.println();
    }
}
