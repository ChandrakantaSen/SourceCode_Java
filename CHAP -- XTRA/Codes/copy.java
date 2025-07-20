class copy
{
public static void main()
{
int i,j,k,l,s;
for(i=1;i<=3;i++)
{
for(j=4;j>=1;j--)
{
for(k=1;k<=2*i-1;k++)
{
if(k%2==0)
{
for(l=1;l<=7;l++)
System.out.print(' ');
continue;
}
for(l=1;l<=7*(3-i);l++)
{
if(k>1)
continue;
System.out.print(' ');
}
for(l=1;l<=4-j;l++)
System.out.print(' ');
for(l=1;l<=2*j-1;l++)
System.out.print('*');
for(l=1;l<=4-j;l++)
System.out.print(' ');
    }
System.out.println();
    }
for(j=2;j<=4;j++)
{
for(k=1;k<=2*i-1;k++)
{
if(k%2==0)
{
for(l=1;l<=7;l++)
System.out.print(' ');
continue;
}
for(l=1;l<=7*(3-i);l++)
{
if(k>1)
continue;
System.out.print(' ');
    }
for(l=1;l<=4-j;l++)
System.out.print(' ');
for(l=1;l<=2*j-1;l++)
System.out.print('*');
for(l=1;l<=4-j;l++)
System.out.print(' ');
    }
System.out.println();
    }
}
for(i=2;i>=1;i--)
{
for(j=4;j>=1;j--)
{
for(k=1;k<=2*i-1;k++)
{
if(k%2==0)
{
for(l=1;l<=7;l++)
System.out.print(' ');
continue;
}
for(l=1;l<=7*(3-i);l++)
{
if(k>1)
continue;
   
    
System.out.print(' ');
    }
for(l=1;l<=4-j;l++)
System.out.print(' ');
for(l=1;l<=2*j-1;l++)
System.out.print('*');
for(l=1;l<=4-j;l++)
System.out.print(' ');
    }
System.out.println();
    }
for(j=2;j<=4;j++)
{
for(k=1;k<=2*i-1;k++)
{
if(k%2==0)
{
for(l=1;l<=7;l++)
System.out.print(' ');
continue;
}
for(l=1;l<=7*(3-i);l++)
{
if(k>1)
continue;
System.out.print(' ');
    }
for(l=1;l<=4-j;l++)
System.out.print(' ');
for(l=1;l<=2*j-1;l++)
System.out.print('*');
for(l=1;l<=4-j;l++)
System.out.print(' ');
    }
System.out.println();
    }    
}
    }
}
