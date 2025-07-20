import java.io.*;
class subject
{
public static void main(String args[])throws IOException
{
int mt,ph,ch,co,eng,tot;
double avg;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the marks of maths");
mt=Integer.parseInt(br.readLine());
System.out.println("Enter the marks of physics");
ph=Integer.parseInt(br.readLine());
System.out.println("Enter the marks of chemistry");
ch=Integer.parseInt(br.readLine());
System.out.println("Enter the marks of commerce");
co=Integer.parseInt(br.readLine());
System.out.println("Enter the marks of english");
eng=Integer.parseInt(br.readLine());
tot=mt+ph+ch+co+eng;
System.out.println("total is"+tot);
avg=tot/5;
System.out.println("average is"+avg);
if(avg>=90)
{
System.out.println("Grade is A");
    }
    else if((avg>=80)&&(avg<90))
    {
        System.out.println("Grade is B");
    }
    else if((avg>=70)&&(avg<80))
{
    System.out.println("Grade is C");
}
else if((avg>=60)&&(avg<70))
    {
        System.out.println("Grade is D");
    }
else if((avg>=50)&&(avg<60))
    {
        System.out.println("Grade is E");
    }
else if((avg>=40)&&(avg<50))
    {
        System.out.println("Grade is G");
    }
else if(avg<40)
    {
        System.out.println("Fail");               
    }
}
    }