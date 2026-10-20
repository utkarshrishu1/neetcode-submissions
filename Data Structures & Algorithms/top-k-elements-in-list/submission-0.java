class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i], map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i], 1);
            }
        }
        ArrayList<Node> list = new ArrayList<>();
        int arr[] = new int[k];
        for(Map.Entry<Integer, Integer> m:map.entrySet())
        {
            list.add(new Node(m.getKey(), m.getValue()));
        }
        Collections.sort(list, (n1, n2)->{
            return Integer.compare(n2.occ, n1.occ);
        });
        for(int i = 0; i < k; i++)
            arr[i] = list.get(i).key;
        return arr;
    }
}
class Node
{
    int key, occ;
    Node(int key, int occ)
    {
        this.key = key;
        this.occ = occ;
    }
}
