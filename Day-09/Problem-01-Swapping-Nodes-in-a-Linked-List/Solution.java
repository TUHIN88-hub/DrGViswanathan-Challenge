class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = head;
        
        // Find kth node from beginning
        for (int i = 1; i < k; i++) {
            first = first.next;
        }
        
        ListNode kthFromStart = first;
        ListNode kthFromEnd = head;
        
        // Find kth node from end
        while (first.next != null) {
            first = first.next;
            kthFromEnd = kthFromEnd.next;
        }
        
        // Swap values
        int temp = kthFromStart.val;
        kthFromStart.val = kthFromEnd.val;
        kthFromEnd.val = temp;
        
        return head;
    }
}
