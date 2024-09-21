public class main {
    public static void main(String[] args){
        int[] position = {3,4};
        SlowPiece slowPiece = new SlowPiece("someone","white",position);
        System.out.println(slowPiece);

        //slowPiece.move("left");
        //System.out.println(slowPiece);

        slowPiece.move("right");
        System.out.println(slowPiece);
    }
}
