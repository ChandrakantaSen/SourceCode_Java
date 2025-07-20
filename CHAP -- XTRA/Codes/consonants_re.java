import java.util.*;
class consonants_re
{
int sp=0,word=0,vow=0,dig=0,con=0;
void count(String s, int i)
{
if(i<s.length())
{
char ch=s.charAt(i);
if(ch == ' ')
sp++;
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
ch=='A'||ch=='E'
||ch=='I'||ch=='O'||ch=='U')
vow++;
if(ch>='0' && ch<='9')
dig++;
count(s,i+1);
}
else
{
word=sp+1;
con=s.length()-(sp+vow+dig);
System.out.println("No. of consonants = "+con);
}
}
void display()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter any sentence : ");
String s=sc.nextLine();
count(s,0);
}
}