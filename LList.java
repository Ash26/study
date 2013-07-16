package Linkedlists;

public class LList {

	class NodeS{
		int data;
		NodeS next;
		NodeS(){
			data = 0;
			next = null;
		}
		NodeS(int d,NodeS n){
			data = d;
			next = n;
		}
	}
	
	NodeS head;
    void insertatbeg(int d){
    	NodeS temp = new NodeS();
    	temp.data = d;
    	temp.next = null;
    	
    	if(head == null){
    		head = temp;
    	}
    	else
    	{
    		temp.next = head;
    		head = temp;
    	}
    }

    void insertatend(int d){
    	NodeS newnode = new NodeS();
    	NodeS temp = new NodeS();
    	newnode.data =d;
    	newnode.next = null;
    	temp = head;
    	if(head == null) {
    		head = newnode;
    	}
    	else
    	{
    		while(temp.next != null)
    		{
    			temp = temp.next;
    		}
    		temp.next = newnode;
    	}
    }
    
    void deleteelement(int d){
    	NodeS temp = new NodeS();
    	temp = head;
    	int flag=0;
    	while(temp.next != null){
    		if (temp.data == d){
    			temp.data = temp.next.data;
    			temp.next = temp.next.next;
    			System.out.println("Element deleted");
    			flag =1;
    		}
    		else
    		{
    			temp = temp.next;
    		}
    	}
    	if(flag==0){
    		System.out.println("Element not found");
    	}
    }
    void printlist(){
    	NodeS temp = new NodeS();
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
