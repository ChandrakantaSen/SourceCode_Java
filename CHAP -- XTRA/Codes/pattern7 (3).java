class pattern7
{
    public static void main(String args[])
    {
        int i,j,s,k;
        for(i=1;i<=4;i++)
        {
            for(s=1;s<=4-i;s++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            if(i>1)
            {
             for(k=i;k>=1;k--)
             {
                System.out.print(k);
             }
            }  
             System.out.println();
            
        
    }
}
}
