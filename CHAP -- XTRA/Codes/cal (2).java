import java.io.*;
class cal
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
int mon[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
String s[]={" ","January","February","March","April","May","June","July","August","September","October","November","December"};
int f,i;
int leap(int x)
{
if((x%4==0&&x%100!=0)||(x%400==0))
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

int i,d,m,y,dd,mm,yy,day=0,c=0,f=0,a=0,b=0;
System.out.println("Enter the date DD/MM/YY");
d=Integer.parseInt(buf.readLine());
m=Integer.parseInt(buf.readLine());
y=Integer.parseInt(buf.readLine());
System.out.println("Enter the date DD/MM/YY");
dd=Integer.parseInt(buf.readLine());
mm=Integer.parseInt(buf.readLine());
yy=Integer.parseInt(buf.readLine());
    for(i=y;i<yy;i++)
    {
        if(leap(i)==1)
        day=day+366;
        else 
        day=day+365;   
}
    if(leap(yy)==1)
    {
        mon[2]=29;
    }
    else
    {
        mon[2]=28;
    }
    for(i=1;i<mm;i++)
    {
        day=day+mon[i];
    }
    day=day+dd;
    if(leap(y)==1)
    {
        mon[2]=29;
    }
    else
    {
        mon[2]=29;
    }
    for(i=1;i<m;i++)
    {
        f=f+mon[i];
    }
    f=f+d;
    day=day-f;
System.out.println(day);
a=0;
while(day>365)
{
if(leap(y)==1)
{
a++;
day=day-366;
    }
    else
    {
        a++;
        day=day-365;
    }
}
y=y+a;
if(leap(y)==1)
{
mon[2]=29;
    }
    else
{
mon[2]=28;
    }
if(mm<m)
{
mm=mm+12;
    }
    b=mm-m;
    c=dd-d;
    System.out.println(a+" "+b+" "+c);
    }
    }