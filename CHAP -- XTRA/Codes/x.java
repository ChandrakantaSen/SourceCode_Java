package All;

class x
{
void fun(int x)
{
  if(x > 0)
  {
   
     System.out.println(x);
       fun(x--);
     System.out.println(x);
  }
}
 
void  main()
{
  int a = 4;
  fun(a);
}
}