class KaprekarCheker
{
public static void main(int a)
{
int digits=0,square=0,firstd=0,secondd=0;
int modder=1;
final double original=a;
square=a*a;
String len="";
len=len+a;
int leng=len.length();
while(leng>0){
modder*=10;
leng-=1;}
firstd=square%modder;
secondd=square/modder;
if((firstd+secondd)==original){
System.out.print("Kapekar");
}
else
System.out.print("Not Kaprekar");
}
}