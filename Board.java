public class Board {
    Piece[][] board;

    public Board() {
        board = new Piece[8][8];
        // 初始化每个位置为 EmptyPosition 占位符
        for (int i = 0; i <= 7; i = i + 1) {
            for (int j = 0; j <= 7; j = j + 1) {
                board[i][j] = null ;
            }
        }
    }

    public void movePiece(Piece piece, int[] position) {
        int x = position[0];
        int y = position[1];
        if (x >= 0 && x <= 7 && y >= 0 && y <= 7) {
            board[x][y] = piece;  // 将棋子放置到新的位置
            System.out.println("Assigned " + piece.nameGetter() + " to position [" + x + "][" + y + "]");
        } else {
            System.out.println("Position out of range");
        }
    }

    public void removePiece(int[] position) {
        int x = position[0];
        int y = position[1];
        if (x >= 0 && x <= 7 && y >= 0 && y <= 7) {
            board[x][y] = null;  // 设置为空位置
            System.out.println("Removed piece from position [" + x + "][" + y + "]");
        } else {
            System.out.println("Position out of range");
        }
    }

    public void boardShow() {
        for (int i = 0; i <= 7; i = i + 1) {
            for (int j = 0; j <= 7; j = j + 1) {
                if (board[i][j] == null) {
                    System.out.print(" - ");
                } else {
                    System.out.print(" " + board[i][j].nameGetter() + board[i][j].colorGetter() + "FF ");
                }
            }
            System.out.println();
        }
    }

    public Piece getPieceAtPosition(int[] position) {
        int x = position[0];
        int y = position[1];
        if (x >= 0 && x <= 7 && y >= 0 && y <= 7) {
            return board[x][y];
        } else {
            System.out.println("Position out of range");
            return null;
        }
    }

}
