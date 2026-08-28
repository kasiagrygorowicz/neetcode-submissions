class Solution {
    public boolean isAnagram(String s, String t) {
    var mapS = new HashMap<Character,Integer>();
    var mapT = new HashMap<Character,Integer>();


    for(char c : s.toCharArray()){
        if(mapS.containsKey(c)){
            mapS.replace(c, mapS.get(c)+1); 
        }else{
            mapS.put(c,1);
        }
    
    }

      for(char c : t.toCharArray()){
        if(mapT.containsKey(c)){
            mapT.replace(c, mapT.get(c)+1); 
        }else{
            mapT.put(c,1);
        }
    }

    return mapS.equals(mapT);




    }
}
