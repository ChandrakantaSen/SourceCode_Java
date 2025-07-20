import java.io.*;
class   Selection_sort
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new  BufferedReader(read);
        int i,j,t,min;
        int m[]=new int[12];
        for(i=0;i<12;i++)
        {
            System.out.println("enter numbers :");
            m[i]=Integer.parseInt(in.readLine());

        }
        for(i=0;i<11;i++)
        {
            min=i;
            for(j=i+1;j<12;j++)
            {
                if(m[j]<m[min])
                min=j;
            }
            t=m[i];
            m[i]=m[min];
            m[min]=t;
        }
        System.out.println("The number are arranged in ascending order are ");
        for(i=0;i<12;i++)
        System.out.println(m[i]);
    }
}
