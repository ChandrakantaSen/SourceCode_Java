import java.io.*;
class calender
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
int mon[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
String s[]={" ","January","February","March","April","May","June","July","August","September","October","November","December"};
int f,i;
int leap(int x)
{
if(x%4==0)
    {
return 1;
    }
    else
    {
        return 0;
    }
}
void main()throws IOException
{

int i,d,m,y,day,c=0,f=0;
System.out.println("Enter the date DD/MM/YY");
d=Integer.parseInt(buf.readLine());
m=Integer.parseInt(buf.readLine());
y=Integer.parseInt(buf.readLine());
System.out.println("Enter the no. of days : ");
day=Integer.parseInt(buf.readLine());
day=day+d;
    while(day>mon[m])
    {
        if(leap(y)==1)
        {
            mon[2]=29;
        }
        else
        {
            mon[2]=28;
        }
        day=day-mon[m];
        m++;
        if(m>12)
        {
            m=1;
            y++;
        }
    }
    System.out.println("New date :");
    System.out.println(day+"."+m+"."+y);
}
    }