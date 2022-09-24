/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */

var reverseList = function(head) {
    let first = null;
    let second = head;
    let backup = null;
    
    while (second != null) {
        backup = second.next;
        second.next = first;
        first = second;
        second = backup;
    }
    return first;
};















































