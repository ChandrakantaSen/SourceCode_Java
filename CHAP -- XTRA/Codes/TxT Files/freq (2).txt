class freq
{
public static void main()
{
String s="honesty is the best policy .be honest and enjoy";
int l=s.length();
int d=1,p=0;
char c=' ',ch=' ',cc=' ';
String word=" ";
for(int i=97;i<=122;i++)
{
for(int j=0;j<l;j++)
{
c=s.charAt(j);
if(c==' ')
continue;
else
if((int)c==i)
word=word+c;
   }
}
System.out.print(word);
int y=word.length();
for(int k=0;k<y;k++)
{
for(int m=0;m<k;m++)
{
cc=word.charAt(k);
ch=word.charAt(m);
if((ch==cc))
d++;
else if(ch!=cc)
d=1;
    }
     System.out.println(ch+" "+d);
     
   
}
        }
}
