class Solution {
    public List<String> generateParenthesis(int n) {
        var result = new ArrayList<String>();
        var open = 0;
        var closed =0;
        addParentheses(result, 0,0,new String(), n);
        return result;
       


    }

    private void addParentheses(List<String> res, int open, int closed, String s, int n){
    
        if(open < n){
            addParentheses(res, open+1, closed, s + '(',n);
           
        }

        if(closed < open){
            addParentheses(res, open, closed+1, s + ')',n);
        }

        if(open == closed && open == n){
            res.add(s);
        }

    }
}
