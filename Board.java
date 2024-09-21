public class Board {
    Piece[][] board;
    public Board(){
        board = new Piece[8][8];
    }
    public void movePiece(Piece piece, int[] position){
        int x = position[0];
        int y = position[1];
        if (x >= 0 && x <= 7 && y >= 0 && y <= 7){
            board[x][y] = piece;
            System.out.println("Assigned " + piece.nameGetter() + " to position [" + x + "][" + y + "]");
        }
        else {
            System.out.println("out of range");
        }
    }

    public void removePiece(int[] position){
        int x = position[0];
        int y = position[1];
        if (x >= 0 && x <= 7 && y >= 0 && y <= 7){


        }
        else {

        }
    }
}
