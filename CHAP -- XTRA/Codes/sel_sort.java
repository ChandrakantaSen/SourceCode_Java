package All;

import java.io.*;
class sel_sort
{
    public void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int m[]=new int[10];
        System.out.println("Enter numbers");
        for(int i=0;i<10;i++)
        {
            m[i]=Integer.parseInt(br.readLine());
        }
        int q;
        int min,t;
        for(int i=0;i<10;i++)
        {
            min=m[i];
            q=i;
            for(int j=i+1;j<10;j++)
            {
                if(m[j]<min)
                {
                    min=m[j];
                    q=j;
                }
            }
            t=m[i];
            m[i]=m[q];
            m[q]=t;
        }
        System.out.println("Sorted array");
        for(int i=0;i<10;i++)
        {
            System.out.println(m[i]+" ");
        }

    }
}
