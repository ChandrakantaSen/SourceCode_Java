import java.io.*;
public class merging
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int a[]=new int[5];
        int b[]=new int[7];
        int c[]=new int[17];
        int i,j,k=5;
        for(i=0;i<5;i++)
        {
            System.out.println("Enter a number for array a");
            a[i]=Integer.parseInt(in.readLine());
        }
        for(i=0;i<7;i++)
        {
            System.out.println("Enter a number for array b");
            b[i]=Integer.parseInt(in.readLine());
        }
        i=1;j=1;k=1;
        while(i<=5 && j<=5)
        {
            if(a[i]<b[j])
            {
                c[k]=a[i];
                k++;
                i++;
            }
            else
            {
                c[k]=b[j];
                k++;
                j++;
            }
        }
        for(i=0;i<20;i++)
        {
            System.out.println(c[i]);
        }
    }
}
        
     
         