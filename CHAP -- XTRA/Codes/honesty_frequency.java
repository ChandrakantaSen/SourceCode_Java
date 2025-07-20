class honesty_frequency
{
void method()
{
int d=0;char c=' ';
String s="HONESTY IS THE BEST POLICY. BE HONEST AND ENJOY";
String st=s;
int l=s.length();
int e;
char ch=' ';
for(int j=65;j<=90;j++)
{
for(int i=0;i<l;i++)
{
for( j=0;j<l;j++)
{
c=s.charAt(i);
ch=st.charAt(j);
if(c==ch)
d++;
     }
    }     
System.out.print(c+  "  "+ d);
System.out.println();
  d=0;  

}
    }
}

    

