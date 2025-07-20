// a company  keeps a linear array year(k) that contains the number of employees born in year k. to print each of the year in which no employee is born. To find and print the number of years in which no employee is born. To find the no. of employees who will be atleast 60 yrs old at the end of the year 2004.


import java.io.*;
class prg3
{
public static void main(String args[])throws IOException
{
int year[]=new int[10000];
System.out.println("please enter the minimum year in which an employee can be born of");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int num=Integer.parseInt(br.readLine());
System.out.println("please enter the maximum year in which an employee can be born of:");
int num1=Integer.parseInt(br.readLine());
for(int k=num;k<=num1;k++)
{
System.out.println("please enter the number of employees born in year"+k);
year[k]=Integer.parseInt(br.readLine());
    }
    int c=0,d=0;
    int yr=2006-60;
    int s=0;
    System.out.println("the years in which no employee is born here");
    for(int k=num;k<=num1;k++)
    {
        if((year[k])==0)
        {
            c++;
            System.out.println(year[k]);
        }
        if(k<=yr)
        s=s+year[k];
        {
            System.out.println("the number of years in which no employees is born"+c);
            System.out.println("the number of employees who will be atleast 60 years old in year 2006 are"+s);
        }
    }
    }
}