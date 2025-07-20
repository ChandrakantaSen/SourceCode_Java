import java.io.*;
class Prg2
{
public static void main(String args[])throws IOException
{
String s;
int i,l,c=0;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter any text : - ");
s=br.readLine();
l=s.length();
for(i=0;i<l;i++)
{
if((s.charAt(i)=='B')||(s.charAt(i)=='b')||(s.charAt(i)=='C')||(s.charAt(i)=='c')||(s.charAt(i)=='D')||(s.charAt(i)=='d')||(s.charAt(i)=='F')||(s.charAt(i)=='f')||(s.charAt(i)=='G')||(s.charAt(i)=='g')||(s.charAt(i)=='H')||(s.charAt(i)=='h')||(s.charAt(i)=='J')||(s.charAt(i)=='j')||(s.charAt(i)=='K')||(s.charAt(i)=='k')||(s.charAt(i)=='L')||(s.charAt(i)=='l')||(s.charAt(i)=='M')||(s.charAt(i)=='m')||(s.charAt(i)=='N')||(s.charAt(i)=='n')||(s.charAt(i)=='P')||(s.charAt(i)=='p')||(s.charAt(i)=='Q')||(s.charAt(i)=='q')||(s.charAt(i)=='R')||(s.charAt(i)=='r')||(s.charAt(i)=='S')||(s.charAt(i)=='s')||(s.charAt(i)=='T')||(s.charAt(i)=='t')||(s.charAt(i)=='V')||(s.charAt(i)=='v')||((s.charAt(i)=='W')||(s.charAt(i)=='w')||(s.charAt(i)=='X')||(s.charAt(i)=='x')||(s.charAt(i)=='Y')||(s.charAt(i)=='y')||(s.charAt(i)=='Z')||(s.charAt(i)=='z')))
{
c++;
    }
    }
System.out.println("Number of alphabet excluding vowels are : - "+c);
    }
}
