public class Day14_190_ReverseBits
{
    public int reverseBits(int n)
    {
        int x=0;
        int i=31;
        while(i>=0)
        {
            x |= ((n >> i) & 1) << (31 - i);
            i--;
        }
        return x;
    }
}
