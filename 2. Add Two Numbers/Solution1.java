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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {        
        ListNode nodeAux = new ListNode(0);
        ListNode nodeL1 = l1;
        ListNode nodeL2 = l2;
        ListNode nodeAtual = nodeAux;

        int carry = 0;
        while (nodeL1 != null || nodeL2 != null)
        {
            int x = (nodeL1 != null) ? nodeL1.val : 0;
            int y = (nodeL2 != null) ? nodeL2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            nodeAtual.next = new ListNode(sum % 10);
            nodeAtual = nodeAtual.next;
            if (nodeL1 != null) 
                nodeL1 = nodeL1.next;
            if (nodeL2 != null) 
                nodeL2 = nodeL2.next;
        }
        if (carry > 0)
        {
            nodeAtual.next = new ListNode(carry);
        }
        return nodeAux.next;                
    }
}