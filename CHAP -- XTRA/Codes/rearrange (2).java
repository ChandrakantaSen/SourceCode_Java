package All;

import java.io.*;
public class rearrange
{
    int n,post1,pos2,item;
    int a[]=new int[10];
    void enter()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int i;
       
        for(i=0;i<10;i++)
        {
            System.out.println("Enter a number");
            a[i]=Integer.parseInt(in.readLine());
        }
        
        for(i=0;i<10;i++)
        {
            System.out.println(a[i]);
        }

    }
    void insert()throws IOException
    {
       
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter the item to be inserted");
        item=Integer.parseInt(in.readLine());
        System.out.println("Enter the position of insertion");
        post1=Integer.parseInt(in.readLine());
        if((post1>=0)&&(post1<=(10-1)))
        {
            a[post1]=item;
        }
    }
    void disp1()
    {
        
        System.out.println("Array after insertion:");
        for(int j=0;j<10;j++)
        {
            System.out.println(a[j]);
        }
    }
    void remov()throws IOException
    {
        
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter the positon to be deleted");
        pos2=Integer.parseInt(in.readLine());
    }
    void disp2()
    {
       
        System.out.println("Array after deleting");
        for(int j=0;j<10;j++)
        {
            if(j!=pos2)
            System.out.println(a[j]);
        }
    }
    public static void main(String args[])throws IOException
    {
       
        rearrange t=new rearrange();
        
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);

        t.enter();
        t.insert();
        t.disp1();
        t.remov();
        t.disp2();
    }
}

        
        
        
        
    
            
        