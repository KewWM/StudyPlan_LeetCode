package ProgrammingSkills1;

public class Day8_1768_MergeStringsAlternately
{
    public String mergeAlternately(String word1, String word2)
    {
        int n1 = word1.length();
        int n2 = word2.length();
        String ans = "";
        int len = Math.max(n1,n2);
        for(int i = 0; i < len; i++)
        {
            if(i < n1)
            {
                ans += "" + word1.charAt(i);
            }
            if(i < n2)
            {
                ans += "" + word2.charAt(i);
            }
        }
        return ans;
    }
}
