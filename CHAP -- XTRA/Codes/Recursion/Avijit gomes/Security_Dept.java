import java.io.*;
class Security_Department
{
void abc()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n; String code;
System.out.println("Enter Length of Code");
n=Integer.parseInt(br.readLine());
System.out.println("Enter Code");
code=br.readLine();
if(n!=code.length())
System.out.println("Invalid Code");
else
{ 
if(n>6)
System.out.println("Invalid Code");
else
{ 
if(Check_Upper_Case(code)==false)
System.out.println("Invalid Code");
else
{ 
if(Check_No_Repetition(code)==false)
System.out.println("Invalid Code");
else
{ 
if(Check_Composition(code)==false)
System.out.println("Invalid Code");
else
System.out.println(" Valid Code");
}
}
}
}
}
boolean Check_Upper_Case(String code)
{
int j=0;
for(int i=0;i<code.length();i++)
{ 
if(Character.isUpperCase(code.charAt(i))==true)
j=j+1;
}
if(j==code.length())
return true;
else
return false;
}
boolean Check_No_Repetition(String code)
{
char a; int f;
for(int i=0;i<code.length();i++)
{
a=code.charAt(i);f=0;
for(int j=0;j<code.length();j++)
{
if(i!=j)
{
if(code.charAt(j)==a)
return false;
}
}
} 
return true;
}
boolean Check_Composition(String code)
{ 
int f=0;
for(int i=0;i<code.length();i++)
{
if(code.charAt(i)=='A'||code.charAt(i)=='E'||code.charAt(i)=='C'||code.charAt(i)=='I'||code.charAt(i)=='G'
||code.charAt(i)=='K')
f=f+1;
}
if(f==code.length())
return true; 
else
return false;
} 
}