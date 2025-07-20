import java.io.*;
class arm_pallin
{
static int armstrong(int n)
{
int m=n;
int d=0;
int flag=0;
double p=0.00;
while (n!=0)
{
d=n%10;
p=(int)p+(Math.pow(d,3));
n=n/10;
    }
    if(p==m)
    flag=1;
    else flag=0;
return flag;
    }
    
    
    static int pallindrome(int n)
    {
        int c=0;
      int  pallin =0;
        while(n!=0)
        {
            c=n%10;
            pallin=(pallin*10)+c;
            n=n/10;
        }
        return pallin;
    }
    
    
public static void main (String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
       arm_pallin ob=new arm_pallin();
       System.out.println("enter a number");
       int a;
       a=Integer.parseInt(in.readLine());
       if(ob.armstrong(a)==1)
       System.out.println("it is an armstrong no");
       else
       System.out.println("it is not an armstrong no");
        System.out.println("enter another number");
       int p;
      p=Integer.parseInt(in.readLine());
       if(ob.pallindrome(p)==p)
       System.out.println("it is a pallindrome no");
       else
        System.out.println("it is not a pallindrome no");
    }
}

