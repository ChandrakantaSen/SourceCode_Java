import java.io.*;
class date
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
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
int d,m,y,i,day;
day=0;
int mon[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
System.out.println("Enter day : ");
d=Integer.parseInt(buf.readLine());
System.out.println("Enter month : ");
m=Integer.parseInt(buf.readLine());
System.out.println("Enter year : ");
y=Integer.parseInt(buf.readLine());
for(i=0;i<m;i++)
{
day=day+mon[i];
}
day=day+d+leap[y];
System.out.println(day);
    }
}
