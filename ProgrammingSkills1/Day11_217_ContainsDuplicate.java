package ProgrammingSkills1;

import java.util.Arrays;

public class Day11_217_ContainsDuplicate
{
    public boolean containsDuplicate(int[] nums)
    {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++)
        {
            if (nums[i] == nums[i+1])
                return true;
        }
        return false;
    }
}
