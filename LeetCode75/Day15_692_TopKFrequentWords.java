package LeetCode75;

import java.util.*;

public class Day15_692_TopKFrequentWords
{
    public List<String> topKFrequent(String[] words, int k)
    {
        TreeMap<String,Integer> map=new TreeMap<>();
        ArrayList<Integer> a=new ArrayList<>();
        List<String> b=new ArrayList<>();;
        for(int i=0;i<words.length;i++)
        {
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }

        for(Map.Entry<String,Integer>e:map.entrySet())
        {
            a.add(e.getValue());
        }
        Collections.sort(a);

        int j=a.size()-1;
        for(int i=0;i<k;i++)
        {
            for(Map.Entry<String,Integer>e:map.entrySet())
            {
                if(a.get(j)==e.getValue())
                {
                    b.add(e.getKey());
                    map.remove(e.getKey());
                    j--;
                    break;
                }
            }
        }
        return b;
    }
}
