class Solution {
    public boolean isValid(String s) {
        var stack = new Stack<Character>();
        for(char c :  s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']'){
                if(!stack.isEmpty()){
                
                    if( '(' == stack.peek() && c == ')' || '{' == stack.peek() && c == '}' || '[' == stack.peek() && c == ']'){
                        stack.pop();
                    }else{
                        return false;
                    }
                }else{
                    return false;
                }
            }


        }

        return stack.isEmpty();

    }
}
