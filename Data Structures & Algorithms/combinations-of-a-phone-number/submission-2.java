class Solution {
    private final Map<Character, String> map= new HashMap(Map.of('2',"abc",'3',"def", '4', "ghi", '5', "jkl",'6',"mno", '7', "pqrs", '8', "tuv", '9', "wxyz"));
    public List<String> letterCombinations(String digits) {
        var res = new ArrayList<String>();
       if(digits.isEmpty()) return res;
       backtract(digits, res, "", 0);
       return res;

    
    }

    private void backtract(String digits,List<String> result, String combination, int index){
        if(digits.length() == combination.length()){
            result.add(combination);
            return;
        }

        var digit = digits.charAt(index);
        var characters = map.get(digit);
        for(int i =0; i < characters.length();i++){
            var tmp = new String(combination);
            tmp += characters.charAt(i);
            backtract(digits, result, tmp, index+1);
        }
    }
}
