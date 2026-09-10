class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left  = 0;
        int right =0;

        var unique = new HashSet<Character>();
        int max =0;
        for(int i =0; i<s.length();i++){
            if(unique.contains(s.charAt(i))){
                while(left <= right){
                    if(s.charAt(i) == s.charAt(left)){
                        left++;
                        break;
                    }
                    unique.remove(s.charAt(left));
                    left++;
                    
                }
            }else{
            unique.add(s.charAt(i));
            
            }
            max = Math.max(max,right-left +1);
            right++;
        }

        return max;

    }
}
