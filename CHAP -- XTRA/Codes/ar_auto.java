import java.io.*;
class ar_auto
{
    public static void main(String args[])throws IOException
    {
        int i,n,m,d,c=0,c1=0,n1;  
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
        int z=0;
        System.out.println("Automorphic numbers in the array are as follows : - ");
        for(i=0;i<n;i++)
        {
            d=0;
            c=0;
            c1=0;
            n=(a[i]*a[i]);
            m=n;
            while(m>0)
            {
                c++;
                m=m/10;
            }
            m=n;    
            d=0;
            if(c==2)
            {
                while(m>0)
                {
                    d=m%10;
                    c1++;
                    if(c1==1)
                    {
                        break;
                    }
                }
            }
            else if(c==3)
            {
                while(m>0)
                {
                    d=m%100;
                    c1++;
                    if(c1==1)
                    {
                        break;
                    }
                }
            } 
            if(d==a[i])
            {
            z++;
            System.out.println(a[i]);   
                }
            }
            System.out.println("Number of Automorphic numbers in the array are as follows : - "+z);
        }     
    }

 

