package ProgrammingSkills1;

public class Day4_1822_SignoftheProductofanArray
{
    public int arraySign(int[] nums)
    {
        int prod = 1;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == 0)
                return 0;
            if (nums[i] < 0)
                prod *= -1;
        }
        return prod;
    }
}
