import java.io.*;
class sudoku_4_4
{static int i,j,k=0,l,m,flag=0,rsum=0,csum=0,bsum=0;
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a[][]=new int[4][4];
System.out.println("Enter the values in the matrix : - ");
for(i=0;i<4;i++)
{
for(j=0;j<4;j++)
{
a[i][j]=Integer.parseInt(br.readLine());
    }
}
System.out.println("The values in the matrix are as follows : - ");
for(i=0;i<4;i++)//printing original
{
for(j=0;j<4;j++)
{
System.out.print(a[i][j]+" ");
    }
    System.out.println();    
}int x=0;
while((check(a)==false)&&(x<5))
{
row(a);
clm(a);
blc(a);
x++;
    }
System.out.println("the solved sudoku is: - ");
for(i=0;i<4;i++)
{
for(j=0;j<4;j++)
{
System.out.print(a[i][j]+" ");
    }
    System.out.println();
}
    }
public static void row(int a[][])
{flag=0;rsum=0;csum=0;bsum=0;
for(i=0;i<4;i++)//solving rows
{
for(j=0;j<4;j++)
{
if(a[i][j]==0)
{
rsum=0;flag=0;
 for(l=0;l<4;l++)
 {rsum=rsum+a[i][l];
     if(a[i][l]==0)
     {
     flag++;
    }
}
if(flag==1)
{
a[i][j]=10-rsum;
    }
}
    }
}
    }
    public static void clm(int a[][])
    {flag=0;rsum=0;csum=0;bsum=0;
        for(i=0;i<4;i++)//solving columns
{
for(j=0;j<4;j++)
{
if(a[i][j]==0)
{
flag=0;csum=0;
    for(l=0;l<4;l++)
 {csum=csum+a[l][j];
     if(a[l][j]==0)
     {
     flag++;
    }
}
if(flag==1)
{
a[i][j]=10-csum;
    }
}
    }
}
    }
    public static void blc(int a[][])
    {flag=0;rsum=0;csum=0;bsum=0;
        for(i=0;i<4;i++)
{
for(j=0;j<4;j++)
{
if(a[i][j]==0)//block 1
{
flag=0;bsum=0;
if(i<2&&j<2)
{
    for(l=0;l<2;l++)
 {
     for(m=0;m<2;m++)
 {
     bsum=bsum+a[l][m];
     if(a[l][m]==0)
     {
     flag++;
    }
}}
if(flag==1)
{
a[i][j]=10-bsum;
    }
}
    else if((i<2)&&(j<4))//block 2
    {bsum=0;flag=0;
        for(l=0;l<2;l++)
 {
     for(m=2;m<4;m++)
 {
     bsum=bsum+a[l][m];
     if(a[l][m]==0)
     {
     flag++;
    }
}}
if(flag==1)
{
a[i][j]=10-bsum;
    }
}
    else if(i<4&&j<2)//block 3
    {bsum=0;flag=0;
        for(l=2;l<4;l++)
 {
     for(m=0;m<2;m++)
 {
     bsum=bsum+a[l][m];
     if(a[l][m]==0)
     {
     flag++;
    }
}}
if(flag==1)
{
a[i][j]=10-bsum;
    }
}
    else if(i<4&&j<4)//block 4
    {bsum=0;flag=0;
        for(l=2;l<4;l++)
 {
     for(m=2;m<4;m++)
 {
     bsum=bsum+a[l][m];
     if(a[l][m]==0)
     {
     flag++;
    }
}}
if(flag==1)
{
a[i][j]=10-bsum;
    }
}
    }
}
    }
}

public static boolean check(int a[][])
    {flag=0;rsum=0;csum=0;bsum=0;
        for(i=0;i<4;i++)
{rsum=1;
for(k=0;k<4;k++)
{
for(j=0;j<4;j++)
{
if(a[i][j]==rsum)
{
rsum++;
break;
    }
}}
if((rsum-1)!=4)
flag=1;
    }
    
    
for(i=0;i<4;i++)
{csum=1;
for(k=0;k<4;k++)
{
for(j=0;j<4;j++)
{
if(a[j][i]==csum)
{
csum++;
break;
    }
}}
if((csum-1)!=4)
flag=1;
    }
bsum=1;   
for(k=0;k<4;k++)
{
z:
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{if(a[j][i]==bsum)
{
bsum++;
break z;
    }
}
    }
}if((bsum-1)!=4)
flag=1;

bsum=1;   
for(k=0;k<4;k++)
{z:
for(i=0;i<2;i++)
{
for(j=2;j<4;j++)
{if(a[j][i]==bsum)
{
bsum++;
break z;
    }
}
    }
}if((bsum-1)!=4)
flag=1;

bsum=1;   
for(k=0;k<4;k++)
{z:
for(i=2;i<4;i++)
{
for(j=0;j<2;j++)
{if(a[j][i]==bsum)
{
bsum++;
break z;
    }
}
    }
}if((bsum-1)!=4)
flag=1;

bsum=1;   
for(k=0;k<4;k++)
{z:
for(i=2;i<4;i++)
{
for(j=2;j<4;j++)
{if(a[j][i]==bsum)
{
bsum++;
break z;
    }
}
    }
}if((bsum-1)!=4)
flag=1;

    if(flag==0)
    return true;
    else
    return false;
}
    }