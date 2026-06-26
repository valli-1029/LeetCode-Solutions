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
import java.util.*;
class Solution {
    ListNode head;
    public Solution(ListNode h) {
        head=h;
    }
    
    public int getRandom() {
        ArrayList <Integer> a=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            a.add(curr.val);
            curr=curr.next;
        }
        Random ran=new Random();
        
        return a.get(ran.nextInt(a.size()));
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */