import java.io.*;
class SelectionSort
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i,j,t,min;
        int m[]=new int[10];
        for(i=0;i<10;i++)
        {
            System.out.print("Enter The Number : ");
            m[i]=Integer.parseInt(br.readLine());
        }

        for(i=0;i<10;i++)
        {
            min=i;
            for(j=i+1;j<10;j++)
            {
                if(m[i]>m[min])
                {
                    min=j;
                    t=m[i];
                    m[i]=m[min];
                    m[min]=t;
                }
            }

        }
        System.out.println("The Numbers r Arranged in Ascending Order");
        for(i=0;i<10;i++)
            System.out.println(m[i]);
    }
}