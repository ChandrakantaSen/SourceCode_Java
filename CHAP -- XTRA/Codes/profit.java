import java.io.*;
class profit
{
public static void main(String args[])throws IOException
{
double cp,sp,p,l,p_percent,l_percent;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the costprice of the article");
cp=Double.parseDouble(br.readLine());
System.out.println("Enter the sellingprice of the article");
sp=Double.parseDouble(br.readLine());
if(sp>cp)
{
p=sp-cp;
p_percent=(p/cp)*100;
System.out.println("The profit percent is"+p_percent);
    }
    else
    {
        l=cp-sp;
        l_percent=(l/cp)*100;
        System.out.println("The loss percent is"+l_percent);
    }
}
    }
       
        
