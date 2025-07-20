import java.io.*;
class bin
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//InputStreamReader ir= (br);

int a[]=new int[10];
int i,j;
for(i=0;i<10;i++)
{
for(j=0;j<9;j++)
{
if(a[i]>a[j])
{
a[i]=a[i]+a[j];
a[j]=a[i]-a[j];
a[i]=a[i]-a[j];
}
    }
for(i=0;i<10;i++)
{
System.out.println(a[i]);
    }
    for(i=0;i<10;i++)
    {
        System.out.println("Enter the number to be searched");
        int n=Integer.parseInt(br.readLine());
        if(n==a[i])
        {
            System.out.println("The position of the element is"+i);
        }
        else
        {
            System.out.println("The element is not found");
        }
    }
}
     
    }}