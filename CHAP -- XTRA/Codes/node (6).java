/*
 * Author:praveenmax
 * mail-id:praveenmatrix2006@yahoo.co.in
 * 
 * THIS IS THE "NODE" CLASS WHICH REPRESENTS A SINGLE NODE.
 * MULIPLE INSTANCE OF THIS CLASS FORMS A LIST.
 * THE CLASS "LINKEDLIST"(ACCOMPANYING JAVA FILE) HOLDS THE NODES TOGETHER TO FORM A LINKED LIST
 * 
 */

public class node 
{
	int data;
	node nextnode=null;//its reference to next node.It contains the "node" instance .
	String ref=null;//this is for visual representation whether this is the last node or not(Last means ref="X".Else ref="O" always).We wont use as part of logic.
	//The actual structure of a node instance in our program is node[data,node obj].
	public node(int temp)
	{
		this.data=temp;//the data part
		this.nextnode=null;//a standalone node has no links .We will specify based on its location in the list
	}
	public void printnode()
	{
		//here we display the node contents .We display the data and "ref" string.
		//In linkedlist datastructure ,the node contains[data,reference_object].Internally we follow this format,but when displaying it visually ,it doesnt makes any sense .
		//If we try to print an object ,it will be like this "node@124123" which is useless for us".So,i just print either "O" or "X" for better understanding
		
		System.out.print("["+this.data+"|"+this.ref+"]");
	}
}
