public class Day4_344_Reverse_String
{
    public void reverseString(char[] s)
    {
        char[] newS = new char[s.length];
        int cnt = 0;
        for (int i = s.length - 1; i >= 0; i--, cnt++)
        {
            newS[cnt] = s[i];
        }
        //System.arraycopy(newS, 0, s, 0, s.length - 1 + 1);

        for (int j = 0; j <= s.length - 1; j++)
        {
            s[j] = newS[j];
        }
    }
}
