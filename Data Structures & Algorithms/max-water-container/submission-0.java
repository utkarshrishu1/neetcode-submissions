class Solution {
    public int maxArea(int[] heights) {
        int p1 = 0, p2 = heights.length-1;
        int maxArea = 0;
        while(p1 < p2)
        {
            int area = (p2-p1)*Math.min(heights[p1], heights[p2]);
            if(area > maxArea)
                maxArea = area;
            if(heights[p1] > heights[p2])
                p2--;
            else
                p1++;
        }
        return maxArea;
    }
}
