import java.io.*;
class HighestNo
 {
     public static void main(String args[]) throws IOException
     {
         BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
         int n[]=new int[10];
         int max=0;
         for (int i=0;i<10;i++)
         {
           System.out.println("Enter 10 values to be checked");
           n[i]=Integer.parseInt(br.readLine());
        }
        max=n[0];
        for (int j=1;j<10;j++)
        {
            if (max<n[j])
            {
                max=n[j];
            }
        }
        System.out.println("the highest no is = "+max);
    }
}
