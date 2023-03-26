package LeetCode75;

import java.util.ArrayList;
import java.util.List;

public class Day12_438_FindAllAnagramsinaString
{
    public List<Integer> findAnagrams(String s, String p)
    {
        int len = p.length();
        List<Integer> ans = new ArrayList<>();
        int[] arr = new int[26];
        for(int i = 0; i < len; i++)
            arr[p.charAt(i) -'a']++;
        // traverse in s
        for(int i = 0; i < s.length(); i++)
        {
            arr[s.charAt(i) -'a']--;
            if(i - len >= 0)
            {
                arr[s.charAt(i-len) -'a']++;
            }
            if(checkZeroArr(arr))
            {
                int startIndex = i - len + 1;
                ans.add(startIndex);
            }
        }
        return ans;
    }
    public boolean checkZeroArr(int[] arr)
    {
        for(int i = 0; i < 26; i++)
        {
            if(arr[i] != 0)
            {
                return false;
            }
        }
        return true;
    }
}
