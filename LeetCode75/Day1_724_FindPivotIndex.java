package LeetCode75;

public class Day1_724_FindPivotIndex
{
    public int pivotIndex(int[] nums)
    {
        int left = 0, right = 0;
        for (int i = 0; i < nums.length; i++)
        {
            left += nums[i];
        }

        for (int i = 0; i < nums.length; i++)
        {
            left -= nums[i];
            if (right == left)
            {
                return i;
            }
            right += nums[i];
        }
        return -1;
    }
}
