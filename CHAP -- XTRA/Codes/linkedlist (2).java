import java.io.*;
import java.util.*;
/*
 * Author:praveenmax
 * mail-id:praveenmatrix2006@yahoo.co.in
 * 
 * LINKED LIST IMPLEMENTATION IN JAVA USING OOP METHODOLOGY(classes)
 * ====================================================================
 * A linked list is a basic datastructure using which we can perform operations similar to real life lists(shopping list).
 * Using this, we can add/delete elements(or node) to a list in a particular order(preferably  sorted).
 * It can be used to create other datastructures such as stack,queue.My program shows just an abstract operation of Linked list. 
 * THIS IS THE "LIST" CLASS WHICH PERFORMS ADDING(FIRST,LAST) NODES,REMOVING NODES,DISPLAYING LIST.
 * THIS IS JUST A LIST .IF WE NEED TO PUT SOMETHING IN THIS LIST ,THEN CREATE NODE INSTANCE(thats another class "node") AND ADD TO THIS LIST.
 * 
 */
public class linkedlist 
{
	node first=null;//used to keep track of first node in the list
	node last=null;//used to keep track of last node in the list
	int count=0;//to track the number of nodes added to the list
	//to add a node to the beginning of the linked list
	public void addNodetoFirst(int data)
	{
		node temp=new node(data);//creates a new node and sets the given "data" .
		if(this.first==null)//checks whether a node exists or not
		{
			this.first=temp;//Sets the current node as first node since this is one node in the list.
			this.last=temp;//And this is the last node since there is only one node.We use the variable "last" while displaying.So,it will be useful to define it.
			
			temp.nextnode=null;
			temp.ref="X";
			this.count++;
			System.out.println("\n node["+data+"] added to the list");
		}
		else//if there exists a node,then this part is executed
		{
			temp.nextnode=first;//makes the older node be the node after the newer node by making the new node to point to old node
			this.first=temp;//makes the newly created node to be the first node
			temp.ref="O";//represents that this node's position is other than the last one.(can be first,middle, but not last)
			this.count++;
			System.out.println("\n node["+data+"] added to the list");
		}
	}
	
	//to add a new node to the end of the list
	public void addNodetoLast(int data)
	{
		node temp=null;
		if(this.count==0)//if there is no last node.(i.e;no elements in the list)
		{
			System.out.println("List is empty.Please create a list !");
		}
		else//if some nodes exists
		{
			temp=new node(data);//creates a node with the given data
			this.last.nextnode=temp;//makes the last node to point to newly created node
			this.last.ref="O";//this is just a visual represetation that this is not the last node anymore
			this.last=temp;//makes the new node as last node
			temp.ref="X";//this is for visual representation that the new node has become the last node
			this.count++;
			System.out.println("\n node["+data+"] added to the list");
		}
	}
	
	//to delete a node from the list
	public void deleteNode(int data)
	{
		node del_node=this.first;//we get the reference of the first node and start searching from there till our node[data] is found
		node prev_node=null;//keeps track of previous node
		boolean notfound=true;
		while(notfound)
		{
			
				if(del_node.data!=data)
				{
					prev_node=del_node;//sets the current node as previous node
					System.out.println("Not found in node["+del_node.data+"]");
					del_node=del_node.nextnode;//move to the next node
				
				}
				else//if data found 
				{
					if(prev_node==null)//if the data is in first node itself
					{
						this.first=del_node.nextnode;//The node pointed by the first node becomes the new first node
						del_node=null;//removes the previous first node(which is refered by del_node) by setting its reference to null
						System.out.println("Removed node["+data+"]");
						this.count--;
						notfound=false;
					}
					else//if the data is inbetween nodes
					{
						prev_node.nextnode=del_node.nextnode;//previous node connects to the del_node nextnode
						del_node=null;//removes the node by setting its reference to null
						System.out.println("Removed node["+data+"]");
						this.count--;
						notfound=false;//exits the loop
					}
			}
		}
	}
	
	//to display all the nodes from the linked list
	public void displayList() 
	{
		node display_node=first;//getting the reference to first node .So we can display the remaining node just by accessing it"nextnode" variable.
		boolean flag=true;//to keep track whether we reached the last node or not
		if(display_node==null)//if the node is null(i.e,if the linked list is not created)
		{
			System.out.println("Linked List is empty!Create one");
		}
		else
		if(display_node==last)//this is used if the linked contains only one node
			{
				display_node.printnode();
			}
			else//This part is executed only if the list is non-empty and it contains more than one node.
			{
				while(flag)
				{
					display_node.printnode();//prints the node data
					//checking  whether the next immediate node reference is the last node
					if(display_node.nextnode==last)
						{
							System.out.print("-->");
							last.printnode();//prints the last node immediately 
							flag=false;//exits the loop
						}
					else //if "false"(i.e; if the next node is not the last node),then we still have some more nodes to print..
						{
							System.out.print("-->");//..an arrow is drawn and...
							display_node=display_node.nextnode;//..moves to next node.Yet to print this node.
						
						}
					
					
				}//while
			}//else
		System.out.println("\nNumber of nodes in the List:"+this.count);
	}//display
	public static void main(String args[])
	{
		linkedlist sample=new linkedlist();//creating a new list instance.
		//creating menu for commandline operations
		int option=0;
		Scanner ip=new Scanner(System.in);//to get input from user
		do{
			System.out.println("\n\nLinkedList\n=========");
			System.out.println("1.Add a node at the beginning.\n");
			System.out.println("2.Add a node at the end.\n");
			System.out.println("3.Delete a node\n");
			System.out.println("4.Display LinkedList contents.\n");
			System.out.println("5.Exit.\n Enter a Choice:");
			option=ip.nextInt();
			switch(option)
			{
			case 1:
				System.out.println("Enter the node data:");
				sample.addNodetoFirst(ip.nextInt());
				break;
			case 2:
				sample.addNodetoLast(ip.nextInt());
				break;
			case 3:
				sample.displayList();
				System.out.println("\nEnter the data to be deleted:");
				sample.deleteNode(ip.nextInt());
				break;
			case 4:
				sample.displayList();
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("ENTER A VALUE BETWEEN 1 TO 5");
			    break;
			}//switch
		}while(option!=5);
	}
}
