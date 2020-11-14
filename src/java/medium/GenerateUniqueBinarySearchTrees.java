package medium;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class GenerateUniqueBinarySearchTrees {
    public List<TreeNode> generateTrees(int n) {
        if(n == 0){
            return new ArrayList<>();
        }

        return generatePossibleTrees(1, n);
    }

    public List<TreeNode> generatePossibleTrees(int start, int end){
        List<TreeNode> results = new ArrayList<>();
        if(start > end){
            results.add(null);
            return results;
        }

        for(int i = start; i <= end; i++){
            List<TreeNode> leftPossibilities = generatePossibleTrees(start, i-1);
            List<TreeNode> rightPossibilities = generatePossibleTrees(i+1, end);

            for(int j = 0; j < leftPossibilities.size(); j++){
                for(int k = 0; k < rightPossibilities.size(); k++){
                    results.add(new TreeNode(i, leftPossibilities.get(j), rightPossibilities.get(k)));
                }
            }
        }
        return results;
    }

}