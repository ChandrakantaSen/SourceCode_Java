//WAP TO GENERATE AND STORE THE 30 TERMS OF FIBONACCI LIST USING AN ARRAY fibarr[30]
import java.io.*;
class fibo
{
 public static void main()throws IOException
 {
     InputStreamReader inp=new InputStreamReader(System.in);
     BufferedReader red=new BufferedReader(inp);
     System.out.println("Enter np");
     int n=Integer.parseInt(red.readLine());
     int fibarr[]=new int[n];
     int a=5,b=8,c=0,c1=0,k=2,i=0;
     fibarr[0]=a;
     fibarr[1]=b;
     do
     {
       c=a+b;
       fibarr[k]=c;
       a=b;
       b=c;
       k++;
         
         i++;
      }while(i<=n);
      for(i=0;i<=n;i++)
      {
          System.out.println("Terms="+fibarr[i]);
          c1+=fibarr[i];
        }
          System.out.println(c1);
       
    }
} 
        
       