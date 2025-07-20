class test
{
    void main(int a)
    {
        int i,sum=0;
        
        for(i=1;i<a;i++)
        {
            if(a%i==0)
            {
                sum = sum + i;
            }
        }
        System.out.println("sum "+sum);
    }
}
