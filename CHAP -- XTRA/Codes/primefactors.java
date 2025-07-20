class primefactors
{
 public static void pf(int i)
 {
 for(int k=1;k<=i;k++)
 {
    if(i%k==0)
    {
    int j;
    for(j=2;j<k;j++)
    {
        if(k%j==0)
        break;
    }
    if(j==k)
    System.out.println(k);
    }
 }
 }
 }
   

   
                                                                           
   
   
   