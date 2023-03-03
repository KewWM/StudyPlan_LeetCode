public class Day4_557_ReverseWordsinaStringIII
{
    public String reverseWords(String s)
    {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++)
        {
            char[] c = words[i].toCharArray();
            int n = c.length-1, j=0;
            while(j < n)
            {
                char temp = c[j];
                c[j] = c[n];
                c[n] = temp;
                n--;
                j++;
            }
            sb.append(new String(c));

            if(i != words.length - 1)
                sb.append(" ");
        }
        return sb.toString();
    }
}
