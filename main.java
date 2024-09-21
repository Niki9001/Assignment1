public class main {
    public static void main(String[] args){
        int[] position = {3,4};
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



        FastFlexiblePiece fastFlexiblePiece = new FastFlexiblePiece("fastFlex", "Black", position);

        System.out.println(fastFlexiblePiece);

        // 测试向上移动 3 步
        fastFlexiblePiece.move("down", 5);
        System.out.println("After moving down 3 steps fast:");
        System.out.println(fastFlexiblePiece);
    }


}
