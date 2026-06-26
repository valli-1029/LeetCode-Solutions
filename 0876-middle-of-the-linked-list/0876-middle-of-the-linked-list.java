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
    public ListNode middleNode(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        int s=0;
        ListNode slow=head,fast=head;
        while(slow.next!=null &&fast.next!=null &&fast.next.next!=null  ){
            slow=slow.next;
            fast=fast.next.next;
        }
        fast=head;
        while(fast!=null){
            s++;
            fast=fast.next;
        }
        if((s&1)==1)
          return slow;
        return slow.next;
    }
}