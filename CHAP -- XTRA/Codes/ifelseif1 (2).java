import java.io.*;
class ifelseif1
{
public static void main(String args[])throws IOException
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
int math,phy,chem,comp,bio;
System.out.println("Enter the maths marks:");
math=Integer.parseInt(buf.readLine());
System.out.println("Enter the chemistry marks:");
chem=Integer.parseInt(buf.readLine());
System.out.println("Enter the physics marks:");
phy=Integer.parseInt(buf.readLine());
System.out.println("Enter the computer marks:");
comp=Integer.parseInt(buf.readLine());
System.out.println("Enter the biology marks:");
bio=Integer.parseInt(buf.readLine());
int tot=math+phy+chem+bio+comp;
double avg=tot/5;
if(avg>=90)
{
System.out.println("A");
}
else if((avg>=80)&&(avg<90))
{
System.out.println("B");
}
else if((avg>=70)&&(avg<80))
{
System.out.println("C");
}
else if((avg>=60)&&(avg<70))
{
System.out.println("D");
}
else if((avg>=50)&&(avg<60))
{
System.out.println("E");
}
else if((avg>=40)&&(avg<50))
{
System.out.println("G");
}
else 
{
System.out.println("F");
}
}
}