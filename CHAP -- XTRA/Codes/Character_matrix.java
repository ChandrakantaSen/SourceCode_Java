import java.io.*;
class Character_matrix
{
    char mat[][];
    int m,n;
    Character_matrix()
    {
        m=0;
        n=0;
    }
    void input()throws IOException
    {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no. of rows and then the no. of columns :");
        m=Integer.parseInt(sc.readLine());
        n=Integer.parseInt(sc.readLine());
        mat=new char[m][n];
        for(int i=0;i<m;i++)
        {
            System.out.println("Enter the elements in row no."+(i+1));
            for(int j=0;j<n;j++)
            {
                mat[i][j]=(char)(sc.read());
            }
        }
    }
    boolean isVowel(char x)
    {
        switch(x)
        {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
            return true;
            default :
            return false;
        }
    }
    void replace()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(isVowel(mat[i][j]))
                mat[i][j]='*';
            }
        }
    }
    void display()
    {
        System.out.println("The replaced matrix is as follows :");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void main()throws IOException
    {
        Character_matrix ob=new Character_matrix();
        ob.input();
        ob.replace();
        ob.display();
    }
}