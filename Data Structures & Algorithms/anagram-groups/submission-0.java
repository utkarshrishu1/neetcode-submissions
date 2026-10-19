class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupedAnagrams = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++)
        {
            String arr[] = strs[i].split("");
            Arrays.sort(arr);
            String s = Arrays.toString(arr);
            if(map.containsKey(s))
            {
                map.get(s).add(strs[i]);
            }
            else
            {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(s, list);
            }
        }
        for(Map.Entry<String, List<String>> m:map.entrySet())
        {
            List<String> list = m.getValue();
            groupedAnagrams.add(list);
        }
        return groupedAnagrams;
    }
}
