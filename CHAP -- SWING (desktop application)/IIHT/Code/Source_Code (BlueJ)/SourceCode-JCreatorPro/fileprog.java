import java.io.*;
import java.util.*;
class fileprog
{
	static String filename=("myfile2.txt");

		
	public static void main (String[] args)throws IOException
		{
		//	File f = new File("myfile.text");
		String p;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		  
		//Scanner sc = new Scanner(System.in);  
		FileWriter fw = new FileWriter(filename);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter outFile = new PrintWriter(bw);
		FileReader fr = new FileReader(filename);
		BufferedReader br1 = new BufferedReader(fr); 
		
		for(int i = 0;i<5;i++)
		{
			System.out.print("enter name: ");
			String name;
			name=br.readLine();
			outFile.println(name);
			
		}
		int j=0;
		while((p=br1.readLine())!=null)
		{
			System.out.println("name: "+j);
			System.out.println(p);
			j++;
		}
	//	outFile.close();
		}
}