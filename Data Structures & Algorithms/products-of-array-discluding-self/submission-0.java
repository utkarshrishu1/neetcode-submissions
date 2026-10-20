class Solution {
    public int[] productExceptSelf(int[] nums) {
       int prefix[] = new int[nums.length];
       int sufix[] = new int[nums.length];
       int prod[] = new int[nums.length];
       int left = 1, right = 1;
       for(int i = 0; i < nums.length; i++)
       {
            prefix[i] = left;
            sufix[nums.length-1-i] = right;
            left = left*nums[i];
            right = right*nums[nums.length-1-i];
       }
       for(int i = 0; i < nums.length; i++)
       {
            prod[i] = prefix[i]*sufix[i];
       }
       return prod;
    }
}  
