package All;

import java.io.*;
class string1
{
    public static void array()throws IOException
    {
        int i,j,n,max;
        String p="";
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of students");
        n=Integer.parseInt(br.readLine());
        String a[]=new String[n];
        int b[]=new int[n];
        System.out.println("Enter the name of students");
        for(i=0;i<n;i++)
        {
            a[i]=br.readLine();
        }
        System.out.println("Enter the marks of students");
        for(i=0;i<n;i++)
        {
            b[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("The name of students along with their marks are as follows:-");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]+"    "+b[i]);
        }
        max=0;
        for(i=0;i<n;i++)
        {
            if(b[i]>max)
            {
                max=b[i];
                p=a[i];
            }
        }
        System.out.println("The name of the students with maximum marks is");
        System.out.println(p+"      "+max);
    }
}