class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for(int i = 0; i < nums.length; i++)
            hash.add(nums[i]);
        int longest = 0;
        for(int num:hash)
        {
            if(!hash.contains(num-1))
            {
                int curr = 1;
                while(hash.contains(num+curr))
                {
                    curr++;
                }
                if(curr > longest)
                    longest = curr;
            }
        }
        return longest;
    }
}
