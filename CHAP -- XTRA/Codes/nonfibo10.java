import java.io.*;
class aa
{
    int i;
    int nonfibo(int x)
    {
        int j,a=0,b=1,c=0,d,s=0;
        for(j=1;j<=100;j++)
        {
            if(c==x)
            return 0;
            
            c=a+b;
            b=a;
            a=c;
        }
        return x;
    }
    void main()
    {
        aa ob = new aa();
        int c=0;
        for(i=1;i<=100;i++)
        {
            int x=ob.nonfibo(i);
            if(x>0)
            {
                System.out.print(x+" ");
                c++;
            }
            if (c==10)
            break;
        }
    }
}
            
            
