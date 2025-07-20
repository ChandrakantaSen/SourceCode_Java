import java.io.*;
class sau
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
int mon[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
String s[]={" ","January","February","March","April","May","June","July","August","September","October","November","December"};
int i,m=1,d=1,y=2006,f=0;
long day=0,c=0;
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
sau ob=new sau();
int dd,mm,yy;
System.out.println("Enter the date DD/MM/YY");
dd=Integer.parseInt(buf.readLine());
mm=Integer.parseInt(buf.readLine());
yy=Integer.parseInt(buf.readLine());
if((yy>y)||(yy==y))
{
ob.after(dd,mm,yy);
    }
    else
    {
        ob.before(dd,mm,yy);
    }
System.out.println("100 years later");
yy=yy+100;
System.out.println(dd+"/"+mm+"/"+yy);
if(yy>y)
{
ob.after(dd,mm,yy);
    }
    else
    {
        ob.before(dd,mm,yy);
    }
System.out.println("100 years before");
yy=yy-200;

System.out.println(dd+"/"+mm+"/"+yy);
if(yy>y)
{
ob.after(dd,mm,yy);
    }
    else
    {
        ob.before(dd,mm,yy);
    }
        
}
void after(int dd,int mm,int yy)
{
if(leap(yy)==1)
{
mon[2]=29;
    }
    
    f=0;

    day=0;
    if((yy-y)>0)
    {
        
        for(i=y;i<yy;i++)
        {
        day=day+count(i);
    }
    i=0;
    day=day;
  
    while(i<mm)
    {
        f=f+mon[i];
    i++;
}
f=f+dd-1;
day=day+f;
    }
    else
    {
        i=m;
       while(i<mm)
    {
        f=f+mon[i];
    i++;
} 
    f=dd-d;
    day=day+f;

}

c=day%7;
f=(int)c;
switch(f)
{
case 0:System.out.println("Sunday ");
break;
case 1:System.out.println("Monday ");
break;
case 2:System.out.println("Tuesday ");
break;
case 3:System.out.println("Wednesday ");
break;
case 4:System.out.println("Thursday ");
break;
case 5:System.out.println("Friday ");
break;
case 6:System.out.println("Saturday ");
break;
    }
    
}
void before(int dd,int mm,int yy)
{
mon[2]=28;
f=0;
        c=0;
        day=0;
if((y-yy)>0)
    {
        for(i=yy;i<y;i++)
        {
        day=day+count(i);
    }
    i=0;
    while(i<mm)
    {
        f=f+mon[i];
    i++;
}
    f=f+dd;
    day=day-f;
    
    }
    

c=day%7;
f=(int)c;
switch(f)
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
