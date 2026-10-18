class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++)
        {
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);

            if(map.containsKey(s1))
            {
                map.put(s1, map.get(s1)+1);
                if(map.get(s1) == 0)
                    map.remove(s1);
            }
            else
            {
                map.put(s1, 1);
            }

            if(map.containsKey(t1))
            {
                map.put(t1, map.get(t1)-1);
                if(map.get(t1) == 0)
                    map.remove(t1);
            }
            else
            {
                map.put(t1, -1);
            }
        }
        return map.size() == 0 ? true : false;
    }
}
