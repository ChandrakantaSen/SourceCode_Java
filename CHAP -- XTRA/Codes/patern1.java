class patern1
{
    public static void main(String args[])
    {
        int i,n=4,s,j;
        for(i=1;i<=4;i++)
        {
         for(s=1;s<=n-i;s++)
         {
             System.out.print(" ");
            
            }
         for(j=1;j<=(2*i)-1;j++)
        {
             System.out.print("*");
            }
            System.out.println();
        }
    }
}
