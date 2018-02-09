package LeetCode;



public class reverseLinkedList {
	
	private static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data= data;
			this.next=null;
		}
	}
	
	public static ListNode reverseList(ListNode head) {
		if(head==null) {
			return head;
		}
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;
		 while(current != null) {
			 next = current.next;
			 current.next = previous;
			 previous = current;
			 current = next;
			 
		 }
	return previous;
	}

	public static void main(String[] args) {
		ListNode head= new ListNode(10);
		ListNode second= new ListNode(20);
		ListNode third= new ListNode(30);
		ListNode fourth= new ListNode(40);
		
		head.next= second;
		second.next=third;
		third.next=fourth;
		
		reverseLinkedList sl= new reverseLinkedList();
		ListNode reverseListHead= sl.reverseList(head);
		System.out.println(reverseListHead);

	}

}
