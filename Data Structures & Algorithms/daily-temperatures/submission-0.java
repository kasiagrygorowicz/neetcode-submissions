class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        var result = new int[temperatures.length];
        var stack = new Stack<Integer>();
        for(int i =0; i< temperatures.length;i++){
            if(stack.isEmpty()){
                stack.push(i);
                continue;
            }

            if(temperatures[i] > temperatures[stack.peek()]){
                while(!stack.isEmpty() &&  temperatures[stack.peek()]< temperatures[i]){
                result[stack.peek()] = i - stack.peek();
                stack.pop();
                }
            }

            stack.push(i);

        }

        return result;
    }
}
