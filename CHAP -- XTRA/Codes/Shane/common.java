import java.io.*;
public class common
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int i,j,A,c,k=0;
        System.out.println("Enter the elements for array 1");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=Integer.parseInt(in.readLine());
            }
        }
        System.out.println("Enter the elements of array 2");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                b[i][j]=Integer.parseInt(in.readLine());
            }
        }
        System.out.println("The common elements are:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                for(A=0;A<3;A++)
                {
                    for(c=0;c<3;c++)
                    {
                        if(a[i][j]==b[A][c])
                        {
                            System.out.println(a[i][j]);
                        }
                    }
                }
            }
        }
    }
}
        
                            
                