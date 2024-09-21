public class main {
    public static void main(String[] args){
//        int[] position = {3,4};
//        SlowPiece slowPiece = new SlowPiece("someone","white",position);
//        System.out.println(slowPiece);

        //slowPiece.move("left");
        //System.out.println(slowPiece);

        //slowPiece.move("right");
        //System.out.println(slowPiece);


//        FastPiece fastPiece = new FastPiece("someFast","black",position);
//        fastPiece.move("Left",3);
//        System.out.println(fastPiece);
//
//
//        SlowFlexiblePiece slowFlexiblePiece = new SlowFlexiblePiece("slowFlex", "White", position);
//
//        System.out.println(slowFlexiblePiece);
//
//        // 测试向上移动
//        slowFlexiblePiece.move("down");
//        System.out.println("After moving up:");
//        System.out.println(slowFlexiblePiece);



//        FastFlexiblePiece fastFlexiblePiece = new FastFlexiblePiece("fastFlex", "Black", position);
//
//        System.out.println(fastFlexiblePiece);
//
//        // 测试向上移动 3 步
//        fastFlexiblePiece.move("down", 5);
//        System.out.println("After moving down 3 steps fast:");
//        System.out.println(fastFlexiblePiece);
        Board board = new Board();

        // 创建棋子
        int[] position1 = {3, 3};
        SlowPiece slowPiece = new SlowPiece("boardTest", "White", position1);

        // 将棋子放在棋盘上
        board.movePiece(slowPiece, position1);

        // 打印棋盘状态
        board.boardShow();

        // 移除棋子并打印棋盘状态
        board.removePiece(position1);
        System.out.println("After removing the piece:");
        board.boardShow();
    }


}
