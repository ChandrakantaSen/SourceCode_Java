class diamond
{
public static void main()
{
int i=5,j=0;
while(i<=5)
{
for(int l=1;l<i;l++)
{
System.out.print("");
for(int m=5;m>=i;m--)
System.out.print(i+"");
if(i==1)
j=1;
if(j==0)
i--;
}
System.out.println();
}
}
}