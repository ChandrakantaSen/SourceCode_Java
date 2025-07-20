import java.io.*;
class search
{
    void s_array(int a[],int s)
    {
    int f=1;
    for(int i=0;i<10;i++)
    {
        if(a[i]==s)
        f=f+1;
    }
    if(f==2)
    System.out.println("Searching is successfull");
    else
     System.out.println("Searching is not successfull");
    }


    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter array numbers");
        int a[]=new int[10];
        for(int i=0;i<10;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Enter searching number");
        int n=Integer.parseInt(br.readLine());
        search ob=new search();
        ob.s_array(a,n);
    }
}