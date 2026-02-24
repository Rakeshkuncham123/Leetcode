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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return head;
        HashMap<Integer,Integer> hs=new HashMap<>();
        ListNode temp=head;
        while(temp!=null){
            hs.put(temp.val,hs.getOrDefault(temp.val,0)+1);
            temp=temp.next;
        }
        ListNode res=new ListNode();
        ListNode t=res;
        List<Integer> l=new ArrayList<>();
        
        for(int num : hs.keySet()){
            if(hs.get(num)==1){
                l.add(num);
            }
        }
        Collections.sort(l);
        for(int i : l){
            t.next=new ListNode(i);
            t=t.next;
        }
        return res.next;
    }
}