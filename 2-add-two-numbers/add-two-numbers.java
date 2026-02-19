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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode head=new ListNode();
        ListNode temp3=head;
        int c=0;
        while(temp1!=null && temp2!=null){
            int sum=temp1.val+temp2.val+c;
             int r=sum%10;
            c=sum/10;
           
            temp3.next=new ListNode(r);
            temp1=temp1.next;
            temp2=temp2.next;
            temp3=temp3.next;
        }
         while(temp1!=null){
             int r=(temp1.val+c)%10;
             c=(temp1.val+c)/10;
           
            temp3.next=new ListNode(r);
            temp1=temp1.next;
            temp3=temp3.next;
        }
         while(temp2!=null){
             int r=(temp2.val+c)%10;
            c=(temp2.val+c)/10;
           
            temp3.next=new ListNode(r);
            temp2=temp2.next;
            temp3=temp3.next;
        }
        if(c>0) temp3.next=new ListNode(c);
        return head.next;

    }
}