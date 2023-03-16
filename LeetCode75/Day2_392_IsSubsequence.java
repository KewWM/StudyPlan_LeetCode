package LeetCode75;

public class Day2_392_IsSubsequence
{
    public boolean isSubsequence(String s, String t)
    {
        int i = 0, j = 0;
        int l1 = s.length(), l2 = t.length();
        char[] ss = s.toCharArray(), tt = t.toCharArray();

        if (l1 < 1)
            return true;

        while (i < l2)
        {
            if (tt[i] == ss[j])
            {
                j++;
            }
            i++;

            if (j == l1)
                return true;
        }
        return false;
    }
}
