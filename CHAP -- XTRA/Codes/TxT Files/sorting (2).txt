import java.io.*;
 class sorting
{
public static void main(String args[])throws IOException
{
int temp;

BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
int a[]=new int[10];
for(int i=0;i<10;i++)
{ 
System.out.print("enter the elements");
a[i]=Integer.parseInt(br.readLine());
    }
    for(int i=0;i<10;i++)
    {
        for(int j=0;i<9;i++)
        {
            if(a[i]>a[j])
            {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
    }
}
            for(int i=0;i<10;i++)
            {
                System.out.print(a[i]);
            }
                int l=0,u=9,m=0,flag=0,num=0;
                System.out.print("enter the element to be searched");
                while(u<=l)
                {
                m=l+u/2;
                if(num>a[m])
                l=m+1;
                if(num<a[m])
                u=m-1;
                else
                {
                    flag=1;
                    break;
                
            }}
           if (flag==1)
           {
            System.out.print("the element is present in"+(m+1)+"position");
        }
        else
        {
        System.out.print("the element is not present");
    }
}
    }

    