import java.io.*;          
class vi
{
public static void main(String args[])
{
   int i=1,j,k=0,a=1;
    
//                System.out.println("  ");
	while(i>=0)
	{
                for(j=i;j<5;j++)

           System.out.println();  //two blank spaces

                for( a=(i*2)-1;a>0;a--)

              System.out.print("*");  //one blank space after *

                if(i==5)
		k++;
		if(k==0)
	i++;
		else
		i--;
System.out.println();
}
	}

}

