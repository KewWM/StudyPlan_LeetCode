package Algorithm1;

import java.util.Arrays;

public class Day6_567_PermutationinString
{
    public boolean checkInclusion(String s1, String s2)
    {
        int length1 = s1.length();
        int length2 = s2.length();

        if (length1 > length2 )
            return false;

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (char c : s1.toCharArray())
        {
            arr1[c - 'a']++;
        }

        for (int i = 0; i < length2; i++)
        {
            arr2[s2.charAt(i) - 'a']++;

            if (i >= length1)
                arr2[s2.charAt(i - length1) - 'a']--;
            if (Arrays.equals(arr1, arr2))
                return true;
        }
        return false;
    }
}
