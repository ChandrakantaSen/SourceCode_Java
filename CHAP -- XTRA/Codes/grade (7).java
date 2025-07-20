package All;

import java.io.*;
class grade
{
    void main( )throws IOException
    {
        int m;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the marks");
        m=Integer.parseInt(br.readLine());
        if(m>=80)
        System.out.println("Distinction");
        if((m>=60)&&(m<=80))
        System.out.println("First Division");
        if((m>=45)&&(m<60))
        System.out.println("Second Divsion");
        if((m>=40)&&(m<45))
        System.out.println("Pass");
        if(m<40)
        System.out.println("Fail");
    }
}
        
        