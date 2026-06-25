// class MyLinkedList {
//     ListNode head;
//     public MyLinkedList() {
//     }
    
//     public int get(int index) {
//         if(head==null || index<0){
//             return 0;
//         }
//         ListNode curr=head;
//         for(int i=0;i<index;i++){
//             curr=curr.next;
//         }
//         return curr.val;
//     }
    
//     public void addAtHead(int val) {
//         ListNode created=new ListNode(val);
//         created.next=head;
//         head=created;
//     }
    
//     public void addAtTail(int val) {
//         ListNode created=new ListNode(val);
//         if(head==null){
//             head=created;
//             return;
//         }
//         ListNode curr=head;
//         while(curr.next!=null){
//             curr=curr.next;
//         }
//         curr.next=created;
//     }
    
//     public void addAtIndex(int index, int val) {
//         if(index<0){
//             return;
//         }
//         int i=0;
//         ListNode created = new ListNode(val);
//         ListNode curr=head;

//         while(i<index){
//             curr=curr.next;
//             i++;
//         }
//         created.next=curr.next;
//         curr.next=created;
//     }
    
//     public void deleteAtIndex(int index) {
//         if(index<0){
//             return;
//         }
//         if(index==0){
//             head=head.next;
//             return ;
//         }
//         int i=0;
//         ListNode curr=head;
//         while(i<index-1){
//             curr=curr.next;
//             i++;
//         }
//         if(curr.next!=null && curr.next.next!=null){
//             curr.next=curr.next.next;
//         }
//         else{
//             curr.next=null;
//         }
//     }
// }

// /**
//  * Your MyLinkedList object will be instantiated and called as such:
//  * MyLinkedList obj = new MyLinkedList();
//  * int param_1 = obj.get(index);
//  * obj.addAtHead(val);
//  * obj.addAtTail(val);
//  * obj.addAtIndex(index,val);
//  * obj.deleteAtIndex(index);
//  */
class MyLinkedList {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    private ListNode dummy;
    private int size;

    public MyLinkedList() {
        dummy = new ListNode(0);
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }

        ListNode curr = dummy.next;

        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        return curr.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return;
        }

        ListNode prev = dummy;

        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }

        ListNode node = new ListNode(val);
        node.next = prev.next;
        prev.next = node;

        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }

        ListNode prev = dummy;

        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }

        prev.next = prev.next.next;
        size--;
    }
}