import java.io.*;
class mobile
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
int mon[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
String s[]={" ","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
String s1[]={" ","January","February","March","April","May","June","July","August","September","October","November","December"};
int cal[][]=new int[5][7];
int f,i,j,t,z;
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
System.out.println("Enter the month ");
dd=1;
mm=Integer.parseInt(buf.readLine());

System.out.println("Enter the year ");
yy=Integer.parseInt(buf.readLine());

System.out.println("The month is : "+s1[mm]);
if(yy>=y)
{
    if((yy-y)>0)
    {
        
        for(i=y;i<yy;i++)
        {
        day=day+count(i);
    }
    i=0;
    if(leap(y)==1)
    {
        mon[2]=29;
    }
    while(i<m)
    {
        f=f+mon[i];
    i++;
}
    f=f+d;
    day=day-f;
    f=0;
    if(leap(yy)==1)
    {
        mon[2]=29;
    }
    else
    {
        mon[2]=28;
    }
    i=0;
    while(i<mm)
    {
        f=f+mon[i];
    i++;
}
f=f+dd;
day=day+f;
    }
    else
    {
        if(leap(y)==1)
        {
            mon[2]=28;
        }
        i=m;
       while(i<mm)
    {
        f=f+mon[i];
    i++;
} 
    f=f+dd-d;
    day=day+f;

}

c=day%7;
switch(c)
{
case 0:cal[0][6]=1;
dd=6;
break;
case 1:cal[0][0]=1;
dd=0;
break;
case 2:cal[0][1]=1;
dd=1;
break;
case 3:cal[0][2]=1;
dd=2;
break;
case 4:cal[0][3]=1;
dd=3;
break;
case 5:cal[0][4]=1;
dd=4;
break;
case 6:cal[0][5]=1;
dd=5;
break;
    }
    f=2;
t=mon[mm];
for(i=0;i<dd;i++)
{
cal[0][i]=0;
    }
for(i=0;i<5;i++)
{
if(i==0)
{
z=dd+1;
for(j=z;j<7;j++)
{
if(f<=t)
{
cal[i][j]=f;
f++;
    }
    else
    {
        cal[i][j]=0;
    }
    }
}
else
{
z=0;
for(j=z;j<7;j++)
{
if(f<=t)
{
cal[i][j]=f;
f++;
    }
    else
    {
        cal[i][j]=0;
    }
    }
}
}
System.out.println("M  T  W  Th F Sa Su");
for(i=0;i<5;i++) 
{
for(j=0;j<7;j++)
{
if(cal[i][j]==0)
{
System.out.print("   ");

    }
else if(cal[i][j]>0&&cal[i][j]<10)
{
System.out.print(cal[i][j]+"  ");
    }
    else
    {
        System.out.print(cal[i][j]+" ");
    }
        
}
System.out.println();
}

while(f<=t)
{
System.out.print(f+" ");
f++;
}
    }
else
{
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
f=f+d-1;
day=day+f;
    }
    

c=day%7;
switch(c)
{
case 0:
cal[0][6]=1;
dd=6;
break;
case 6:cal[0][0]=1;
dd=0;
break;
case 5:cal[0][1]=1;
dd=1;
break;
case 4:cal[0][2]=1;
dd=2;
break;
case 3:cal[0][3]=1;
dd=3;
break;
case 2:cal[0][4]=1;
dd=4;
break;
case 1:cal[0][5]=1;
dd=5;
break;
    }
    f=2;
t=mon[mm];
for(i=0;i<dd;i++)
{
cal[0][i]=0;
    }
for(i=0;i<5;i++)
{
if(i==0)
{
z=dd+1;
for(j=z;j<7;j++)
{
if(f<=t)
{
cal[i][j]=f;
f++;
    }
    else
    {
        cal[i][j]=0;
    }
    }
}
else
{
z=0;
for(j=z;j<7;j++)
{
if(f<=t)
{
cal[i][j]=f;
f++;
    }
    else
    {
        cal[i][j]=0;
    }
    }
}
}
System.out.println("M  T  W  Th F Sa Su");
for(i=0;i<5;i++) 
{
for(j=0;j<7;j++)
{
if(cal[i][j]==0)
{
System.out.print("   ");

    }
else if(cal[i][j]>0&&cal[i][j]<10)
{
System.out.print(cal[i][j]+"  ");
    }
    else
    {
        System.out.print(cal[i][j]+" ");
    }
        
}
System.out.println();
}

while(f<=t)
{
System.out.print(f+" ");
f++;
}
    }
    }
}
    