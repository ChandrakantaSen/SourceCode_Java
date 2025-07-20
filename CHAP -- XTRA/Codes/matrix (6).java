import java.util.*;
class matrix
{
    int m[][]=new int[3][3];
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println("Enter element in row no."+(i+1)+" and column no."+(j+1)+" :");  
                m[i][j]=sc.nextInt();
            }
        }
    }
    void rowsum()
    {
        int sum;
        for(int i=0;i<3;i++)
        {
            sum=0;
            for(int j=0;j<3;j++)
            {
                sum+=m[i][j];
            }
            System.out.println("Sum of elements of row no."+(i+1)+" = "+sum);
        }
    }
    void colsum()
    {
        int sum;
        for(int i=0;i<3;i++)
        {
            sum=0;
            for(int j=0;j<3;j++)
            {
                sum+=m[j][i];
            }
            System.out.println("Sum of elements of column no."+(i+1)+" = "+sum);
        }
    }
}