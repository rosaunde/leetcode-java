package easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rows = new ArrayList(numRows);

        for(int i = 1; i <= numRows; i++){
            List<Integer> row = new ArrayList(i);
            row.add(0,1);
            if(i != 1){
                row.add((row.size() - 1),1);
            }
            if(i <= 2){
                rows.add(row);
                continue;
            }
            for(int j = 1; j<i-1; j++){
                row.add(j,(rows.get(i-2).get(j-1) + rows.get(i-2).get(j)));
            }
            rows.add(row);
        }
        return rows;
    }
}