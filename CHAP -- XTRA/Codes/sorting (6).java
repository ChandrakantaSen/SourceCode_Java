package All;

import java.io.*;
public class sorting
    {
        public static void main(String args[])throws IOException
        {
            InputStreamReader read=new InputStreamReader(System.in);
            BufferedReader in=new BufferedReader(read);
            int i,j,t;
            int a[]=new int[10];
            for(i=0;i<10;i++)
            {
                System.out.println("Enter a number");
                a[i]=Integer.parseInt(in.readLine());
            }
            for(i=0;i<9;i++)
            {
                for(j=0;j<9-i;j++)
                {
                    if(a[j]>a[j+1])
                    {
                        t=a[j];
                        a[j]=a[j+1];
                        a[j+1]=t;
                    }
                }
            }
            for(i=0;i<10;i++)
            {
                System.out.println(a[i]);
            }
        }
    }
           
            
                    
              
           