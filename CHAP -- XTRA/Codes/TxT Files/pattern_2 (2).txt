class pattern_2
{
public static void main()
{
int i=1,j=0;
while(i>0)
{
for(int k=5;k>i;k--)
System.out.print(" ");
for(int m=1;m<=i;m++)
System.out.print(i+" ");
if(i==5)
j=1;
if(j==0)
i++;
else
i--;
System.out.println();
}
}
}

