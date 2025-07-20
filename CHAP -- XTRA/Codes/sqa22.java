class sqa22
{
public static void main(String agrs[])
{
int i,j,k;

for (i=1;i<=5;i++)
{
for (j=5;j>=0;j--)
{
System.out.print(" ");
}
for (k=i;k>0;k--)
{
System.out.print("*");
}
System.out.print("\n");
}
for (i=5;i>=1;i--)
{
for (j=0;j<5;j++)
{
System.out.print("");

for (k=i;k>1;k--)
{
System.out.print("*");
}
System.out.print("\n");
}
}
}
}

