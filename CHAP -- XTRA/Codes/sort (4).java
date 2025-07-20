import java.io.*;
class sort
{
public static void main(String args[])throws IOException
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 String a[][]=new String[5][5];
 for(int i=0;i<5;i++)
 {
     System.out.println("enter name:");
     a[i][0]=br.readLine();
    }
    System.out.print("the sorted names are");
   String t;
    for(int i=0;i<5-1;i++)
    {
        for(int j=i+1;j<5;j++)
        {
            if(a[i][0].length()<a[j][0].length())
            {
                t=a[i][0];
                a[i][0]=a[j][0];
                a[j][0]=t;
            }
        }
    }
    for(int i=0;i<5;i++)
    {
        System.out.println("a[i][0]");
    }
}
    }
        
     