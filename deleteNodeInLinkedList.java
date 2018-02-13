package LeetCode;



public class deleteNodeInLinkedList {
	
	private static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data= data;
			this.next=null;
		}
	}
	
	public static void deleteNode(ListNode node) {
		 node.data = node.next.data;
	        node.next = node.next.next;
	}

	public static void main(String[] args) {
		ListNode head= new ListNode(10);
		ListNode second= new ListNode(20);
		ListNode third= new ListNode(30);
		ListNode fourth= new ListNode(40);
		
		head.next= second;
		second.next=third;
		third.next=fourth;
		
		deleteNodeInLinkedList sl= new deleteNodeInLinkedList();
		sl.deleteNode(third);
		

	}

}
