import java.io.*;
class calender2
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
int count(int x)
{
if(leap(x)==1)
{
return 366;
    }
    
else
{
return 365;
    }
}
void main()throws IOException
{

int i,d,m,y,dd,mm,yy,day=0,c=0,f=0;
d=1;
m=1;
y=2006;
System.out.println("Enter the date DD/MM/YY");
dd=Integer.parseInt(buf.readLine());
mm=Integer.parseInt(buf.readLine());
yy=Integer.parseInt(buf.readLine());

    if((y-yy)>0)
    {
        
        for(i=yy;i<y;i++)
        {
        day=day+count(i);
    }
    i=0;
    if(leap(yy)==1)
    {
        mon[2]=29;
    }
    while(i<mm)
    {
        f=f+mon[i];
    i++;
}
    f=f+dd;
    day=day-f;
    f=0;
    if(leap(y)==1)
    {
        mon[2]=29;
    }
    else
    {
        mon[2]=28;
    }
    i=0;
    while(i<m)
    {
        f=f+mon[i];
    i++;
}
f=f+d;
day=day+f;
    }
    

c=day%7;
switch(c)
{
case 0:System.out.println("Sunday ");
break;
case 6:System.out.println("Monday ");
break;
case 5:System.out.println("Tuesday ");
break;
case 4:System.out.println("Wednesday ");
break;
case 3:System.out.println("Thursday ");
break;
case 2:System.out.println("Friday ");
break;
case 1:System.out.println("Saturday ");
break;
    }
}
    }