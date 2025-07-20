import java.io.*;
 class copyprog
 {
 	static String inpFile = "myfile2.txt";
 	static String outFile = "myfile3.txt";
 	
 	//satic InputStreamReader isr=new InputStreamReader(System.in);
 	//static BufferedReader br=new BufferedReader(isr);
 		 	
 	public static void main (String[] args)throws IOException
 	{	 	
 		FileWriter fw = new FileWriter(outFile);
 		BufferedWriter bw = new BufferedWriter(fw);
 		PrintWriter outFilePW = new PrintWriter(bw); 
 		
 		FileReader fr=new FileReader(inpFile);
 		BufferedReader inpFileBR = new BufferedReader(fr);
 		
 		String str = "";
 		int i;
 		
 		while((i = fr.read()) != -1)
 		{
 			fw.write(i);
 			System.out.println(i);
 		}
 		
 		while((str = inpFileBR.readLine()) == null)
 		 {
 		 	//outFilePW.println(str);
 		 	System.out.println(str);
 		 }
 		 
 		 System.out.println("---- Copy Done ----");
	}
 }