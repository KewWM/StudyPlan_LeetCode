package Algorithm1;

import java.util.ArrayList;
import java.util.List;

public class Day11_77_Combinations
{
    public List<List<Integer>> combine(int n, int k)
    {
        List<List<Integer>> subsets = new ArrayList();
        combine(1, n, new ArrayList(), subsets, k);
        return subsets;
    }

    void combine(int start, int n, List<Integer> cur, List<List<Integer>> subsets, int k)
    {
        if(cur.size() == k)
        {
            subsets.add(new ArrayList(cur));
            return;
        }
        for(int i = start; i <= n; i++)
        {
            cur.add(i);
            combine(i+1, n, cur, subsets, k);
            cur.remove(cur.size()-1);
        }
    }
}
