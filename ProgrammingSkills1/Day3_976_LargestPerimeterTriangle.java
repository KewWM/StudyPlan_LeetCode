package ProgrammingSkills1;

import java.util.Arrays;

public class Day3_976_LargestPerimeterTriangle
{
    public int largestPerimeter(int[] nums)
    {
        int length = nums.length;
        Arrays.sort(nums);

        for (int i = length - 3; i >= 0; i--)
            if (nums[i] + nums[i+1] > nums[i+2])
                return nums[i] + nums[i+1] + nums[i+2];
        return 0;
    }
}
