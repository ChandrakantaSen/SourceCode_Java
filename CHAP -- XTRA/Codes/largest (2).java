class largest
{
public static void main(int n)
{
double d=0;
char ch=' ';
if(n>0&&n<=40)
ch='F';
else if((n>40)&&(n<=60))
ch='D';
else if((n>60)&&(n<=70))
ch='C';
else if((n>70)&&(n<=89))
ch='B';
else if((n>89)&&(n<=100))
ch='A';

System.out.println(ch);
    }
}