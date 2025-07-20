package Puspendu;

import java.io.*;
class stringsearch
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the number of names :");
        int  n=Integer.parseInt(br.readLine());
        String name[]=new String[n];
        System.out.println("Please enter the names :");
        for(int i=0;i<n;i++)
        {
            name[i]=br.readLine();
        }
        System.out.println("Please enter the element to be searched for :");
        String s=br.readLine();;int f=0;
        for(int i=0;i<n;i++)
        {
            if(name[i].equals(s))
            {
            System.out.println("Element found at position "+(i+1));
            f=1;
            break;
        }
    }
    if(f!=1)
    System.out.println("Element not found");
}
}