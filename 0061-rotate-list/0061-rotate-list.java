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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null|| head.next==null|| k==0){return head;}
        ListNode curr=head;
        int c=1;
        ListNode tail=head;
        while(curr.next!=null){
            c++;
            curr=curr.next;
        }
        curr.next=head;
        int rotate= c-(k%c);
        for (int i = 1; i <rotate; i++) {
            tail = tail.next;
        }
        ListNode newHead = tail.next;
        tail.next = null;
        return newHead;
    }
}