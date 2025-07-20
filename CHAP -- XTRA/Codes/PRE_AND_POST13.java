import java.io.*;
class PRE_AND_POST13
{
public static void main(String args[])
{

int i,j,k,l;
i=3;
j=8;
k=11;
l=i++-(--k)-(j--);

System.out.println(j);
}
}