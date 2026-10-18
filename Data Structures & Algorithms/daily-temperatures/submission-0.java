class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int result[] = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++)
        {
            int currTemp = temperatures[i];
            int nextDays = 0;
            for(int j = i+1; j < temperatures.length; j++)
            {
                if(temperatures[j] > currTemp)
                {
                    nextDays = j-i;
                    break;
                }
            }
            result[i] = nextDays;
        }
        return result;
    }
}
