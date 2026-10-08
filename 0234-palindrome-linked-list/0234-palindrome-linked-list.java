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
    
    public ListNode reverse(ListNode head){
        ListNode pre=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode forward=curr.next;
            curr.next=pre;
            pre=curr;
            curr=forward;
        }
        return pre;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null|| head.next==null){
            return true;
        }
    ListNode slow = head;
    ListNode fast = head;
    ListNode prev = null;
    
    while (fast != null && fast.next != null) {
        prev = slow;
        slow = slow.next;
        fast = fast.next.next;
    }
    if (prev != null) {
        prev.next = null;
    }

        ListNode head2=reverse(slow);
        ListNode temp1=head;
        ListNode temp2=head2;
        while(temp1!=null &&temp2!=null){
            if(temp1.val!=temp2.val){
                return false;
            }
            else{
                temp1=temp1.next;
                temp2=temp2.next;
            }
        }
        return true;
        
    }
}