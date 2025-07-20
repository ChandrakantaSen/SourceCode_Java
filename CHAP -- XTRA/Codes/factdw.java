import java.io.*;
class factdw   
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,i;
i=1;
System.out.println("Enter the number to find out its factor");
n=Integer.parseInt(br.readLine());
System.out.println("The factors of the number"+n+"are as follows:");
do
{
if(n%i==0)
{
System.out.println(i);
    }
    i++;
}
    while(i<=n);
}
    }

    

    


