import java.io.*;
class funarray
{
    void funarray1()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,max=0;
        System.out.println("Enter the size of array");
        n=Integer.parseInt(br.readLine());
        int a[]=new int[n];
        System.out.println("Enter the element in array");
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<n;i++)
        {
          if(a[i]>max)
          max=a[i];
        }
          System.out.println("max="+max);
        }
        public static void main(String args[])throws IOException
        {
            funarray ob=new funarray();
            ob.funarray1();
        }
    }