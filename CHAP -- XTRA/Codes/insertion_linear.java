import java.io.*;
class insertion_linear
{
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int d,i,j,k,temp=0;
System.out.print("Enter the size of the array");
d=Integer.parseInt(br.readLine());
int b[]=new int[d];
System.out.println("Enter the array elements of the array");
for(i=0;i<d;i++)
{
b[i]=Integer.parseInt(br.readLine());
    }
    System.out.println("Display of the array is:-");
for(i=0;i<d;i++)
{
System.out.println(b[i]);
    }
    for(i=0;i<d;i++)
    {
        for(j=0;j<i;j++)
        {
            if(b[j]>b[i])
            {
            temp=b[j];
            b[j]=b[i];
            for(k=i;k>j;k--)
            {
                b[k]=b[k-1];
            }
            b[k+1]=temp;
        }
    }
}
System.out.println("The sorted array is:-");
for(i=0;i<d;i++)
{
System.out.println(b[i]);
    }
    
}
    }
    

    