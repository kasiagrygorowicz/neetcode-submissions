class Solution {
    public int evalRPN(String[] tokens) {
       
        var operators = new HashSet<String>(List.of("+","-","*","/"));
        var stack = new Stack<Integer>();


        for(String t : tokens){
            if(operators.contains(t)){
                var right = stack.pop();
                var left = stack.pop();
                int result;
                if(t.equals("+")){
                    result = left + right;
                }else if (t.equals("-")){
                    result = left-right;
                }else if (t.equals("*")){
                    result = left *right;
                }else{
                    result = left/right;
                }
                stack.push(result);

            }else{
                stack.push(Integer.valueOf(t));
            }
        }

        return stack.pop();

        

    }
}
