import java.util.*;
class Prime
{
    int arr[][];
    int r,c;
    Prime()
    {
        r=3;
        c=3;
        arr=new int[r][c];
    }
    int isprime(int p)
    {
        int i,c=0;
        for(i=1;i<=p;i++)
        {
            if(p%i==0)
            {
                c++;
            }
        }
        if(c==2)
        return 1;
        else
        return 0;
    }
    void fill()
    {
        int b[]=new int[9];
        int x=0,i=0,j=0,a=1;
        while(x<9)
        {
            int k=isprime(a);
            if(k==1)
            {
                b[i++]=a;
                x++;
            }
            a++;
        }
        x=0;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                arr[i][j]=b[x++];
            }
        }
    }
    void display()
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void main()
    {
        Prime ob=new Prime();
        ob.fill();
        ob.display();
    }
}