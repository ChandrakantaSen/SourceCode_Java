import java.io.*;
class BinarySearch
{
    public static void main(String a[])throws IOException
    {
        BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no. of elements: ");
        int n=Integer.parseInt(f.readLine());//Accepting the number of elements from the user in the variable 'n'. 
        int z[]=new int[n];
        System.out.println("Enter the elements: ");
        for(int q=0;q<n;q++)
        {
            z[q]=Integer.parseInt(f.readLine());
        }
        for(int w=0;w<n;w++)
        {
            for(int e=0;e<n-1;e++)
            {
                if(z[e]>z[e+1])
                {
                    z[e]=z[e]+z[e+1];
                    z[e+1]=z[e]-z[e+1];
                    z[e]=z[e]-z[e+1];
                }
            }
        }
        System.out.println("The sorted array is: ");
        for(int p=0;p<n;p++)
        {
            System.out.println(z[p]);
        }
        int l=0,u=n-1,flag=0,m=0;
        System.out.println("Enter the number to be searched: ");
        int num=Integer.parseInt(f.readLine());
        while(l<=u)
        {
           m=(l+u)/2;
           if(num>z[m])
           l=m+1;
           else if(num<z[m])
           u=m-1;
           else
           {
               flag=1;
               break;
            }
        }
        if(flag==1)
        {
            System.out.println("The element is present at "+(m+1)+"  position");
        }
        else
        {
            System.out.println("SORRY!! Element not present");
        }
    }
}
 
 
 
 