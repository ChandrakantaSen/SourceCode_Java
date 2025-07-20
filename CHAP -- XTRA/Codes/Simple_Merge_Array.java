package All;

import java.io.*;
class Simple_Merge_Array
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a[]=new int[5];
        int b[]=new int[5];
        int c[]=new int[100];
        int i,j,d=0,p=0;
        System.out.println("Enter nos. for 1st array");        
        for(i=0;i<5;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Enter nos. for 2nd array");        
        for(i=0;i<5;i++)
        {
            b[i]=Integer.parseInt(br.readLine());
        }

        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
                if( a[i]==b[j])
                {
                    a[i]=0;
                    b[j]=0;
                }       
            }
        }        

        System.out.println("After creating 3rd array");        
        for(i=0;i<10;i++)
        {
            if(i<5 && a[i]>0)
            {
                c[d]=a[i];
            }
            else if(i>4 && b[i-5]>0)
            {
                c[d]=b[i-5];
            }
            d++;
        }
        for(i=0;i<10;i++)
        {
            if(c[i]>0)
            {
                System.out.print(c[i]+" ");
            }
        }   
    }
}
