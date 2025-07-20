import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class patternprog3 {
public static void main(String[] args) {
String text =
"This is the text to be searched " +
"for occurrences of the http:// pattern.";
String patternString = "this is the";
Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
Matcher matcher = pattern.matcher(text);
System.out.println("lookingAt = " + matcher.lookingAt());
System.out.println("matches = " + matcher.matches());
}
}
