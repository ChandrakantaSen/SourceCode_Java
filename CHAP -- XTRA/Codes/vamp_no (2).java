import java.io.*;
class vamp_no
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n1,n2,n,nd=0,i,j,n3=0,n4=0;
System.out.println("Enter number to check for vampire no");
n=Integer.parseInt(br.readLine());
for(i=n;i>0;i=i/10)
{
nd++;
    }
if(nd%2==1)
{
System.out.println("not a vamp no(no of digits is even for vamp no)");
System.exit(0);
    }
    n1=(int)(n%Math.pow(10,nd/2));
    n2=(int)(n/Math.pow(10,nd/2));
    for(i=n1,j=n2;i>0;i=i/10,j=j/10)
    {
        n3=(n3*10)+(i%10);
        n4=(n4*10)+(j%10);
    }
    System.out.println(n1+","+n3+","+n2+","+n4);
    if(n1*n2==n||n1*n4==n||n3*n4==n||n3*n2==n||(n3*n1==n)||n2*n4==n)
    System.out.println("it is a vampire no");
    else
    System.out.println("it is not a vampire no");
}
    }