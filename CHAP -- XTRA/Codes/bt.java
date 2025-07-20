import java.io.*;
class bt
{
void main(int n)
{
double s=0,s1,s2;
int i,j;
for(i=1;i<n;i++)
{
s1=0;
s2=1;
for(j=1;j<=i+1;j++)
{
s1=s1+j;
}
for(j=1;j<=i+1;j++)
{
s2=s2*j;
}
s=s+(s1/s2);
}
System.out.println(s);
}
}

