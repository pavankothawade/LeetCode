package LeetCode;



public class removeNthNodeFromEndLinkedList {
	
	private static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data= data;
			this.next=null;
		}
	}
	
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode start = new ListNode(0);
	    ListNode slow = start, fast = start;
	    slow.next = head;
	    
	   
	    for(int i=1; i<=n+1; i++)   {
	        fast = fast.next;
	    }
	    
	    while(fast != null) {
	        slow = slow.next;
	        fast = fast.next;
	    }
	 
	    slow.next = slow.next.next;
	    return start.next;
	}

	public static void main(String[] args) {
		ListNode head= new ListNode(10);
		ListNode second= new ListNode(20);
		ListNode third= new ListNode(30);
		ListNode fourth= new ListNode(40);
		
		head.next= second;
		second.next=third;
		third.next=fourth;
		
		removeNthNodeFromEndLinkedList sl= new removeNthNodeFromEndLinkedList();
		sl.removeNthFromEnd(head, 2);
		

	}

}
