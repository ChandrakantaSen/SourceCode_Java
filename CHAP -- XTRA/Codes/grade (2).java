import java.io.*; 
class grade
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s;
int rn,eng,secon,sci,comp,his,geo;
int gt=0;
double per;
System.out.println("enter your name");
s=br.readLine();
System.out.println("enter your roll");
rn=Integer.parseInt(br.readLine());
System.out.println("enter your marks in english");
eng=Integer.parseInt(br.readLine());
System.out.println("enter your marks in second language");
secon=Integer.parseInt(br.readLine());
System.out.println("enter your marks in scince");
sci=Integer.parseInt(br.readLine());
System.out.println("enter your marks in computer");
comp=Integer.parseInt(br.readLine());
System.out.println("enter your marks in history");
his=Integer.parseInt(br.readLine());
System.out.println("enter your marks in geography");
geo=Integer.parseInt(br.readLine());
gt=(eng+secon+sci+comp+his+geo);
per=gt/6;
System.out.println("your percentage is"+per);
if(per>90)
{
System.out.println("Grade=A+");
    }
    else if((per>=80)&&(per<90))
{
System.out.println("Grade=A");
    }
    else if((per>=70)&&(per<80))
{
System.out.println("Grade=B+");
    }
    else if((per>=60)&&(per<70))
{
System.out.println("Grade=B");
    }
else if((per>=50)&&(per<60))
{
System.out.println("Grade=C");
    }
    else if((per>=40)&&(per<50))
{
System.out.println("Grade=passed");
    }
    else
    {
        System.out.println("Grade=failed");
    }
}
    }
