package medium;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Triangle {
    Map<String,Integer> pathValues = new HashMap<>();
    public int minimumTotal(List<List<Integer>> triangle) {
        return minimumTriangle(0,0,triangle);
    }

    public int minimumTriangle(int level, int index, List<List<Integer>> triangle){
        if(level >= triangle.size()){
            return 0;
        }
        int left;
        String hash = String.valueOf(level) + "->" + String.valueOf(index);
        if(pathValues.get(hash) == null){
            left = minimumTriangle(level+1, index, triangle);
            pathValues.put(hash, left);
        } else{
            left = pathValues.get(hash);
        }

        int right;
        String hash2 = String.valueOf(level) + "->" + String.valueOf(index+1);
        if(pathValues.get(hash2) == null){
            right = minimumTriangle(level+1, index+1, triangle);
            pathValues.put(hash2, right);
        } else{
            right = pathValues.get(hash2);
        }
        int value = triangle.get(level).get(index);
        return value + Math.min(left,right);
    }
}