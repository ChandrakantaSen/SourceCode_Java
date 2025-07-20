import java.io.*;
class date5
{
static int leap_year(int y3,int y4)
{
int dif=0,count=0;
dif=(y4-1)-(y3+1);
while(dif>0)
{
if(y3%4==0 || (y3%100==0 && y3%400==0))
count++;
y3++;
dif--;
    }
    return count ;
}


static int calc(int y1,int y2)
    {
        int w=0,diff=0,p=0,nonleapdiff2=0,days=0;
        w=y1+1;
        diff=(y2-1)-w;
        p=leap_year(y1,y2);
        nonleapdiff2=diff-p;
        days=(p*366)+(nonleapdiff2*365);
       //System.out.println(diff);
       //System.out.println(p);
       //System.out.println(nonleapdiff2);
       //System.out.println((p*366)+" " +(nonleapdiff2*365));
    //System.out.println(days);
    return days;
}
    
    
     static int month_current(int m2,int d2,int y5)
     {int sum=0,s=0,total=0,g=0;
         int arr[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
         if(y5%4==0 || (y5%100==0 && y5%400==0))
     arr[2]=29;
            for(int i=0;i<(m2);i++)
             {
                 sum=arr[i]+sum;
                  }
                  sum=sum+d2;
                  return sum;
                }
                
                
         static int month(int m3,int d3,int y6)
         {
         int s=0,total=0,g=0;
         int arr2[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
           if(y6%4==0 || (y6%100==0 && y6%400==0))
     arr2[1]=29;
                for(int j=m3;j<12;j++)
                {
                    s=arr2[j]+s;
                }
                g=arr2[m3-1]-d3;
                s=s+g;
                  return s;
                }
                 
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
    int dd,d,m,y,mm,yy,ans=0,ans2=0,ans3=0,ans4;
    System.out.println("enter a date (dd)");
    dd=Integer.parseInt(br.readLine());
    System.out.println("enter a month (mm)");
    mm=Integer.parseInt(br.readLine());
    System.out.println("enter a year (yy)");
    yy=Integer.parseInt(br.readLine());
System.out.println("enter the current date (dd)");
    d=Integer.parseInt(br.readLine());
    System.out.println("enter the current month (mm)");
    m=Integer.parseInt(br.readLine());
    System.out.println("enter the current year (yy)");
    y=Integer.parseInt(br.readLine());
      ans=calc(yy,y);
ans2=month(mm,dd,yy);
ans3=month_current(m,d,y);
ans4=ans+ans2+ans3;
System.out.println(ans4);
    }
}

 