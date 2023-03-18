package ProgrammingSkills1;

public class Day5_1232_CheckIfItIsaStraightLine
{
    public boolean checkStraightLine(int[][] coordinates)
    {
        if (coordinates == null || coordinates.length < 2)
        {
            return false;
        }

        int[] first = coordinates[0];
        int[] second = coordinates[1];

        for (int i = 2; i < coordinates.length; i++)
        {
            int[] current = coordinates[i];
            if ((second[1] - first[1]) * (current[0] - second[0]) !=
                    (current[1] - second[1]) * (second[0] - first[0]))
            {
                return false;
            }
        }

        return true;
    }
}
