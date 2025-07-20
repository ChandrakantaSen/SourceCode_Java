import java.io.*;
public class bbS
{
  public static void main(String args[])throws IOException
  {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int i,j,t;
      int A[]=new int[10];
      for(i=0;i<10;i++)
      {
          System.out.println("Enter a number");
          A[i]=Integer.parseInt(br.readLine());
        }
        
        for(i=0;i<10;i++)
        {
            for(j=0;j<9-i;j++)
            {
                if(A[j]>A[j+1])
                {
                    t=A[j];
                    A[j]=A[j+1];
                    A[j+1]=t;
                }
            }
        }
       for(j=0;j<10;i++)
       {
           System.out.println("sorted array is="+j);
        }
        
    }
}
