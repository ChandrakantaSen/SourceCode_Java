import java.io.*;
class twinp
{
 public static void main()throws IOException
 {
     InputStreamReader inp=new InputStreamReader(System.in);
     BufferedReader red=new BufferedReader(inp);
     int l,a=1,b=0,c=0;
     System.out.println("Enter limit:");
     l=Integer.parseInt(red.readLine());
     for(int i=2;i<=l;i++)
     {
         c=0;
         for(int j=2;j<=i/2;j++)
         {
             if(i%j==0)
             c=1;
             break;
          } 
          if(c==0)
          {
              b=i;
              if((b-a)==2)
              System.out.println("Twin Primes are="+a+","+b);
              a=b;
           }
        }
    }
} 
 