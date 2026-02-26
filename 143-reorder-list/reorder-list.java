/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode start=slow.next;
        slow.next=null;
        Stack<ListNode> st=new Stack();
        while(start!=null){
            st.push(start);
            start=start.next;
        }
        ListNode curr=head;
        while(!st.isEmpty()){
            ListNode popped=st.pop();
            ListNode temp =curr.next;
            curr.next=popped;
            popped.next = temp;
            curr = popped.next;
        }
        
    }
}