import java.util.regex.Pattern;
public class patternprog {
public static void main(String[] args)
	 {
		String text = "This is the text to be searched " + "for occurrences of the pattern.";
		String pattern = ".*is.*";
		
		//String pattern = "is";
		
		boolean b1 = Pattern.matches(pattern, text);
		System.out.println("matches = " + b1);
	}
}