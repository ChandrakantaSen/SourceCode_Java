import java.io.*;
public class tranpose
{
 public static void main(String args[])throws IOException
 {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     int m[][]=new int[4][4];
     for(int i=0;i<4;i++)
     {
         for(int j=0;j<4;j++)
         {
             System.out.println("enter the elements");
             m[i][j]=Integer.parseInt(br.readLine());
            }
        }
        int temp[][]=new int[m.length][m[1].length];
        System.out.println("tarnspose matrix");
        for(int i=0;i<m.length;i++)
        {
            for(int j=0;j<m[0].length;j++)
            {
                temp[i][j]=m[j][i];
                System.out.println(temp[i][j]);
            }
            System.out.println();
        }
    }
}
