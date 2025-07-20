class Wave_matrix
{
public static void main(String args[])
{
int a[][]=new int[4][4];
int m=0,n=4,x=0,y=0,z=1;
for(int i=0;i<4;i++)
{
if(m%2==0)
{
for(int j=0;j<i;j++)
{
a[x++][y--]=z++;
}
x=0;
y=i+1;
}
if(m%2==1)
{
for(int j=0;j<i;j++)
{
a[x--][y++]=z++;
}
x=i+1;y=0;
}
}
for(int i=0;i<m;i++)
{
for(int j=0;j<m;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
}
}