package LeetCode75;

public class Day1_1480_RunningSumof1dArray
{
    public int[] runningSum(int[] nums)
    {
        for (int i = 1; i < nums.length; i++)
        {
            nums[i] = nums[i-1] + nums[i];
        }
        return nums;
    }
}
