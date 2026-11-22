class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> arr = new ArrayList<>();
        int i = 0;
        while(i < nums.length)
        {
            int j = i+1, k = nums.length-1;
            while(j < k)
            {
                int sum = nums[i]+nums[j]+nums[k];
                if(sum == 0)
                {
                    arr.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while(j+1 < nums.length && nums[j] == nums[j+1])
                        j++;
                    while(k-1 >= 0 && nums[k-1] == nums[k])
                        k--;
                    j++;
                    k--;
                }
                else if(sum < 0)
                {
                    j++;
                }
                else
                {
                    k--;
                }
            }
            while(i+1 < nums.length && nums[i+1] == nums[i])
                i++;
            i++;
        }
        return arr;
    }
}
