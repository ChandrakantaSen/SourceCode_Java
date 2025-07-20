import java.io.*;
class transpose
{
public static void main()throws IOException
{
   int n,i,j,flag=0;
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
       if(a[i][j]!=a[j][i])
       {
           flag=1;
           break;
       }
     }
   }
if(flag!=1)
{
   System.out.println("It is a symmetric matrix");    
}
else
{
   System.out.println("It is not a symmetric matrix");    
}
}
}