/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        ListNode curr=headA;
        while(curr!=null){
            ListNode currOne=headB;
            while(currOne!=null){
                if(curr==currOne){
                    return curr;
                }
                currOne=currOne.next;
            }
            curr=curr.next;
        }
        return null;
    }
}