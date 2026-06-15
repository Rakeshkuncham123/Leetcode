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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null) return null;
        ListNode slow=head;
        ListNode fast=head;
        int c=1;
        while(slow.next!=null){
            slow=slow.next;
            c++;
        }
        c=c/2;
        while(c>1){
            fast=fast.next;
            c--;
        }
        fast.next=fast.next.next;
        return head;
        
    }
}