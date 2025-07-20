import java.io.*;
class tt2
{
public static void main(String args[])
 {
int i=0,sev=0,sod=0;
while(i<=50)
{
if(i%2==0)
{
sev=sev+i;
}
else
{
sod=sod+i;
}
i++;
}
System.out.println("sum of even num is"+sev);
System.out.println("sum of odd num is "+sod);
}
}
