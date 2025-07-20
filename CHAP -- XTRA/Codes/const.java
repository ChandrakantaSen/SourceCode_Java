class const
{
int a,b,c;
const()
{
System.out.println("nothing");
}
const(int x,int y)
{
a=x;
b=y;
System.out.println(" "+a+" "+b);
}
const(int z)
{
c=z;
}
const(const p)
{
System.out.println(p.c);
}
}
class const1
{
public static void main(string args[])
{
const ob1=new const();
const ob2=new const(3,4);
const ob3=new const(134);
const ob4=new const(ob3);
}
}