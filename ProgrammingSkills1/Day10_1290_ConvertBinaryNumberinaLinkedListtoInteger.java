package ProgrammingSkills1;

public class Day10_1290_ConvertBinaryNumberinaLinkedListtoInteger
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

        public int getDecimalValue(ListNode head)
        {
            int res = 0;
            while(head != null)
            {
                res = res << 1 | head.val;
                head  =head.next;
            }
            return res;
        }
    }
}
