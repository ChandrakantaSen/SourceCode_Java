class sqa23
{
public static void main(String agrs[])
{
int i=1,j,k=0,a=1;

System.out.print("\n\n");

while (i>=0)
{
for (j=i;j<=5;j++)

System.out.print("");
for (a=(i*2)-1;a>0;a--)
System.out.print(" *");
if (i==5)
k++;
if (k==0)
i++;
else
i--;
System.out.print("\n");
}
}
}



