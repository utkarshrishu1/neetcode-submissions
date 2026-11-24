class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left[] = new int[n];
        int right[] = new int[n];
        int l = height[0], r = height[n-1];
        for(int i = 0; i < n; i++)
        {
            left[i] = l;
            right[n-i-1] = r;
            if(height[i] > l)
            {
                l = height[i];
            }
            if(height[n-i-1] > r)
            {
                r = height[n-i-1];
            }
        }
        int totalWater = 0;
        for(int i = 0; i < n; i++)
        {
            if(height[i] < Math.min(left[i], right[i]))
            {
                totalWater += Math.min(left[i], right[i]) - height[i];
            }
        }
        return totalWater;
    }
}
