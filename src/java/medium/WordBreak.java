package medium;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        // Set
        Set<String> wordSet = new HashSet<>(wordDict);
        Boolean[] visited = new Boolean[s.length()+1];
        int index = 0;
        return dfs(s, wordSet, index, visited);
    }
    private boolean dfs(String s, Set<String> wordSet, int index, Boolean[] visited){
        // succeed!
        if(index == s.length()) return true;
        if(visited[index]!=null) return visited[index];
        // processing ...
        for(int i=index; i<s.length(); i++){
            if(visited[i+1]!=null && visited[i+1]) return visited[i+1];
            if(wordSet.contains(s.substring(index, i+1))){
                if(dfs(s, wordSet, i+1, visited)) {
                    visited[i+1] = true;
                    return true;
                }
                else visited[i+1] = false;
            }
        }
        visited[index] = false;
        return false;
    }

}