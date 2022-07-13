
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode backup;
        
        while (current != null) {
            backup = current.next; // node with value 2
            current.next = prev; // reversing the pointers
            prev = current; // let's move on
            current = backup; // let's move on
        }
        return prev; // the new head
    }
}
