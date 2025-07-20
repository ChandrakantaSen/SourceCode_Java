import java.io.*;
class max
{
public static void main()throws IOException
{
   int n,i,j,max=0;
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Enter the range");
   n=Integer.parseInt(br.readLine());
   int a[][]=new int[n][n];
   System.out.println("Enter the elements");
   for(i=0;i<n;i++)
    {
       for(j=0;j<n;j++)
        {
      a[i][j]=Integer.parseInt(br.readLine());
        }
   }
   System.out.println("The elements are");
   for(i=0;i<n;i++)
   {
       for(j=0;j<n;j++)
          {   
       System.out.print(a[i][j]+" ");
          } 
    System.out.println();
   }
     for(i=0;i<n;i++)
        {
          for(j=0;j<n;j++)
            {
       if(a[i][j]>max)
       {
           max=a[i][j];
        }
    }
}
   System.out.println("The maximum number in the two dimensional array is"+max);
}
}

           