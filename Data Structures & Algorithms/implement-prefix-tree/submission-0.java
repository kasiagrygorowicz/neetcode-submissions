class PrefixTree {

    private TrieNode root;

    public PrefixTree() {
         root = new TrieNode();
    }

    public void insert(String word) {
        var current = this.root;
        for(char c: word.toCharArray()){
             int i = c-'a';
            if(current.children[i] == null){
                current.children[i] = new TrieNode();
            }
            current = current.children[i];
        }
        current.isEndWord = true;
    }

    public boolean search(String word) {
        var current = root;
        for(char c : word.toCharArray()){
            int i = c-'a';
            if(current.children[i] == null){
                return false;
            }
            current = current.children[i];
        }
        return current.isEndWord;
    }

    public boolean startsWith(String prefix) {
        var current = root;
        for(char c : prefix.toCharArray()){
            int i = c-'a';
            if(current.children[i] == null){
                return false;
            }
        current = current.children[i];
        }
        return true;
    }

    class TrieNode {
        boolean isEndWord = false;;
        TrieNode[] children = new TrieNode[26];
    }
}
