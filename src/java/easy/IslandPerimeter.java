package easy;

public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int depth = grid[0].length;
        int length = grid.length;
        System.out.println(length + "   " + depth);
        for(int i = 0; i<length; i++){
            for(int j = 0; j < depth; j++){
                if(grid[i][j] == 1){
                    if(i==0){
                        perimeter++;
                    } else if(grid[i-1][j] == 0){
                        perimeter++;
                    }

                    if(j==0){
                        perimeter++;
                    } else if(grid[i][j-1] == 0){
                        perimeter++;
                    }

                    if(i == length-1){
                        perimeter++;
                    } else if(grid[i+1][j] == 0){
                        perimeter++;
                    }

                    if(j == depth-1){
                        perimeter++;
                    } else if(grid[i][j+1] == 0){
                        perimeter++;
                    }
                }
            }
        }
        return perimeter;
    }
}