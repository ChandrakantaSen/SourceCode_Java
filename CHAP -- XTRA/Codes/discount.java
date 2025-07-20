import java.io.*;
class discount
{
public static void main(String args[])throws IOException
{
double p,sp1,sp2;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("enter the price of the article");
p=Double.parseDouble(br.readLine());
sp1=p-(p*0.3);
sp2=(p*(1-0.2)*(1-0.1));
if(sp1<sp2)
{
System.out.println("The offer of shopkeeper1 is preferable");
    }
    else
    {
  System.out.println("the offer of shopkeeper2 is preferable");
}
    }
}