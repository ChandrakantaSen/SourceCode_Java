class decode1
{
    public static void main()
    {
        String s="RUIJGG EVGGBK SAGG";
        int l=s.length();
        int i,j,k;
        char c;String d="";
        for(i=0;i<l-1;i++)
        {
            c=s.charAt(i);
            if(c==s.charAt(i+1))
            {
                d=d+" ";
                i++;
            }
            else if(c>='A' && c<='Z')
            {
                if((int)c+10>90)
                {
                    j=(int)c+10-90;
                    j=j+64;
                    d=d+(char)j;
                }
                else if((int)c+10==90)
                {
                    j=70;
                    d=d+(char)(int)j;
                }
                else if((int)c+10<90)
                {
                    d=d+(char)((int)c+10);
                }
                
            }
            
        }
        System.out.println(d);
    }
}