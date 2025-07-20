class Test
{
 	public static void main(String[] args)
 	{
 		//Auto-boxing of int i.e converting primitive data type int to a Wrapper class Integer
  		Integer iob = 100; 
  			
  		//Auto-unboxing of Integer i.e converting Wrapper class Integer to a primitve type int	
  		int i = iob;   
  		System.out.println(i+" "+iob);

		//Auto-boxing of char i.e converting primitive data type char to a Wrapper class Character
  		Character cob = 'a';  
  			
  		//Auto-unboxing of Character i.e converting Wrapper class Character to a primitive type char	
  		char ch = cob;  
  		System.out.println(cob+" "+ch);
 	}
}