import java .io.*;
class changenum
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,t;
        System.out.println("Enter the size of Array");
        n=Integer.parseInt(br.readLine());
        int a[]=new int[n];
        System.out.println("Enter the values in Array");
         for(int i=0;i<n;i++)
         {
             a[i]=Integer.parseInt(br.readLine());
            }
            System.out.println("change of number");
            for(int i=0;i<n-1;i=i+2)
            {
                t=a[i];
                a[i]=a[i+1];
                a[i+1]=t;
                
                
            }
            for(int i=0;i<n;i=i+1)
            {
            System.out.println(a[i]);
        }
    }
}
    