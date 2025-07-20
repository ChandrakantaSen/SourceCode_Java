import java.util.*;
class Transarray
{
    int arr[][],m,n;
    Transarray()
    {
        m=0;
        n=0;
    }
    Transarray(int mm,int nn)
    {
        m=mm;
        n=nn;
        arr=new int[m][n];
    }
    void fillarray()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<m;i++)
        {
            System.out.println("Enter the elements in row no."+(i+1));
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }
    void transpose(Transarray A)
    {
        for(int j=0;j<A.m;j++)
        {
            for(int i=0;i<A.n;i++)
            {
                arr[i][j]=A.arr[j][i];
            }
        }
    }
    void disparray()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows and then no. of columns of the matrix");
        int m=sc.nextInt();
        int n=sc.nextInt();
        Transarray A=new Transarray(m,n);
        A.fillarray();
        Transarray B=new Transarray(n,m);
        B.transpose(A);
        System.out.println("Original matrix :");
        A.disparray();
        System.out.println("Transpose matrix :");
        B.disparray();
    }
}