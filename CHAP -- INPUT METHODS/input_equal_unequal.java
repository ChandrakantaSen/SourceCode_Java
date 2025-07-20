      import java.io.*;
      class input_equal_unequal{
            public static void main(String args [ ] ) throws IOException{
                  InputStreamReader stdin = new InputStreamReader(System.in);
                  BufferedReader console = new BufferedReader(stdin);
                  String strTemp;
                  int a,b,c;
                  System.out.println("Enter three numbers:");
                  strTemp = console.readLine();
                  a=Integer.parseInt(strTemp);
                  strTemp = console.readLine();
                  b=Integer.parseInt(strTemp);
                  strTemp = console.readLine();
                  c=Integer.parseInt(strTemp);
                  
                  if(a==b){
                        if(b==c){
                              System.out.println("a,b,c are equal");
                        }
                        else{
                              System.out.println("a,b,c are different");
                        }
                  }
            }
      }
