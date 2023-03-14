package ProgrammingSkills1;

public class Day1_1523_CountOddNumbersinanIntervalRange
{
    public int countOdds(int low, int high)
    {
        int cnt = 0;
        if (low % 2 == 1)
            cnt++;
        else if (high % 2 == 1)
            cnt++;
        return (((high - low) / 2) + cnt);
    }
}
