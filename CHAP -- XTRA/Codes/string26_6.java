import java.io.*;
class string26_6
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s,k="";
int i,l,c=0,j;
System.out.println("Enter the string");
s=br.readLine();
s=s+" ";
l=s.length();
System.out.println("Each extracted word and the number of consonants in each extracted words from the sentence are as follows");
for(i=0;i<l;i++)
{
if(s.charAt(i)!=' ')
{
k=k+s.charAt(i);
}
else
{
c=0;
for(j=0;j<k.length();j++)
{
if((k.charAt(j)=='B')||(k.charAt(j)=='b')||(k.charAt(j)=='C')||(k.charAt(j)=='c')||(k.charAt(j)=='D')||(k.charAt(j)=='d')||(k.charAt(j)=='F')||(k.charAt(j)=='f')||(k.charAt(j)=='G')||(k.charAt(j)=='g')||(k.charAt(j)=='H')||(k.charAt(j)=='h')||(k.charAt(j)=='J')||(k.charAt(j)=='j')||(k.charAt(j)=='K')||(k.charAt(j)=='k')||(k.charAt(j)=='L')||(k.charAt(j)=='l')||(k.charAt(j)=='M')||(k.charAt(j)=='m')||(k.charAt(j)=='N')||(k.charAt(j)=='n')||(k.charAt(j)=='P')||(k.charAt(j)=='p')||(k.charAt(j)=='Q')||(k.charAt(j)=='q')||(k.charAt(j)=='R')||(k.charAt(j)=='r')||(k.charAt(j)=='S')||(k.charAt(j)=='s')||(k.charAt(j)=='T')||(k.charAt(j)=='t')||(k.charAt(j)=='V')||(k.charAt(j)=='v')||(k.charAt(j)=='W')||(k.charAt(j)=='w')||(k.charAt(j)=='X')||(k.charAt(j)=='x')||(k.charAt(j)=='Y')||(k.charAt(j)=='y')||(k.charAt(j)=='Z')||(k.charAt(j)=='z'))
{
c++;
}
}
System.out.println(k+"  "+c);
k="";
    }
}
    }
}