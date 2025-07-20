import java.io.*;
class grade
{
public void marks(int a,int b,int c,int d)
{
int gt=a+b+c+d;
double per=gt/4;
System.out.println("Grand total is"+gt);
if (per>=80)
{
System.out.println("you got grade A");
    }
if    ((per<80)&&(per>=60))
{
System.out.println("you got grade B");
    }
  if ((per<60)&&(per>=40))  
  {
 System.out.println("you got grade C");  
}
if (per<40)
{
System.out.println("you got grade D");
    }
}
    }
    