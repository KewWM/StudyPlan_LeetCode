package ProgrammingSkills1;

public class Day6_1588_SumofAllOddLengthSubarrays
{
    public int sumOddLengthSubarrays(int[] arr)
    {
        int sum=0;
        int n = arr.length;
        for(int i = 0; i < arr.length; i++)
        {
            int left = i + 1;
            int right = n - i;
            int k = left * right;
            int odd = (k+1) / 2;

            sum += (odd * arr[i]);
        }

        return sum;
    }
}
