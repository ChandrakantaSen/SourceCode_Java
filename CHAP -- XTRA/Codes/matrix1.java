import java.io.*;
class matrix1
{
    int a[][]=new int [5][5];
    int b[][]=new int [5][5];
    int n,m,r,c;
    matrix1()
    {   
       int a[][]={{0,0,0,0,0},
        {0,0,0,0,0},
        {0,0,0,0,0},
        {0,0,0,0,0},
        {0,0,0,0,0}};
            
       int b[][]={{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0}};
        m=0;n=0;r=0;c=0;
    }
    void readLimit()throws IOException
    {
        BufferedReader br=new BufferedReader(System.in);
        System.out.print("Enter the no of rows of matrix a: ");
        n=Integer.parseInt(br.readLine());
        System.out.print("Enter the no of columns of matrix a: ");
        m=Integer.parseInt(br.readLine());
        System.out.print("Enter the no of rows of matrix b: ");
        r=Integer.parseInt(br.readLine());
        System.out.print("Enter the no of columns of matrix b: ");
        c=Integer.parseInt(br.readLine());
    }
    void input_a()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the elements of matrix a: ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                a[i][j]=Integer.parseInt(br.readLine());
            }
        }
    }
    void input_b()throws IOException
    {
        int i,j;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the elements of matrix b: ");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                b[i][j]=Integer.parseInt(br.readLine());
            }
        }
    }
    void showmats()
    {
        System.out.println("\n\t\tMATRIX1");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\n\t\tMATRIX2");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
        
        
        
        
    