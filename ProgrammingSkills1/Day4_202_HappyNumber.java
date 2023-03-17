package ProgrammingSkills1;

import java.util.HashSet;
import java.util.Set;

public class Day4_202_HappyNumber
{
    public boolean isHappy(int n)
    {
        Set<Integer> gotLiao = new HashSet<>();

        while (n != 1 && !gotLiao.contains(n))
        {
            gotLiao.add(n);

            int sum = 0;
            while (n > 0)
            {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }

            n = sum;
        }

        return (n == 1);
    }
}
