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
    public int pairSum(ListNode head) {
        if(head.next.next==null) return head.val+head.next.val;
        ListNode slow=head;
        ListNode fast=head;
        Stack<Integer> st=new Stack<>();
        int c=1;
        while(slow.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            c++;
        }
        while(slow.next!=null){
            slow=slow.next;
            st.push(slow.val);
        }
        int sum=Integer.MIN_VALUE;
         slow=head;
         
         while(c>0){
            int res=slow.val+st.pop();
            sum=Math.max(sum,res);
            slow=slow.next;
            
            c--;
         }
         return sum;
        
    }
}