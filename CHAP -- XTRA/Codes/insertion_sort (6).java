import java.io.*;
class insertion_sort
{
public static void main(String args[])throws IOException
{
int d,temp=0,k;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println(" Enter the number of  elements of the array:");
d=Integer.parseInt(br.readLine());
int b[]= new int [d];
for( int i=0;i<d;i++)
{
System.out.println(" Enter the  elements in "+"  "+(i+1)+" "+"cell:");
b[i]=Integer.parseInt(br.readLine());
    }
    //sorting begins
    for(int i=0;i<d;i++)
    {
        for(int j=0;j<i;j++)
        {
            if(b[j]>b[i])
            {
            temp=b[j];
            b[j]=b[i];
            for( k=i;k>j;k--)
            b[k]=b[k-1];
            b[k+1]=temp;
        }
    }
}
System.out.println(" The sorted array is:");
for(int i=0;i<d;i++)
{
System.out.print(b[i]+"   ");
    }
}
}
