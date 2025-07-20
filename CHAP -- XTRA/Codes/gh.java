class gh
{
void method()
{
int d=0;char c=' ';
String s="HONESTY IS THE BEST POLICY.BE HONEST AND ENJOY";
String st=s;
int l=s.length();
int e;
char ch=' ';
for(int i=65;i<=90;i++)
{
//for(int i=97;i<=122;i++)
//{
for(int j=0;j<l;j++)
{

ch=s.charAt(j);
if((int)ch==i)
d++;
     }
     
System.out.print(ch+  "  "+ d);
System.out.println();
  d=0;  

}
    }
}

    


