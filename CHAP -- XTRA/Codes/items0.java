import java.io.*;
class items0
{
public static void main(String args[])throws IOException
{
int c,q,ch;
double r,s=0;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("enter the item code");
c=Integer.parseInt(br.readLine());
System.out.println("enter the quantity");
q=Integer.parseInt(br.readLine());
System.out.println("enter the rate of the item");
r=Double.parseDouble(br.readLine());
s=s+(q*r);
System.out.println("enter whether you want to purchase more items or not");
ch= Integer.parseInt(br.readLine());
if	(ch==1)
{
System.out.println("enter the item code");
c=Integer.parseInt(br.readLine());
System.out.println("enter the quantity");
q=Integer.parseInt(br.readLine());
System.out.println("enter the rate of the item");
r=Double.parseDouble(br.readLine());
s=s+(q*r);
    
       System.out.println("The bill amount is : - "+s);
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
}
System.out.println("thank you");
    }
}