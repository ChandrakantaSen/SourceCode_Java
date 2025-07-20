class pat1
{
    public static void main()
    {
        String a="APPLICATIONS",d="",p="";
        int i,j,l;
        l=a.length();
        for(i=0;i<l;i++)
        {
            char c=a.charAt(i);
            d=d+c;
            a=a.replace(c,' ');
        }
        for(j=0;j<d.length();j++)
            {
                if(d.charAt(j)!=' ')
                {
                    p=p+d.charAt(j);
                }
            }
            System.out.print(p);
            }            
}