public class Day3_283_MoveZeroes
{
    public void moveZeroes(int[] nums)
    {
        int cnt = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if (nums[i] != 0)
            {
                nums[cnt] = nums[i];
                cnt++;
            }

        }
        while(cnt < nums.length)
        {
            nums[cnt] = 0;
            cnt++;
        }
    }
}
