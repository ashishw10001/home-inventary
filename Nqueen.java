package tech_verito;

public class Nqueen {
        public static void main(String[] args) {
            int[][] board = new int[6][6];
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if(i==0&&j==0)continue;
                    if (board[i][j] == 0) {
                        board[i][j] = 1;
                        marks(board, i, j);
                    }
                }
            }
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if(board[i][j]==5) System.out.print(0+" ");
                    else System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }

        }

        public static void marks(int[][] board, int r, int c) {
            for(int i=r+1;i<board.length;i++){
                board[i][c]=5;
            }
            for(int i=r-1;i>=0;i--){
                board[i][c]=5;
            }
            for(int j=c+1;j<board[0].length;j++){
                board[r][j]=5;
            }
            for(int j=c-1;j>=0;j--){
                board[r][j]=5;
            }
            for(int i=r+1,j=c+1;i<board.length&&j<board[0].length;i++,j++){
                board[i][j]=5;
            }
            for(int i=r+1,j=c-1;i<board.length&&j>=0;i++,j--){
                board[i][j]=5;
            }
            for(int i=r-1,j=c+1;i>=0&&j<4;i--,j++){
                board[i][j]=5;
            }
        }
}
