package Algorithm1;

public class Day5_19_RemoveNthNodeFromEndofList
{
     public class ListNode
     {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
    class Solution
    {
        public ListNode removeNthFromEnd(ListNode head, int n)
        {
            int cnt = 1;
            ListNode c = head;
            while(c.next != null)
            {
                cnt++;
                c = c.next;
            }

            if(n == cnt)
            {
                head = head.next;
                return head;
            }

            ListNode ln = head;
            int i = 0;
            while(++i < cnt-n)
            {
                ln = ln.next;
            }
            ln.next = ln.next.next;

            return head;
        }
    }
}
