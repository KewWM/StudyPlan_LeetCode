package Algorithm1;

import java.util.LinkedList;
import java.util.List;

public class Day11_784_LetterCasePermutation
{
    public List<String> letterCasePermutation(String s)
    {
        LinkedList<String> res = new LinkedList<>();
        res.add(s);
        int n = s.length();
        for(int i = n-1; i >= 0; i--)
        {
            char c = s.charAt(i);
            if(Character.isLetter(c))
            {
                int size = res.size();
                while(size-- > 0)
                {
                    String str = res.poll();
                    String left = str.substring(0, i);
                    String right = str.substring(i+1, n);
                    res.add(left + Character.toLowerCase(c) + right);
                    res.add(left + Character.toUpperCase(c) + right);
                }
            }
        }
        return res;
    }
}
