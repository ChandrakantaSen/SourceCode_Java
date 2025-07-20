import java.io.*;
class year
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int dm=0,n,nod,styr,p=0;
   System.out.println("Enter the digit\n");
   n=Integer.parseInt(br.readLine());
   styr=n%10000;
   nod=n/10000;

   if(styr%4==0&&styr%100!=0||styr%400==0)
   p=1;

   if(nod>(365+p))
   {
   while(nod>0)
   {
   if(nod<=365)
   break;
   nod=nod-365;
   styr++;
   if(styr%4==0&&styr%100!=0||styr%400==0)
   nod++;
   }
   }

   if(nod<=31)
   dm=1;
   else if(nod>31&&nod<=(59+p))
   dm=2;
   else if(nod>(59+p)&&nod<=(90+p))
   dm=3;
   else if(nod>(90+p)+p&&nod<=(120+p))
   dm=4;
   else if(nod>(120+p)&&nod<=(151+p))
   dm=5;
   else if(nod>(151+p)&&nod<=(181+p))
   dm=6;
   else if(nod>(181+p)&&nod<=(212+p))
   dm=7;
   else if(nod>(212+p)&&nod<=(243+p))
   dm=8;
   else if(nod>(243+p)&&nod<=(273+p))
   dm=9;
   else if(nod>(273+p)&&nod<=(304+p))
   dm=10;
   else if(nod>(304+p)&&nod<=(334+p))
   dm=11;
   else if(nod>(334+p)&&nod<=(365+p))
   dm=12;
   switch(dm)
   {
	   case 1:
	   System.out.println(nod+" january "+styr);
	   break;
	   case 2:
	   System.out.println(nod-31+" february "+styr);
	   break;
	   case 3:
	   System.out.println(nod-59-p+" march  "+styr);
	   break;
	   case 4:
	   System.out.println(nod-90-p+" april "+styr);
	   break;
	   case 5:
	   System.out.println(nod-120-p+" may "+styr);
	   break;
	   case 6:
	   System.out.println(nod-151-p+" june "+styr);
	   break;
	   case 7:
	   System.out.println(nod-181-p+" july "+styr);
	   break;
	   case 8:
	   System.out.println(nod-212-p+" august "+styr);
	   break;
	   case 9:
	   System.out.println(nod-243-p+" september "+styr);
	   break;
	   case 10:
	   System.out.println(nod-273-p+" october "+styr);
	   break;
 	   case 11:
	   System.out.println(nod-304-p+" november "+styr);
	   break;
	   case 12:
	   System.out.println(nod-334-p+" december "+styr);
	   break;
	   default:
	   break;
	}



}
    }