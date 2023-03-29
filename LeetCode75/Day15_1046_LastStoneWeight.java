package LeetCode75;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Day15_1046_LastStoneWeight
{
    public int lastStoneWeight(int[] stones)
    {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int stone : stones)
        {
            maxHeap.add(stone);
        }
        while (maxHeap.size() != 1)
        {
            int y = maxHeap.remove();
            int x = maxHeap.remove();
            if (x == y)
                maxHeap.add(0);
            if (x != y)
                maxHeap.add(y - x);
        }
        return maxHeap.peek();
    }
}
