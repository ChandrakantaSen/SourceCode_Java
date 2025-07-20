import java.io.*;
class sudoku_check//to check if 4*4 matrix is sudoku correct
{
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,j,k=0,l,krow=0,kcolumn=0,kbloc=0,flag=0;
int a[][]=new int[4][4];
int ch[]=new int[4];
for(i=1;i<=4;i++)
ch[i-1]=i;
System.out.println("Enter the values in the matrix : - ");
for(i=0;i<4;i++)
{
for(j=0;j<4;j++)
{
a[i][j]=Integer.parseInt(br.readLine());
    }
}
System.out.println("The values in the matrix are as follows : - ");
for(i=0;i<4;i++)
{
for(j=0;j<4;j++)
{
System.out.print(a[i][j]+" ");
    }
System.out.println();    
}
for(i=0;i<4;i++)
{krow=1;
for(k=0;k<4;k++)
{
for(j=0;j<4;j++)
{
if(a[i][j]==krow)
{
krow++;
break;
    }
}}
if((krow-1)!=4)
flag=1;
    }
    
    
for(i=0;i<4;i++)
{kcolumn=1;
for(k=0;k<4;k++)
{
for(j=0;j<4;j++)
{
if(a[j][i]==kcolumn)
{
kcolumn++;
break;
    }
}}
if((kcolumn-1)!=4)
flag=1;
    }
kbloc=1;   
for(k=0;k<4;k++)
{
z:
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{if(a[j][i]==kbloc)
{
kbloc++;
break z;
    }
}
    }
}if((kbloc-1)!=4)
flag=1;

kbloc=1;   
for(k=0;k<4;k++)
{z:
for(i=0;i<2;i++)
{
for(j=2;j<4;j++)
{if(a[j][i]==kbloc)
{
kbloc++;
break z;
    }
}
    }
}if((kbloc-1)!=4)
flag=1;

kbloc=1;   
for(k=0;k<4;k++)
{z:
for(i=2;i<4;i++)
{
for(j=0;j<2;j++)
{if(a[j][i]==kbloc)
{
kbloc++;
break z;
    }
}
    }
}if((kbloc-1)!=4)
flag=1;

kbloc=1;   
for(k=0;k<4;k++)
{z:
for(i=2;i<4;i++)
{
for(j=2;j<4;j++)
{if(a[j][i]==kbloc)
{
kbloc++;
break z;
    }
}
    }
}if((kbloc-1)!=4)
flag=1;

    if(flag==0)
    System.out.println("The matrix is sudoku correct");
    else
    System.out.println("The matrix is not sudoku correct");
}
    }