package ProgrammingSkills1;

import java.util.Arrays;

public class Day1_1491_AverageSalaryExcludingtheMinimumandMaximumSalary
{
    public double average(int[] salary)
    {
        Arrays.sort(salary);
        double ttl = 0;
        for (int i = 1; i < salary.length-1; i++)
        {
            ttl += salary[i];
        }
        return ttl / (salary.length - 2);
    }
}
