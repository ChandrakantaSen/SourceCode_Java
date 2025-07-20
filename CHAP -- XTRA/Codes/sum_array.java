import java.io.*;
class sum_array
{
    public static void main(String args[])throws IOException
    {
        int i,s=0,n;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the array  ");
        n=Integer.parseInt(br.readLine());
        int a[]=new int[n];
        System.out.println("Enter the numbers in the array  ");
        for(i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("The numbers in the array are  ");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        for(i=0;i<n;i++)
        {
            s=s+a[i];
            }
            System.out.println("Sum of the array is  "+s);

    }
}
   
