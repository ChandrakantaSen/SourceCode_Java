import java.util.*;
class Matrix_diagonal
{
    int arr[][],m;
    Matrix_diagonal()
    {
        m=0;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows and the no. of columns :");
        m=sc.nextInt();
        arr=new int[m][m];
        for(int i=0;i<m;i++)
        {
            System.out.println("Enter the elements in row no."+(i+1));
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }
    int greatest_number()
    {
        int max=arr[0][0];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]>max)
                max=arr[i][j];
            }
        }
        return max;
    }
    void replace()
    {
        int max=greatest_number();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if((i==j)||(i+j==m-1))
                arr[i][j]=max;
            }
        }
    }
    void display()
    {
        System.out.println("The replaced matrix is as follows :");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void main()
    {
        Matrix_diagonal ob=new Matrix_diagonal();
        ob.input();
        ob.replace();
        ob.display();
    }
}