package ProgrammingSkills1;

public class Day11_242_ValidAnagram
{
    public boolean isAnagram(String s, String t)
    {
        int alphas[] = new int[26];
        for(char ch : s.toCharArray())
        {
            alphas[ch-'a']++;
        }
        for(char ch : t.toCharArray())
        {
            alphas[ch-'a']--;
        }
        for(int i : alphas)
        {
            if(i != 0)
            {
                return false;
            }
        }
        return true;
    }
}
