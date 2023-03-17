package ProgrammingSkills1;

public class Day4_1790_CheckifOneStringSwapCanMakeStringsEqual
{
    public boolean areAlmostEqual(String s1, String s2)
    {
        char[] ss1 = s1.toCharArray();
        char[] ss2 = s2.toCharArray();

        int swap = 0, one = 0, two = 0;
        for (int i = 0; i < ss1.length && swap < 2; i++)
        {
            int first = ss1[i], scd = ss2[i];
            if ((one == scd) && (two == first)) //reset
            {
                one = 0; two = 0;
            }
            else if (first != scd) //got swap
            {
                swap++;
                one = first; two = scd;
            }
        }
        return (one + two == 0) && (swap < 2);
    }
}
