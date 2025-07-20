import java.util.regex.*;

class patternprog2
{
	public static void main (String[] args)
	{
		String text = "This ais the text which 'is' to be searched " + "for occurrences of the word 'is'.";
		String regex = ".is.";
	
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
	
		int count = 0;
		while(matcher.find())
 		{
			count++;
			System.out.println("found: " + count + " : " + matcher.start() + " - " + matcher.end());	
		}
	
     }
}


