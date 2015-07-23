package linkedList;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int carry = 0;
        int sum = 0;
        int remainder = 0;
        
        ListNode node = null;
        ListNode prevNode = null;
        ListNode headNode = null;
        
        while(l1 != null || l2 != null){
            if(l1 != null && l2 != null){
                sum = l1.val + l2.val + carry;
                remainder = sum % 10;
                carry = sum / 10;
            }
            else if(l1 != null){
                sum = l1.val + carry;
                remainder = sum % 10;
                carry = sum / 10;
            }
            else{
                sum = l2.val + carry;
                remainder = sum % 10;
                carry = sum / 10;
            }
            
            if(headNode == null){
                node = new ListNode(remainder);
                headNode = node;
                prevNode = node;
            }
            else{
                node = new ListNode(remainder);
                prevNode.next = node;
                prevNode = node;
            }
            
            if(l1 != null){
                l1 = l1.next;
            }
            
            if(l2 != null){
                l2 = l2.next;
            }
        }
        
        if(carry > 0){
                node = new ListNode(carry);
                prevNode.next = node;
        }
        
        return headNode;
    }
}

class ListNode {
	
	   int val;
	   ListNode next;
	   ListNode(int x) { val = x; }
}