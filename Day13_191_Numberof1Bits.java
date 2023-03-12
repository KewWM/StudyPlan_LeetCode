public class Day13_191_Numberof1Bits
{
    // you need to treat n as an unsigned value
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
