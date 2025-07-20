import java.io.*;
class sum
{
 public static void main()throws IOException
 {
     InputStreamReader inp=new InputStreamReader(System.in);
     BufferedReader red=new BufferedReader(inp);
     int arr[]=new int[10];
     int sum=0;
     for(int i=1;i<=10;i++)
     {
         System.out.println("Enter range:");

         
     
     int j,f=0;
     for(j=2;j<arr[i];j++)
     {
         if(arr[i]%j==0)
         f=1;
      }
        if(f==0)
        System.out.println("Prime");
        else
        System.out.println("Not Prime");
    }}
} 
     
     
        