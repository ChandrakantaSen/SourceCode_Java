import java.util.*;
/*  Class SinglyLinkedList  */
class SinglyLinkedList
{    
    public static void main(String[] args)
    {             
        Scanner scan = new Scanner(System.in);
        /* Creating object of class linkedList */
        linkedList list = new linkedList(); 
        System.out.print("*********Singly Linked List Test*********");          
        System.out.println();
        char ch;
        /*  Perform list operations  */
        do
        {
            System.out.println("***Singly Linked List Operations***");
            System.out.println("1. insert at begining");
            System.out.println("2. insert at end");
            System.out.println("3. insert at position");
            System.out.println("4. delete at position");
            System.out.println("5. check empty");
            System.out.println("6. get size");
            System.out.print("\nEnter your choice:\t");
            int choice = scan.nextInt();            
            switch (choice)
            {
                case 1 : 
                    System.out.println("\nEnter integer element to insert:\t");
                    list.insertAtStart(scan.nextInt());                     
                    break;                          
                case 2 : 
                    System.out.println("\nEnter integer element to insert:\t");
                    list.insertAtEnd( scan.nextInt() );                     
                    break;                         
                case 3 : 
                    System.out.println("\nEnter integer element to insert:\t");
                    int num = scan.nextInt() ;
                    System.out.println("\nEnter position:\t");
                    int pos = scan.nextInt() ;
                    if (pos <= 1 || pos > list.getSize())
                        System.out.println("***Invalid position***\n");
                    else
                        list.insertAtPos(num,pos);
                    break;                                          
                case 4 : 
                    System.out.println("\nEnter position:\t");
                    int p = scan.nextInt();
                    if (p < 1 || p > list.getSize())
                        System.out.println("***Invalid position***\n");
                    else
                        list.deleteAtPos(p);
                    break;
                case 5 : 
                    System.out.println("\nEmpty status = "+ list.isEmpty());
                    break;                   
                case 6 : 
                    System.out.println("\nSize = "+ list.getSize() +" \n");
                    break;                         
                default : 
                    System.out.println("***Wrong Entry***\n");
                    break;   
            }
            /*  Display List  */ 
            list.display();
            System.out.println("\nDo you want to continue(Type y or n):\t");
            ch = scan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y');               
    }
}
