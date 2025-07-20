import java.io.*;
class linkListTest_Insertion_String
{
    protected static linkedList_String S;
    public static void main(String[]args)throws IOException
    {
        String num;
        S=new linkedList_String();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("....Starting List Test for INSERTION....\n");
        for(int a=0;a<5;a++)
        {
            System.out.print("Enter a word : ");
            
                    num=br.readLine();
                    S.Insert(num);
                    System.out.println("Inserted : "+num);
                
            }
            System.out.println("\nCreated List is : ");
            S.display();
            System.out.println("\n----List Test Over----");
        }
    }
                
               