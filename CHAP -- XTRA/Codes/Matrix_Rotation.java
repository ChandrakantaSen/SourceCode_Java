import java.util.*;
class Matrix_Rotation
{
    int Arr[][],row,col;
    Matrix_Rotation(int r,int c)
    {
        row=r;
        col=c;
        Arr=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                Arr[i][j]=0;
            }
        }
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<row;i++)
        {
            System.out.println("Enter the elements in row no."+(i+1)+" :");
            for(int j=0;j<col;j++)
            {
                Arr[i][j]=sc.nextInt();
            }
        }
    }
    void display()
    {
        int rot[][]=new int[col][row];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                rot[j][row-i-1]=Arr[i][j];
            }
        }
        System.out.println("Original Matrix :");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(Arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Rotated Matrix :");
        for(int i=0;i<col;i++)
        {
            for(int j=0;j<row;j++)
            {
                System.out.print(rot[i][j]+" ");
            }
            System.out.println();
        }
    }
}