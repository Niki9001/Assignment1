public class Board {
    Piece[][] board;

    // 构造函数，初始化棋盘，所有位置都设置为 EmptyPosition
    public Board() {
        board = new Piece[8][8];
        // 初始化每个位置为 EmptyPosition 占位符
        for (int i = 0; i <= 7; i = i + 1) {
            for (int j = 0; j <= 7; j = j + 1) {
                board[i][j] = new EmptyPostion();  // 初始化为空位置
            }
        }
    }

    // 移动棋子到指定位置
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

    // 从指定位置移除棋子，将该位置设置为 EmptyPosition
    public void removePiece(int[] position) {
        int x = position[0];
        int y = position[1];
        if (x >= 0 && x <= 7 && y >= 0 && y <= 7) {
            board[x][y] = new EmptyPostion();  // 设置为空位置
            System.out.println("Removed piece from position [" + x + "][" + y + "]");
        } else {
            System.out.println("Position out of range");
        }
    }

    // 打印当前棋盘状态
    public void boardShow() {
        for (int i = 0; i <= 7; i = i + 1) {
            for (int j = 0; j <= 7; j = j + 1) {
                if (board[i][j] instanceof EmptyPostion) {
                    System.out.print("[ ]");  // 如果是空棋子，显示空白
                } else {
                    System.out.print("[" + board[i][j].nameGetter().charAt(0) + "]");  // 显示棋子的首字母
                }
            }
            System.out.println();
        }
    }
}
