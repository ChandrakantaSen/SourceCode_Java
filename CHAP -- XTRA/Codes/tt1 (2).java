import java.io.*;
class tt1
{
public static void main(String args[])
{
int i=0,sev=0,sod=0;
do
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
while(i<=10);
System.out.println("sum of even number is"+sev);
System.out.println("sum of odd number is"+sod);

}
}
