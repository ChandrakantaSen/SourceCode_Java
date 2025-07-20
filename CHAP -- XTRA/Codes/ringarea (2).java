package All;

class ringarea
{
    public static void main(  )
    {
        int R,r;
        float pie=3.142f,area=0;
        R=13; r=5;
        area=pie*(R*R-r*r);
        System.out.print("The area of a Ring ="+pie+"*"+R+"*"+R+"-"+r+"*"+r);
        System.out.print("="+area);
    }
}