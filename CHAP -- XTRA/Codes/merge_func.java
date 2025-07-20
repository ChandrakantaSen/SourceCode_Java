import java.io.*;
class merge_func
{
    static int  i,j,n,t,m,k;
    static  int a[]=new int[100];
    static  int b[]=new int[100];
    static  int c[]=new int[100];
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void input()throws IOException
    {
        System.out.println("Enter the size of the array a :- ");
        n=Integer.parseInt(br.readLine());
        System.out.println("Enter the size of the array b :- ");
        m=Integer.parseInt(br.readLine());
        for(i=0;i<n;i++)
        {
            System.out.println("\nEnter the value of the array a "+(i+1));
            a[i]=Integer.parseInt(br.readLine());
            
        }
        System.out.println("\n________________________________________");
        for(i=0;i<m;i++)
        {
            System.out.println("\nEnter the value of the array b "+(i+1));
            b[i]=Integer.parseInt(br.readLine());
        }
    }
    public static void mergesort()
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
                for(i=0;i<m;i++)
                {
                    for(j=0;j<m-1;j++)
                    {
                        if(b[j]>b[j+1])
                        {
                            t=b[j];
                            b[j]=b[j+1];
                            b[j+1]=t;
                }
            }
        }
                
                /*MERGE SORT*/
                for(i=j=k=0;i<(m+n);)
                {
                    if(a[j]<=b[k])
                    {
                        c[i++]=a[j++];
                    }
                    else
                    {
                        c[i++]=b[k++];
                    }
                    if((k==m)||(j==n))
                    {
                    break;
                }
            }
            for(;j<n;)
             {
              c[i++]=a[j++];
                    }
                        for(;k<m;)
                        {
                        c[i++]=b[k++];
                    }
                }
        public static void mergeshow()
        { 
            System.out.println("\n________________________________________");
                System.out.println("The numbers in the array a after  sort are : -  ");
                for(i=0;i<n;i++)
                {
                    System.out.print(a[i]+"   ");
                }
                System.out.println("\n________________________________________");
                System.out.println("\n\nThe numbers in the array b after  sort are : -  ");
                for(i=0;i<m;i++)
                {
                    System.out.print(b[i]+"   ");
                }
                System.out.println("\n________________________________________");
                System.out.println("\nThe sorted array is :-  ");
                for(i=0;i<n+m;i++)
                {
                    System.out.println(c[i]+"   ");
                }
            }
                    
            public static void main()throws IOException
            {
                merge_func ob=new merge_func();
                ob.input();
                ob.mergesort();
                ob.mergeshow();
            }
        }
    