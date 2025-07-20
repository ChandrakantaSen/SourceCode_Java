/*to print pattern
aaaaaaaaaa
aaaa  aaaa
aaa    aaa
aa      aa
a        a
a a a a a 
 a     a
  a   a
   a a
    a
    */
import java.io.*;
class ex1abd_combo
{
public static void main(String args[])
{
for(int i=5;i>=1;i--)
{
for(int j=1;j<=i;j++)
System.out.print("a");
for(int j=(5-i)*2;j>=1;j--)
System.out.print(" ");
for(int j=1;j<=i;j++)
System.out.print("a");
System.out.println();
    }
    int z=5;
for(int i=5;i>=1;i--)
System.out.print("a ");
System.out.println();
for(int i=4;i>=1;i--)
{
for(int j=1;j<=5-i;j++)
{
System.out.print(" ");
    }
System.out.print("a");
if(i!=1)
{
for(int k=1;k<=z;k++)
System.out.print(" ");
System.out.print("a");
    }z=z-2;
System.out.println();
    }
}
    }