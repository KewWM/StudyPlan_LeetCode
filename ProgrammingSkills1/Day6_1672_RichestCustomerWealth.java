package ProgrammingSkills1;

public class Day6_1672_RichestCustomerWealth
{
    public int maximumWealth(int[][] accounts)
    {
        int[] ttl = new int[accounts.length];
        for (int i = 0; i < accounts.length; i++)
        {
            for (int j = 0; j < accounts[i].length; j++)
            {
                ttl[i] += accounts[i][j];
            }
        }

        int max = ttl[0];
        for(int i = 1; i < ttl.length; i++)
        {
            if (ttl[i] >= max)
                max = ttl[i];
        }

        return max;
    }
}
