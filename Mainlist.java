package Linkedlists;
import Linkedlists.LList.NodeS;
import Linkedlists.DList.NodeD;
public class Mainlist {

	/**
	 * @param args
	 */
	public static LList ReverseSingly(LList list){
		NodeS head = list.head;
		NodeS prevnode = null,tempnode=null,nextnode=null;
		tempnode = head;
		while(tempnode != null){
			nextnode = tempnode.next;
			tempnode.next = prevnode;
			prevnode = tempnode;
			tempnode = nextnode;
		}
		list.head = prevnode;
		list.printlist();
		return list;
	}
	
	public static void ReverseDoubly(DList list){
		NodeD head = list.head;
		NodeD tempnode = null, currnode = null;
		currnode = head;
		while(currnode != null){
			tempnode = currnode.prev;
			currnode.prev = currnode.next;
			currnode.next = tempnode;
			currnode = currnode.prev;
		}
		
		if(tempnode != null){
			list.head = tempnode.prev;
			list.printlist();
		}
		else
			System.out.println("Empty list!");
		
	}
	
	public static void Findloop(LList list){
		NodeS head = list.head;
		NodeS ptr1 = head;
		NodeS ptr2 = head;
		NodeS loopnode;
		
		while(ptr1 != null && ptr2 != null && ptr2.next != null){
			ptr1 = ptr1.next;
			ptr2 = ptr2.next.next;
			if (ptr1 == ptr2){
				System.out.println("List has a loop!");
				//Find start of the loop
				loopnode = ptr1;
				ptr2 = head;
				while(ptr2 != loopnode)
				{
					ptr2 = ptr2.next;
					loopnode = loopnode.next;
				}
				System.out.format("Loop begins at %d",ptr2.data);
				System.exit(0);
			}
		}
			System.out.println("List does not have a loop!");
	}
	
	public static void Intersection(LList l1, LList l2){
		
		NodeS list1 = l1.head;
		NodeS list2 = l2.head;
		LList intlist = new LList();
		
		while(list1 != null && list2 != null){
			if(list1.data == list2.data){
				intlist.insertatend(list1.data);
				list1 = list1.next;
				list2 = list2.next;
			}
			else if (list1.data < list2.data){
				list1 = list1.next;
			}
			else {
				list2 = list2.next;
			}
		}
		
		intlist.printlist();		
	}
	
	public static void FindNthlast(LList list,int n){
		
		NodeS temp = list.head;
		int len = 0;
		
		while (temp != null){
			len = len + 1;
			temp = temp.next;
		}
		temp = list.head;
		for (int i = 0; i< (len-n+1);i++)
		{
			temp = temp.next;
		}
		System.out.format("%d th element from the end ->%d", n,temp.data);
		
	}
	
	public static boolean isPalindrome(LList list){
		NodeS h = list.head;
		LList revlist = ReverseSingly(list);
		NodeS rh = revlist.head;
		while (h != null && rh != null){
			if(h.data != rh.data){
				System.out.println("Not a palindrome!");
				return false;
			}
			else {
				h = h.next;
				rh = rh.next;
			}
		}
		System.out.println("List is a palindrome!");
		return true;
	}
	public static void Addlists(LList l1, LList l2){
		
		NodeS list1 = l1.head;
		NodeS list2 = l2.head;
		NodeS addlist;
		int len1 = 0, len2 = 0;
		
		while(list1 != null){
			len1 = len1 +1;
			list1 = list1.next;
		}

		while(list2 != null){
			len2 = len2 +1;
			list2 = list2.next;
		}
		list1 = l1.head;
		list2 = l2.head;
		
		if(len1 == len2){
			while(list1 != null && list2 != null){
				list1.data = list1.data + list2.data;
				list1 = list1.next;
				list2 = list2.next;
			}
		}
		l1.printlist();
	}
	
	public static void DeleteGivenaNode(NodeS delnode){
		
		if(delnode.next != null){
			delnode.data = delnode.next.data;
			delnode.next = delnode.next.next;
		}
		else if (delnode.next == null){
			System.out.println("Don't know how to delete the last node!");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LList list1 = new LList();
		LList list2 = new LList();
		
		list1.insertatend(1);
		list1.insertatend(2);
		list1.insertatend(3);
		list1.insertatend(2);
		list1.insertatend(1);
		list1.insertatend(2);
		
		boolean pal = isPalindrome(list1);
		
		//NodeS delnode = new NodeS(3, 4);
	
		//DeleteGivenaNode(delnode);
		
		//list2.insertatend(4);
		//list2.insertatend(5);
		//list2.insertatend(6);
		
		//Addlists(list1, list2);
		//list1.insertatend(5);
		//list1.insertatend(6);
		//list1.insertatend(7);
		//list1.insertatend(8);
		//list1.insertatend(9);
		
		//list2.insertatend(1);
		//list2.insertatend(3);
		//list2.insertatend(4);
		
		//FindNthlast(list1, 4);
		//Intersection(list1, list2);
		
		//list1.head.next.next.next.next = list1.head.next.next;
		//Findloop(list1);
		
		//list.printlist();
		//list1.deleteelement(4);
		//list1.printlist();
		//list = ReverseSingly(list);
		
		//DList list = new DList();
		//list.insert(1);
		//list.insert(2);
		//list.insert(3);
		//list.printlist();
		//ReverseDoubly(list);
		
	}
}
