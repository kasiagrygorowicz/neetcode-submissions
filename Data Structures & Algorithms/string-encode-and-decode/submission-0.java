class Solution {

    public String encode(List<String> strs) {
        var delimiter = "#";
        StringBuilder sb = new StringBuilder();
        for(String word : strs){
            sb.append(word.length())
            .append(delimiter)
            .append(word);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        var result = new ArrayList<String>();
        int i = 0;
        while(i<str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }

            int wordLength = Integer.parseInt(str.substring(i,j));
            result.add(str.substring(j+1, j+1 + wordLength));

            i = j+1 + wordLength;
        }

        return result;
    }
}
