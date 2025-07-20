import java.io.*;
class Bubble_func
{
    static int  i,n,j,t;
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
    public static void Bubblesort()
    {
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
    }
        public static void Bubbleshow()
        {
            System.out.println("The numbers arranged after Bubble Sort are as follows :- ");
            for(i=0;i<n;i++)
            {
                    System.out.println(a[i]);
                }
            }
            public static void main()throws IOException
            {
                Bubble_func ob=new Bubble_func();
                ob.input();
                ob.Bubblesort();
                ob.Bubbleshow();
            }
        }
    