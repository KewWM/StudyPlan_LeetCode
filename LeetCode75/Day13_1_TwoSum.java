package LeetCode75;

public class Day13_1_TwoSum
{
    public int[] twoSum(int[] nums, int target)
    {
        if (nums == null||nums.length < 2)
            return null;
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = i+1; j < nums.length; j++)
            {
                if (nums[i] + nums[j] == target)
                {
                    System.out.println(i + " " + j);
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
