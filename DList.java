package Linkedlists;



public class DList {
		class NodeD{
			int data;
			NodeD next;
			NodeD prev;
			NodeD(){
				data = 0;
				next = null;
				prev = null;
			}
		}
		
		NodeD head;
	    void insert(int d){
	    	NodeD temp = new NodeD();
	    	NodeD newnode = new NodeD();
	    	newnode.data = d;
	    	newnode.next = null;
	    	//temp.next = head;
	    	temp = head;
	    	if(head == null){
	    		newnode.prev = null;
	    		head = newnode;
	    	}
	    	else
	    	{
	    		while(temp.next != null)
	    		{
	    			temp = temp.next;
	    		}
	    		temp.next = newnode;
	    		newnode.prev = temp;
	    	}
	    	//head= temp;
	    }

	    void printlist(){
	    	NodeD temp = new NodeD();
	    	temp = head;
	    	System.out.println("**********List begin*********");
	    	while(temp.next != null){
	        	System.out.println(temp.data);
	        	temp = temp.next;
	    	}
	    	System.out.println(temp.data);
	    	System.out.println("**********List end*********");
	    }
}
