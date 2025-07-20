import java.io.*;
class Keithno
{
public static void main(String args[]) throws IOException

{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("ENTER NUMBER");
int c=0,p=0,s=0,f=0,l=0,i=0,n;
n=Integer.parseInt(br.readLine());
int copy=n;
{
while(n>0)
{
c=n%10;//4,1
p=p*10+c;//41
s=s+c;//5
n=n/10;//1
    }
    System.out.println(s);//5
        System.out.println(p);//41
    f=p%10;//1,4
    p=p/10;//4
    l=s;//5

    while(i<copy)//i<14
    {
        
        System.out.println(l);//5
        i=l*2-f;//9
        l=i;//5
        if(p>0)
        {
            f=p%10;//4
            p=p/10;//0
        }
        else
        {
        f=s;//5
    }
    }
    if(i==copy)
    {
    System.out.print(copy+" IS A KEITH NUMBER");
}
else
{
    System.out.print(copy+" IS NOT A KEITH NUMBER");
}
}  
    
}
    }
    