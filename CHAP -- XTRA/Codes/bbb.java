class aaa
{
 private int a;
 protected int aa;
 void geta_aa(int x, int y)
  {
    a=x; aa=y;
  }
 int showa() { 
     return a;
    }

}
class bbb extends aaa
{
 private int b;
 protected int bb;
 void getb_bb(int x, int y)
  {
    b=x; bb=y;
  }
 void showab()
 {
  System.out.println("a="+showa());
  System.out.println("aa="+aa);
  System.out.println("b="+b);
  System.out.println("bb="+bb);
 }
}
//***********************************
class inherit1
{
 public static void main(String args[])
 {
  bbb obj = new bbb();
  obj.geta_aa(2,3);
  obj.getb_bb(4,5);
  obj.showab();
  }
}

