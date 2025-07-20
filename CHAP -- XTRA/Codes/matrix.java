import java.io.*;
class matrix
  {
      public static void main()throws IOException
        {
            int i;
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int a[]=new int [10];
            for(i=0;i<10;i++)
              {
                  System.out.println("the elements in the first matrix=");
                  {
                   a[i]=Integer.parseInt(br.readLine());
                }
                System.out.print(a[i]);
            }
        }
        
    }
                  