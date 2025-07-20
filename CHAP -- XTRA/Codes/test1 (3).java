package All;

class test1
{
    public static void main(String args[])
    {
        int i=1;
        int a[]={43,50,35};
        a[i++]=--i;
        System.out.println(a[0]+" "+a[1]+" "+a[2]);
    }
}
