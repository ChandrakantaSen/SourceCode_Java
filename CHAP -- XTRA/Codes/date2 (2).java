#include<stdio.h>
#include<conio.h>
int leap(int y);
int dee(int ,int);
int td,yy=2006;
int count(int d, int m, int y);
long countdate(int d,int m,int y,int dd,int mm,int yy);
int dee(int td,int y)
{
if(y<yy)
{
if(td%7==0)
{
printf("\nThe day is Sunday");
}
else if(td%7==1)
{
printf("\nThe day is SATURDAY");
}
else if(td%7==2)
{
printf("\nThe day is FRIDAY");
}
else if(td%7==3)
{
printf("\nThe day is THURSDAY");
}
else if(td%7==4)
{
printf("\nThe day is WEDNESDAY");
}
else if(td%7==5)
{
printf("\nThe day is TUESDAY");
}
else
{
printf("\nThe day is MONDAY");
}
}

else if(y>yy)
{
if(td%7==0)
{
printf("\nThe day is Sunday");
}
else if(td%7==1)
{
printf("\nThe day is MONDAY");
}
else if(td%7==2)
{
printf("\nThe day is tues");
}
else if(td%7==3)
{
printf("\nThe day is wed");
}
else if(td%7==4)
{
printf("\nThe day is thurs");
}
else if(td%7==5)
{
printf("\nThe day is fri");
}
else
{
printf("\nThe day is sat");
}
}
}
int leap(int y)
{
if(y%4==0 && y%100!=0)
return 1;
else if(y%400==0)
return 1;
else
return 0;
}
int count(int d, int m, int y)
{
int i,day=0;
int mon[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
for(i=0;i<m;i++)
{
day=day+mon[i];
}
if(m>2)
day=day+leap(y)+d;
else
day=day+d;
return day;
}
long countdate(int d,int m,int y,int dd,int mm,int yy)
{
long i,td=0;
if(y==yy)
{
 td=count(d,m,y)-count(dd,mm,yy);
 if(td<0)
 td=td*-1;
}
else if(y>yy)
{
for(i=yy+1;i<y;i++)
{
td=td+365+leap(i);
}
td=td+(365+leap(yy))+count(d,m,y)-count(dd,mm,yy);
}
else
{
for(i=y+1;i<yy;i++)
td=td+365+leap(i);
td=td+(365+leap(y))+count(dd,mm,yy)-count(d,m,y);
}
return td;
}
void main()
{
 int l, d,m,y,dd=1,mm=1,yy=2006;
 clrscr();
 printf("\nEnter a date:");
 scanf("%d %d %d",&d,&m,&y);
 l=countdate(d,m,y,dd,mm,yy);
 dee(l,y);
 getch();
}




