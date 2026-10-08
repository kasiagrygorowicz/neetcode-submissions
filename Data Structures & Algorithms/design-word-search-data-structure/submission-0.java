class WordDictionary {
    private TrieNode root;
    

    public WordDictionary() {
            root = new TrieNode();
    }

    public void addWord(String word) {
        var current = root;
        for(char c : word.toCharArray()){
            if(current.children[c-'a']==null){
                current.children[c-'a'] = new TrieNode();
            }
            current= current.children[c-'a'];
        }
        current.word = true;
    }

    public boolean search(String word) {
       return dfs(root, 0, word);
    }

    public boolean dfs(TrieNode node, int index, String word){
        var current = node;
        for(int i = index; i< word.length();i++){
            if(word.charAt(i) == '.'){
                for(TrieNode c : current.children){
                    if(c == null) continue;
                    if(dfs(c, i + 1, word)){
                        return true;
                    }
                }
                return false;
            }else if(current.children[word.charAt(i) - 'a'] == null){
                return false;
            }
            current = current.children[word.charAt(i) - 'a'];
        }
        return current.word;
    }

}



public class TrieNode {

    TrieNode[] children;
    boolean word;

    public TrieNode() {
        children = new TrieNode[26];
        word = false;
    }
}
