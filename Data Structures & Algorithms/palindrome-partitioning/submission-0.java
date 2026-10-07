class Solution {
    public List<List<String>> partition(String s) {
        var result = new ArrayList<List<String>>();
        dfs(result, s, 0, new ArrayList<>());
        return result;

    }

    private void dfs(List<List<String>> res, String s, int start, List<String> subString){
         if (start == s.length()) {
        res.add(subString);
        return;
            }
        for(int i =start; i<s.length();i++){
            var sub = s.substring(start,i+1);
            if(isPalindrom(sub)){
                subString.add(sub);
                dfs(res, s, i+1, new ArrayList(subString));
                subString.remove(subString.size()-1);      
            }
        
           
        }
         

       

        


    }

    private boolean isPalindrom(String s){
            var left =0;
            var right = s.length()-1;
            while(left<right){
                if(s.charAt(left) != s.charAt(right)) return false;
                left++;
                right--;
            }

            return true;

    }
}
