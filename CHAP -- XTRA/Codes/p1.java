import java.io.*;   /*Declaring the input output package*/
class p1            /*Declaring the class*/
{                   /*Opening the class*/
public static void main(String args[])throws IOException    /*Declring the main() function*/
{                   /*Opening the main() function*/
int call;         /*Initializing the variable*/
double rate,t,k;    /*Initializing the variable*/
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));    /*Declaring the BufferedReader of the class*/
System.out.println("Enter the number of calls");    
call=Integer.parseInt(br.readLine());
if(call<=200)
{
rate=100;
    }
    else if((call>200)&&(call<=300))
    {
rate=100+((call-200)*1.80);
    }
    else if((call>300)&&(call<=450))
    {
t=call-200;
k=call-300;
rate=100+(t*1.80)+(k*2.50);
    }
    else
    {
t=call-200;
k=call-300;
rate=100+(t*1.80)+(k*2.50)+((call-450)*3);
    }
System.out.println("The rate is : - "+rate);    
}
    }
    