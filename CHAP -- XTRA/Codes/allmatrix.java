import java.io.*;
class allmatrix
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,i,j,ch,k;
System.out.println("Enter the size of the matrix : - ");
n=Integer.parseInt(br.readLine());
int a[][]=new int[n][n];
System.out.println("Enter the values in the matrix : - ");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=Integer.parseInt(br.readLine());
    }
}
System.out.println("The values in the matrix are as follows : - ");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]);
    }
System.out.println();
}
System.out.println("1 for sum of elements of d.d.a");
System.out.println("2 for transpose matrix");
System.out.println("3 for ldiag");
System.out.println("4 for ldiag transpose");
System.out.println("5 for rdiag");
System.out.println("6 for rdiag transpose");
System.out.println("7 for multiplication of two arrays");
System.out.println("8 for pattern1");
System.out.println("9 for pattern2");
System.out.println("10 for pattern3");
System.out.println("Enter your choice : - ");
ch=Integer.parseInt(br.readLine());
switch(ch)
{
case 1:
int s=0;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
s=s+a[i][j];
    }
}
System.out.println("The sum of the matrix is : - "+s);
break;
case 2:
System.out.println("The transpose of the matrix is as follows: - ");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[j][i]);
    }
System.out.println();
}break;
case 3:
System.out.println("The left diagonal in the matrix are as follows : - ");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(i==j)
System.out.print(a[i][j]);
else
System.out.print(" ");
}
System.out.println();
    }break;
case 4:
System.out.println("The left diagonal trans in the matrix are as follows : - ");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(i==j)
System.out.print(a[j][i]);
else
System.out.print(" ");
}
System.out.println();
    }break;
case 5:
k=n-1;
System.out.println("The right diagonal in the matrix are as follows : - ");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(j==k)
System.out.print(a[i][j]);
else
System.out.print(" ");
}k--;
System.out.println();
    }break;
case 6:
k=n-1;
System.out.println("The right diagonal transpose in the matrix are as follows : - ");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(j==k)
System.out.print(a[j][i]);
else
System.out.print(" ");
}k--;
System.out.println();
    }break;
case 7:
int b[][]=new int[n][n];
int c[][]=new int[n][n];
System.out.println("Enter the values in the second matrix : - ");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
b[i][j]=Integer.parseInt(br.readLine());
    }
}
System.out.println("The values in the second matrix are as follows : - ");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(b[i][j]+" ");
    }
System.out.println();
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
for(k=0;k<n;k++)
{
c[i][j]=c[i][j]+a[i][k]*b[k][j];
    }
    }
}
System.out.println("The values in the third matrix after matrix multiplcation are as follows : - ");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(c[i][j]+" ");
    }
System.out.println();
}
break;
case 8:
System.out.println("The triangle of the matrix are as follows : - ");
for(i=0;i<n;i++)
{
for(j=0;j<=i;j++)
{
System.out.print(a[j][i]);
    }
System.out.println();    
}break;
case 9:
for(i=0;i<n;i++)
{
for(j=0;j<=i;j++)
{
System.out.print(a[i][j]);
    }
System.out.println();    
}break;
case 10:
System.out.println("The triangle of the matrix are as follows : - ");
for(i=0;i<n;i++)
{
for(j=i;j>=0;j--)
{
System.out.print(a[i][j]);
    }
System.out.println();
}break;
case 11:
System.out.println("The triangle of the matrix are as follows : - ");
for(i=0;i<n;i++)
{
for(j=i;j>=0;j--)
{
System.out.print(a[j][i]);
    }
System.out.println();    
}break;
case 12:
System.out.println("The triangle of the matrix are as follows : - ");
for(i=0;i<n;i++)
{
for(j=i;j<n;j++)
{
System.out.print(a[i][j]);
    }
System.out.println();    
}
break;
case 13:
System.out.println("The triangle of the matrix are as follows : - ");
for(i=0;i<n;i++)
{
for(j=i;j<n;j++)
{
System.out.print(a[j][i]);
    }
System.out.println();    
}
break;
case 14:
System.out.println("The triangle of the matrix are as follows : - ");
for(i=n-1;i>=0;i--)
{
for(j=0;j<=i;j++)
{
System.out.print(a[i][j]);
    }
System.out.println();
}break;
case 15:
System.out.println("The triangle of the matrix are as follows : - ");
for(i=n-1;i>=0;i--)
{
for(j=0;j<=i;j++)
{
System.out.print(a[j][i]);
    }
System.out.println();    
}break;
case 16:
System.out.println("The triangle of the matrix are as follows : - ");
for(i=n-1;i>=0;i--)
{
for(j=i;j>=0;j--)
{
System.out.print(a[i][j]);
    }
System.out.println();    
}
break;
case 17:
System.out.println("The triangle of the matrix are as follows : - ");
for(i=n-1;i>=0;i--)
{
for(j=i;j>=0;j--)
{
System.out.print(a[j][i]);
    }
System.out.println();    
}
break;
case 18:
System.out.println("The triangle of the matrix are as follows : - ");
for(i=n-1;i>=0;i--)
{
for(j=i;j<n;j++)
{
System.out.print(a[i][j]);
    }
System.out.println();    
}
break;
case 19:
System.out.println("The triangle of the matrix are as follows : - ");
for(i=n-1;i>=0;i--)
{
for(j=i;j<n;j++)
{
System.out.print(a[j][i]);
    }
System.out.println();    
}
break;
case 20:
System.out.println("The triangle of the matrix are as follows : - ");
for(i=n-1;i>=0;i--)
{
for(j=n-1;j>=i;j--)
{
System.out.print(a[i][j]);
    }
System.out.println();    
}
break;
case 21:
System.out.println("The triangle of the matrix are as follows : - ");
for(i=n-1;i>=0;i--)
{
for(j=n-1;j>=i;j--)
{
System.out.print(a[j][i]);
    }
System.out.println();    
}
break;
case 22:
System.out.println("The pattern matrix are as follows : - ");
for(i=0;i<n;i++)
{
for(j=0;j<n-1-i;j++)
System.out.print(" ");
for(j=n-1-i;j<n;j++)
System.out.print(a[i][j]);
for(j=0;j<=i;j++)
System.out.print(a[i][j]);
System.out.println();    
}
break;
    }
}
    }