import java.io.*;
class pat1
  {
      public static void main(String args[])throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int i,j,n;
            System.out.println("enter the value of n=");
            n=Integer.parseInt(br.readLine());
            for(i=n;i>=1;i--)
              {
                  for(j=i;j<=n;j++)
                    {
                        System.out.print(j+" ");
                    }
                              System.out.println();
                            }
                        }
                    }