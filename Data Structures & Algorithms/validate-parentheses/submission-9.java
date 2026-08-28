class Solution {
    public boolean isValid(String s) {
        var stack = new Stack<Character>();
        var map = new HashMap<Character,Character>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');

        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                stack.push(c);
            } else if (map.containsValue(c)){
                if(stack.isEmpty() || !map.get(stack.peek()).equals(c)){
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();

    }
}
