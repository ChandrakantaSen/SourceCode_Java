class primefibo
{
   public static void main(String args[])
   {
       int a=0,b=1,i,c,j,k=0;
       //System.out.print(a+" "+b);
       for(i=1;i<=13;i++)
       {
           c=a+b;
           a=b;
           b=c;
           
        for(j=1;j<=c;j++)
        {
            if(c%j==0)
            {
                k=k+1;
            }
        }
        if(k==2)
        System.out.print(" "+c);
        k=0;
    }
}
}
        
         
           