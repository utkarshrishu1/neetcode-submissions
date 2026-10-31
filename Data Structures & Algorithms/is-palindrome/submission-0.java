class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length()-1;
        while(left <= right)
        {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            if(!Character.isLetterOrDigit(leftChar))
            {
                left++;
            }
            if(!Character.isLetterOrDigit(rightChar))
            {
                right--;
            }
            if(Character.isLetterOrDigit(leftChar) &&             Character.isLetterOrDigit(rightChar))
            {
                if(Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar))
                {
                    return false;
                }
                else
                {
                    left++;
                    right--;
                }
            }
        }
        return true;
    }
}
