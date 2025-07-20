import java.io.*;
class Sequen_func
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
    public static void Selecsort()
    {
        for(i=0;i<n-1;i++)
        {
            for(j=i;j<n;j++)          
            {
                 if(a[i]>a[j])
                 {
                        t=a[i];
                        a[i]=a[j];
                        a[j]=t;
                    }
                }
            }
        }
        public static void Selecshow()
        {    
            System.out.println("The numbers arranged after Sequential Sort are as follows :- ");
            for(i=0;i<n;i++)
            {
                    System.out.println(a[i]);
                }
            }
            public static void main()throws IOException
            {
                Selec_func ob=new Selec_func();
                ob.input();
                ob.Selecsort();
                ob.Selecshow();
            }
        }
    