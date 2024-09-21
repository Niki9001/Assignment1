public class SlowPiece extends Piece {
    public void move(String direction){
        // to adapt both upper and lower case
        direction = direction.toLowerCase();
        switch (direction){
            case "left":
                if (positionGetter()[0] > 0){
                    int x = position[0];
                    x = x - 1;
                    position[0] = x;
                    setterPosition(position);
                }
                else {
                    System.out.println("out of range");
                }
                break;

            case "right":
                if (positionGetter()[0]<=6){
                    int x = position[0];
                    x = x +1;
                    position[0] = x;
                    setterPosition(position);
                }
                else {
                    System.out.println("out of range");
                }
                break;

        }

    }
}
