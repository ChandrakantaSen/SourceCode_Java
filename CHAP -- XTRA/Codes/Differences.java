import java.io.*;
class Differences
 {
     public static void main(String args[]) throws IOException
     {
         BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
         int n[]=new int[10];
         int max,min,a;
         for (int i=0;i<10;i++)
         {
           System.out.println("Enter 10 values to be checked");
           n[i]=Integer.parseInt(br.readLine());
        }
        max=n[0];
        min=n[0];
        for (int j=1;j<10;j++)
        {
            if (max<n[j])
            {
                max=n[j];
            }
            if (min>n[j])
            {
                min=n[j];
            }
        }
        
        a=max-min;
        System.out.println("the difference is = "+a);
    }
}
