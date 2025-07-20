import java.io.*;
class freqOfDigWithoutArray
{
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no");
int n=Integer.parseInt(br.readLine());
int l=0,i,j,f=0;
int s=0,s2=0;
for(i=n;i>0;i/=10)
{
int c=i%10;
f=0;
    for(j=n;j>=i;j/=10)
    {
        int c2=j%10;
            if(c==c2)
            f++;
            c2=0;
    if(f==0)
    s2=s2*10+c;
    c=0;
}}
for(i=s2;i>0;i/=10)
{
int c=i%10;
f=0;
    for(j=n;j>=i;j/=10)
    {
        int c2=i%10;
            if(c==c2)
            f++;
            c2=0;
    }
    System.out.println("Frequency of '"+c+"' is "+f);
    c=0;
    }
}
    }