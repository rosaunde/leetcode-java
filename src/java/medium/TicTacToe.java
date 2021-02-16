package medium;

public class TicTacToe {

    private int[][] board;
    /** Initialize your data structure here. */
    public TicTacToe(int n) {
        board = new int[n][n];
    }

    /** Player {player} makes a move at ({row}, {col}).
     @param row The row of the board.
     @param col The column of the board.
     @param player The player, can be either 1 or 2.
     @return The current winning condition, can be either:
     0: No one wins.
     1: Player 1 wins.
     2: Player 2 wins. */
    public int move(int row, int col, int player) {
        board[row][col] = player;
        if(row == col || row+col==board.length-1){
            if(wonDiagonal(player)){
                return player;
            }
        }

        if(wonHorizontal(row, player)){
            return player;
        }


        if(wonVertical(col, player)){
            return player;
        }

        return 0;
    }

    private boolean wonVertical(int col, int player){
        for(int i = 0; i<board.length; i++){
            if(board[i][col] != player){
                return false;
            }
        }
        return true;
    }

    private boolean wonHorizontal(int row, int player){
        for(int i = 0; i<board.length; i++){
            if(board[row][i] != player){
                return false;
            }
        }
        return true;
    }

    private boolean wonDiagonal(int player){
        boolean wonDiagonal1 = true;
        boolean wonDiagonal2 = true;
        for(int i = 0; i < board.length; i++){
            if(wonDiagonal1 && board[i][i] != player){
                wonDiagonal1 = false;
            }
            if(wonDiagonal2 && board[i][board.length-1-i] != player){
                wonDiagonal2 = false;
            }
            if(!wonDiagonal1 && !wonDiagonal2){
                return false;
            }
        }
        return true;
    }
}

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */