package Algorithm1;

import java.util.Arrays;

public class Day2_977_SquaresofaSortedArray
{
    public int[] sortedSquares(int[] nums)
    {
        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);
        return nums;
    }
}
