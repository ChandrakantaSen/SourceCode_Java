import java.io.*;
class inser_func
{
    static int  i,n,j,k,t;
    static  int a[]=new int[100];
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void input()throws IOException
    {
        System.out.println("Enter the size of the array  ");
        n=Integer.parseInt(br.readLine());
        System.out.println("Enter the numbers in the array  ");
        for(i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
    }
    public static void insersort()
    {
        for(i=0;i<n;i++)
        {
            for(j=0;j<i;j++)
            {
                if(a[j]>a[i])
                {
                    t=a[j];
                    a[j]=a[i];
                    for(k=i;k>j;k--)
                    {
                    a[k]=a[k-1];
                }
                    a[k+1]=t;
                    }
                }
        }
    }
        public static void insershow()
        {    
            System.out.println("The numbers arranged after insertion Sort are as follows :- ");
            for(i=0;i<n;i++)
            {
                    System.out.println(a[i]);
                }
            }
            public static void main()throws IOException
            {
                inser_func ob=new inser_func();
                ob.input();
                ob.insersort();
                ob.insershow();
            }
        }
    