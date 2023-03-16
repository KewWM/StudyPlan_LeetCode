package ProgrammingSkills1;

public class Day2_191_Numberof1Bits
{
    public int hammingWeight(int n)
    {
        int count = 0;
        while(n != 0){
            int last_bit = n & 1;
            count += last_bit;
            n = n >>> 1;
        }
        return count;
    }
}
