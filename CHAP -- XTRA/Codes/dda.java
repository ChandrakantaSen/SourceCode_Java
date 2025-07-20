import java.io.*;

class dda

{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n[][]=new int[3][3];
        int m[][]=new int[3][3];
        System.out.println("Enter the value of first Matrix (3 X 3)");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                n[i][j]=Integer.parseInt(br.readLine());
            }
        }
        System.out.println("Enter the value of second Matrix (3 X 3)");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                m[i][j]=Integer.parseInt(br.readLine());
            }
        }
        System.out.println("\nThe value of first and second matrix are\n");
        int i,j;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(n[i][j]+"  ");
            }
            System.out.print("\t\t");
            for(j=0;j<3;j++)
            {
                System.out.print(m[i][j]+"  ");
            }
            System.out.println();
        }        
    }
}