 import java.io.*;
class imei
{
long n;
int m,d,s1=0,s2=0,l;
String s;
int separate(int d)
{   s2=0;
    while(d>0)
    {
    m=d%10;
    s2=s2+m;
    d=d/10;
    }
    return s2;
}
void main()throws IOException
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the imei code");
    n=Long.parseLong(br.readLine());
   s=Long.toString(n);
   l=s.length();
   if(l!=15)
   {
       System.out.println("Inavalid iemi");
       return;
   }
   for(int i =15;i>=1;i--)
   {
       d=(int)(n%10);
       if(i%2==0)
       {
           d=d*2;
       }
       s1=s1+separate(d);
       n=n/10;
   }
   System.out.println(s1);
   if(s1%10==0)
   {
       System.out.println("Valid iemi");
   }
    else
   {
       System.out.println(" not a Valid iemi");
   }
}
}        