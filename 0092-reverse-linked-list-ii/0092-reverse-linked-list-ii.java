// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public ListNode reverseBetween(ListNode head, int left, int right) {
//         if(head==null|| head.next==null){
//             return head;
//         }
//         if(head.next.next==null){
//             ListNode curr=head;
//             head=head.next;
//             head.next=curr;
//             curr.next=null;
//             return head;
//         }
//         int i=0;
//         ListNode prev=head;
//         while(i<left-1){
//             prev=prev.next;
//             i++;
//         }
//         for(int i=left;i<=right;i++){
//             ListNode curr=head.next;
//             while(curr!=null){
//                 ListNode nextNode=curr.next;
//                 curr.next=prev;
//                 prev=curr;
//                 curr=nextNode;
//                 }
//                 head.next=null;
//                 head=prev;
//                 }
//             }
//             return head;
// }
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        ListNode curr = prev.next;

        for (int i = 0; i < right - left; i++) {
            ListNode next = curr.next;

            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }

        return dummy.next;
    }
}