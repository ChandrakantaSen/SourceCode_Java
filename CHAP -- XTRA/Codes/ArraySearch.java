import java.io.*;
class ArraySearch
{
    public static void main()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] names = {"Kalyan","Sohom","Koustav","Sayan","Debroop"};
        System.out.print("Enter the search name : ");
        String nm = br.readLine();
        for(int i = 0;i < 5;i++)
        {
            if(nm.equals(names[i]) == true)
            {
                System.out.println("Search Succesful!");
                System.out.println(nm + " found at position " + (i + 1));
                System.out.print("Do you want to delete the record?(Y/N)");
                char opt = (br.readLine()).charAt(0);
                if(opt == 'Y' || opt == 'y')
                {
                    for(int j = i;j < 5;j++)
                    {
                        names[i] = "";
                        ///names[i+1] = "";
                        //names[names.length - 1] = "";
                    }
                    System.out.println("\fNew Array -->\n");
                    for(int k = 0;k < 5;k++)
                        System.out.println(names[k]);
                    System.exit(0);
                }
                else if(opt == 'N' || opt == 'n')
                {
                    System.exit(0);
                }
            }
            else
            {
                if(i == 5)
                {                    
                    System.out.println(nm + " is not found! Search Unsuccesful!!!");
                    System.exit(0);
                }
            }
        }
    }
}