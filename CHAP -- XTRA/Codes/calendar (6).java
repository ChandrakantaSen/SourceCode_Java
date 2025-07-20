import java.io.*;
class calendar
{
    static int dd,mm,yy;
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public static int leap(int u)
    {
        if(u%100==0 || u%4==0)
        {
            return 1;
        }
        else if(u%400==0 && u%100!=0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
   public static void main()throws IOException
    {
String month[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
System.out.println("This is a program that generates calendar of an entire year : - ");
System.out.println("Enter the year and then press enter  ");
yy=Integer.parseInt(br.readLine());
long t=0;
long wd=0;
if(yy<2006)
{
for(int m=yy;m<2006;m++)
{
if(leap(m)==1)
t+=366;
else
t+=365;
}
            wd=t%7;
        }
        else if(yy>=2006)
        {
            for(int m=2006;m<yy;m++)
            {
                if(leap(m)==1)
                t+=366;
                else
                t+=365;
            }
            wd=t%7;
            }
        if(yy<2006)
        {
            if(wd>0)
            wd=7-wd;
        }
        System.out.println("Generating calendar "+wd);
        for(int p=1;p<5;p++)
        {
            System.out.print(".");
        }
        long l=wd;
        for(int q=0;q<12;q++)
        {
            if(q==6)
            {
                System.out.println("Enter any number  ");
                int d=Integer.parseInt(br.readLine());
            }
            System.out.println(month[q]+" "+yy);
            System.out.println("Su\tMo\tTu\tW\tTh\tFr\tSa");
            for(int r=0;r<l;r++)
            {
            System.out.print("\t");
        }
                if(l>=7)
                {
                    System.out.println();
                    l=0;
                }
            for(int i1=1;i1<=days[q];i1++)
            {
             System.out.print(i1+"\t");
                l++;
                if(l>=7)
                {
                    System.out.println();
                    l=0;
                }
            }
            if(leap(yy)==1 && q==1)
            {
                System.out.print("29");
                l++;
                if(l==7)
                {
                    System.out.println();
                l=0;
            }
            }
            System.out.println();
        }
    }
}
                   
                
            
            
    