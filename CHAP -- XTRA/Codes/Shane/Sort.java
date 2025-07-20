import java.io.*;
public class Sort
{
    int arr[]=new int[50],item;
    void inpdata()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int i;
        for(i=0;i<50;i++)
        {
            System.out.println("Enter a number");
            arr[i]=Integer.parseInt(in.readLine());
        }
    }
    void bubsort()
    {
        int i,j,t;
        for(i=0;i<50;i++)
        {
            for(j=0;j<49-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        System.out.println("The sorted array:");
        for(i=0;i<50;i++)
        {
            System.out.println(arr[i]);
        }
    }
    void binsearch()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int lb=0,hb=49,c,i,m=(lb+hb)/2,k=0;
        System.out.println("Enter the element to be searched");
        c=Integer.parseInt(in.readLine());
        for(i=0;i<50;i++)
        {
            m=(lb+hb)/2;
            if(arr[m]==c)
            {
                k=k+1;
            }
            if(arr[m]<c)
            {
                lb=m+1;
            }
            if(arr[m]>c)
            {
                hb=m-1;
            }
        }
        if(k>0)
        {
            System.out.println("Search found");
        }
        else
        {
            System.out.println("Search not found");
        }
    }
    public static void main(String args[])throws IOException
    {
        Sort obj=new Sort();
        obj.inpdata();
        obj.bubsort();
        obj.binsearch();
    }
}
   
            
        
            
            
            
            
            
            
        
        
                    
    
        
            
    