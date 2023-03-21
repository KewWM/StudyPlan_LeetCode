package ProgrammingSkills1;

public class Day8_389_FindtheDifference
{
    public char findTheDifference(String s, String t)
    {
        char c = 0;
        for(char cs : s.toCharArray())
            c ^= cs;
        for(char ct : t.toCharArray())
            c ^= ct;
        return c;
    }
}
