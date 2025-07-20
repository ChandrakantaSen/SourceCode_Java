import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
* Java program to find the number of occurrences ofgiven word in a sentence.
* @author 539189
*
*/
public class WordCount {
/**
* @param args
*/
public static void main(String [ ] args) {
// TODO Auto-generated method stub
BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
System.out.print("\nPlease enter any string :");
int count =0;
try{
String input = bf.readLine();
String[ ] array = input.split(" ");
System.out.print("\nPlease enter word to be counted :");
String key = bf.readLine();
for(int i=0;i < array.length;i++){
if(array[i].equals(key))
count++;
}
System.out.print("\n The given word occured "+ count + " times");
} catch(IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
}