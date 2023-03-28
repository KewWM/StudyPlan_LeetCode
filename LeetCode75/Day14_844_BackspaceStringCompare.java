package LeetCode75;

import java.util.Stack;

public class Day14_844_BackspaceStringCompare
{
    public boolean backspaceCompare(String s, String t)
    {
        Stack<Character> st = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        //s block
        for(char c : s.toCharArray())
        {
            if(c == '#')
            {
                if(!st.isEmpty())
                    st.pop();
            }
            else
                st.push(c);
        }

        //t block
        for(char c : t.toCharArray())
        {
            if(c == '#')
            {
                if(!st2.isEmpty())
                    st2.pop();
            }
            else
                st2.push(c);

        }

        if(st.equals(st2))
        {
            return true;
        }

        return false;
    }
}
