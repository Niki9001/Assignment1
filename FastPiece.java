public class FastPiece extends Piece{
    //add constructor first
    public FastPiece(String name, String color, int[] position){
        super(name,color,position);
    }

    public void move(String direction, int n){
        // set everything to lower case
        direction = direction.toLowerCase();
        int[] position = positionGetter();

        switch (direction){
            case "left":
                if (position[0] - n >= 0){
                    position[0] = position[0] - n;
                    setterPosition(position);
                }
                break;
            case "right":
                break;
        }

    }

}
