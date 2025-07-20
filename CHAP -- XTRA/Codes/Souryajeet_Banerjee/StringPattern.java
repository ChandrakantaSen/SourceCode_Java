class StringPattern
{
void input()
{
  String s="BLUEJ";
  int len=s.length();
  for(int i=5;i>=0;i--)
  {
   System.out.println(s.substring(0,i));
  }
  }
}