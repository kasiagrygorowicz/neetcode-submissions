class Solution {
    public boolean isPalindrome(String s) {
    var l = 0;
    var r = s.length()-1;

    while(l<r){
        while(l<r && !Character.isLetterOrDigit(s.charAt(l))){
            l++;
        }

        while(r>l && !Character.isLetterOrDigit(s.charAt(r))){
            r--;
        }

        if(Character.toLowerCase(s.charAt(l))!= Character.toLowerCase(s.charAt(r))){
            return false;
        }

        l++; r--;
    
    }
    return true;
    }
}
