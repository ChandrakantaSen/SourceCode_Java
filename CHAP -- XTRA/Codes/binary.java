import java.io.*;
class binary
{
    BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
    public int n,u,l,i,mid,flag,p;
    int A[]=new int[100];
    binary(int nn)
    {
        n=nn;
        
        u=n-1;
        l=0;
        mid=0;
        flag=-1;
        p=0;
    }
    
    void getdata()throws IOException
    {
        
        System.out.println("Enter  elements : ");
        for(i=0;i<n;i++)
        {
            A[i]=Integer.parseInt(buf.readLine());
        }
    }
    
    
    int search(int p)
    {
        mid=(u+l)/2;
        
        if(u<l)
        {
            return -1;
        }
        if(A[mid]>p)
        {
            u=mid-1;
        }
        if(A[mid]<p)
        {
            l=mid+1;
        }
        else
        {
            flag=0;
            return flag;
        }
        return search(p);
    }
    
    void result()
    {
        p=search(n);
        if(p==-1)
        {
            System.out.println("Number not found");
            
        }
        if(p==0)
        {
            System.out.println("Number  found at "+(mid+1));
        }
        
    }
}


   
    
    
    

