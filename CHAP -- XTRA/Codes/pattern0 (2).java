import java.io.*;
class pattern0
{
public static void main()throws IOException
{
   int i,j,n,k;
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Enter the range");
   n=Integer.parseInt(br.readLine());
   for(i=1;i<=n;i++)
   {
       for(j=1;j<=i;j++)
   {   
       System.out.print(i+" ");
   }
   for(k=i+1;k<=n;k++)
   {
       System.out.print(k+" ");
    }
   System.out.println();
}
}
}
       
   