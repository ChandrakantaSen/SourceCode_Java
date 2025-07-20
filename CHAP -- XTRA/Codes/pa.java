import java.io.*;
class pa
  {
      public static void main(String args[])throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int i,j,n,k=5,b=1;
            System.out.println("Enter the first number :- ");
            n=Integer.parseInt(br.readLine());
            for(i=1;i<=n;i++)
              if(i==b || i==k)
              System.out.print("*");
            }
        }