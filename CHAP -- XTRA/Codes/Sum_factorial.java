package All;

class Sum_factorial 
{ 
    public static void main()
    { 
        int fac=1,sum=0,i,j; 
        for(i=1;i<=5;i++)
        { 
            fac=1; 
            for(j=1;j<=i;j++)
            { 
                fac=fac*j; 
            } 
            sum=sum+fac; 
        } 
        System.out.println("RESULT :- "+sum); 
    } 
}