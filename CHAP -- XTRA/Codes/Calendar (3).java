import java.io.*;
class Calendar
{
  static int dd,mm,yy;
    static  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  public static int leap(int u)
{
    if(u%100==0 && u%400==0)
    {
    return 1;
}
    else if(u%4==0 && u%100!=0)
    {
    return 1;
}
    else
    {
    return 0;
}
}
public static int decrement(int v)
{
    int wd2=v;
      wd2--;
        if(wd2<0)
        wd2=6;
    wd2++;
    if(wd2>6)
        return 0;
    else
        return wd2;
}
public static void main()throws IOException
{
    int pass=701;
    int mat;
    String Month[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
System.out.println("This a program that generates calender of an entire year");
System.out.println("Enter The Year & then press enter: ");
    yy=Integer.parseInt(br.readLine());
    long t=0;
    int wd=0;
    if(yy<2006)
    {
        for(int m=yy;m<2006;m++)
        {
        if(leap(m)==1)
             t+=366;
        else
             t+=365;
        }
        wd=0;
        for(long i=1;i<=t;i++)
        {
            wd--;
            if(wd<0)
                wd=6;
        }
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
        wd=0;
        for(long i=1;i<=t;i++)
        {
            wd++;
            if(wd>6)
                wd=0;
        }
    }
  System.out.println("Generating calendar");
          for(int p=1;p<5;p++)
        {
System.out.print(".");
          }
      int l=decrement(wd);
    for(int q=0;q<12;q++)
    {	
        if(q==6)
    {
        System.out.println("Enter any value for see the next 6 months");










    }
  System.out.println(Month[q]+" "+yy);

System.out.println("Su\tMo\tTu\tW\tTh\tFr\tSa");
      for(int r=0;r<l;r++)
System.out.print(" \t");
      for(int i1=1;i1<=days[q];i1++)
      {
System.out.print(i1+"\t");;
             l++;
             if(l==7)
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
        l=0;
        }
      System.out.println();
          }
}
    }