import java.io.*;
class items
{
public static void main(String args[])throws IOException
{
int c,q;
double r,s=0;
char ch;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("enter the item code");
c=Integer.parseInt(br.readLine());
System.out.println("enter the quantity");
q=Integer.parseInt(br.readLine());
System.out.println("enter the rate of the item");
r=Double.parseDouble(br.readLine());
s=s+(q*r);
System.out.println("enter whether you want to purchase more items or not");
ch=(char)(br.read());
if((ch=='Y')||(ch=='y'))
{
System.out.println("enter the item code");
c=Integer.parseInt(br.readLine());
System.out.println("enter the quantity");
q=Integer.parseInt(br.readLine());
System.out.println("enter the rate of the item");
r=Double.parseDouble(br.readLine());
s=s+(q*r);
    }
    if((s>=100)&&(s<500))
    {
       System.out.println("you have to pay Rs"+s+"& your gift is key ring");
    }
    else if((s>=500)&&(s<1000))
    {
        System.out.println("you have to pay Rs"+s+"& your gift is leather purse");
    } 
else if(s>=1000)
{
System.out.println("you have to pay Rs"+s+"& your gift is pocket calculator");
    }
    
System.out.println("thank you");
    }
}
 


