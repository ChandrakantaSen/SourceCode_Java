import java.io.*;
class time
{
void accept()throws IOException 
{
BufferedReader br=new BufferdeReader(new InputStreamReader(System.in));
int hour1=Integer.parseInt(br.readLine());
int min1=Integer.parseInt(br.readLine());
int sec1=Integer.parseInt(br.readLine());
System.out.println("Entered Time is"+ hour1+" "+min1+" "+sec1);
}
void display()
{
System.out.println("Time is"+ hour+" "+min+" "+sec);
}

int interval(time t1,time t2)
{

int ts1=t1.hour1*3600+t1.min1*60+t1.sec1;
int ts2=t2.hour2*3600+t2.min2*60+t2.sec2;
int s=ts1-ts2;
int h=(ts1-ts2)/3600;
int m=(ts1-ts2)/60;
System.out.print("Interval Time in hour"+ h);
System.out.print("Interval Time in min"+ m);
System.out.print("Interval Time in sec"+ s);

}
int sum()
{
int ts1=t1.hour1*3600+t1.min1*60+t1.sec1;
int ts2=t2.hour2*3600+t2.min2*60+t2.sec2;
int s1=ts1+ts2;
int h1=(ts1+ts2)/3600;
int m1=(ts1+ts2)/60;
System.out.print("Interval Time in hour"+ h1);
System.out.print("Interval Time in min"+ m1);
System.out.print("Interval Time in sec"+ s1);

}
public static void main(String args[])

{
public static void main ()throwsIOExceptions
{
double n,i,count=0;
Buffered Reader Br=new BufferedReader(newInputStreamReader(System.in));
System.out.println("enter range n");
n=Double.parse.Duoble(br.readline());
System.out.println("enter range i");
{
System.out.println("no's are prime");
}
else
{
System.out.println("no's are not prime");
}
}
}

{
time ob=new time();
time ob1=new time();
System.out.println(ob.interval());
System.out.println(ob.sum());
}
}
