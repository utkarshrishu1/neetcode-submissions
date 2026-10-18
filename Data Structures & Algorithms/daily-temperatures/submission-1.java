class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Node> stack = new Stack<>();
        int result[] = new int[temperatures.length];
        for(int i = temperatures.length-1; i >= 0; i--)
        {
            int currTemp = temperatures[i];
            while(!stack.isEmpty() && stack.peek().temp <= currTemp)
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                result[i] = 0;
            }
            else
            {
                result[i] = stack.peek().index-i;
            }
            stack.push(new Node(i, currTemp));
        }
        return result;
    }
}
class Node{
    int index, temp;
    Node(int index, int temp)
    {
        this.index = index;
        this.temp = temp;
    }
}
