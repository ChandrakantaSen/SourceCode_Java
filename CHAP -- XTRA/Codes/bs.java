import java .io.*;
class bs 
{
public static void main( String a[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int d=0,c=9,m=0,p,l;
int flag=0;
int ar[]=new int [10];
for(int i=0;i<10;i++)
{
System.out.println("Enter nos in"+i+"cell");
ar[i]=Integer.parseInt(br.readLine());
    }
    for(int i=0;i<10;i++)
    {
        for(int j=0;j<9;j++)
        {
            if(ar[j]>ar[j+1])
            {
                ar[j]=ar[j]+ar[j+1];
                ar[j+1]=ar[j]-ar[j+1];
                ar[j]=ar[j]-ar[j+1];
            }
        }
    }
    System.out.println("The sorted array is: ");
            for(p=0;p<10;p++)
            {
                System.out.println(ar[p]);
            }
            

                System.out.println("Enter the number to be Searched");
            int n=Integer.parseInt(br.readLine());
        
        while(d<=c)
        {
            m=(d+c)/2;
            if(n>ar[m])
            d=m+1;
            else if(n<ar[m])
            c=m-1;
        else
        {
            flag=1;
            break;
        }
        
        if(flag==1)
        System.out.println("The position of the element is "+(m+1));
        else
        System.out.println("The element is not found");
}
    }
}
