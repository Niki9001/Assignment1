public class SlowPiece extends Piece{
    public void move(String direction){
        // to adapt both upper and lower case
        direction = direction.toLowerCase();
        switch (direction){
            case "left":
                if (positionGetter()[0] > 0){

                }
                break;

            case "right":
                if (positionGetter()[0]<=6){

                }
                break;

        }

    }
}
