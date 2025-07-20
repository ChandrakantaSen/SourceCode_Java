import java.io.*;
class mirrormatrix
{
public static void main()throws IOException
{
   int n,i,j;
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
   System.out.println("Mirror matrix");
   for(i=0;i<n;i++)
   {
       for(j=n-1;j>=0;j--)
   {   
       System.out.print(a[i][j]+" ");
    } 
    System.out.println();
}
}
}