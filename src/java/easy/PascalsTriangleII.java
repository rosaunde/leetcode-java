package easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> rows = new ArrayList(rowIndex+1);
        for(int i = 1; i <= rowIndex+1; i++){
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
        return rows.get(rowIndex);
    }
}
