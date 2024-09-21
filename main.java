public class main {
    public static void main(String[] args){
        int[] position = {3,4};
        SlowPiece slowPiece = new SlowPiece("someone","white",position);
        System.out.println(slowPiece);

        //slowPiece.move("left");
        //System.out.println(slowPiece);

        //slowPiece.move("right");
        //System.out.println(slowPiece);


        FastPiece fastPiece = new FastPiece("someFast","black",position);
        fastPiece.move("Left",3);
        System.out.println(fastPiece);


        SlowFlexiblePiece slowFlexiblePiece = new SlowFlexiblePiece("Knight", "White", position);

        System.out.println(slowFlexiblePiece);

        // 测试向上移动
        slowFlexiblePiece.move("down");
        System.out.println("After moving up:");
        System.out.println(slowFlexiblePiece);
    }


}
