import java.io.*;
class vowelcount
{
	public static void main(String args[]) throws IOException
       {
       String s;
       char ch;
      int vc=0,bc=0,spl_ch=0;
      BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter  Any string    : ");  s=obj.readLine();
                int l=s.length();
		s=s.toUpperCase();
		for(int i=0;i<l;i++)
		{
			switch(s.charAt(i))
			{
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
			 		vc++; break;
				case ' ':
			 		bc++; break;
				default:
			    	spl_ch++;   			 
			}		
			
		}
		System.out.println("Number of Vowels = " +vc);
		System.out.println("Number of Blank Spaces = " +bc);
		System.out.println("Number of Words = "+(bc+1));
	}
}
