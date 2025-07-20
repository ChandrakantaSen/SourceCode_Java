import java.io.*;

class Sort 
{
    public static void main(String args[])throws IOException 
    {
        int n,i,d,swap,p,m,rev=0,j,g;
        int array[] = new int[20];
        BufferedReader in =new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the range: ");
        n = Integer.parseInt(in.readLine());

        System.out.println("Enter elements: ");
        for(i = 0; i < n; i++) 
        {
            array[i] = Integer.parseInt(in.readLine());
        }

        System.out.println("Enter number to be check: ");
        p = Integer.parseInt(in.readLine());

        for(i = 0; i < (n - 1); i++) 
        {
            for (j=0; j<(n-i-1); j++)
            {
                if (array[j] > array[j+1]) 
                {
                    swap= array[j];
                    array[j]= array[j+1];
                    array[j+1] = swap;
                }
            }
        }

        System.out.println("Sorted list of numbers");
        for (i=0; i<n; i++) 
        {
            g=array[i];
            if(g<p)
            {
                m=g;
                while(m!=0)
                {
                    d=m % 10;
                    rev = rev * 10 + d;
                    m = m / 10;
                }
                array[i]=rev;
                rev=0;
                System.out.print(array[i]+" ");
            }
            else
            {
                System.out.print(array[i]+" ");
            }
        }
    }
}