import java.io.*;
class LowestNo
 {
     public static void main(String args[]) throws IOException
     {
         BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
         int n[]=new int[10];
         int min;
         for (int i=0;i<10;i++)
         {
           System.out.println("Enter 10 values to be checked");
           n[i]=Integer.parseInt(br.readLine());
        }
        min=n[0];
        for (int j=1;j<10;j++)
        {
            if (min>n[j])
            {
                min=n[j];
            }
        }
        System.out.println("the lowest no is = "+min);
    }
}
