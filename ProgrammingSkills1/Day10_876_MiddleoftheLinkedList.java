package ProgrammingSkills1;

public class Day10_876_MiddleoftheLinkedList
{
    public class ListNode {

        int val;

        ListNode next;


        ListNode() {
        }


        ListNode(int val) {
            this.val = val;
        }


        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    class Solution {
        public ListNode middleNode(ListNode head)
        {
            ListNode nodeCnt = head;
            int cnt = 0;
            while (nodeCnt != null)
            {
                nodeCnt = nodeCnt.next;
                cnt++;
            }

            ListNode current = head;
            for (int i = 0; i < cnt / 2; i++)
            {
                current = current.next;
            }

            return current;
        }
    }
}
