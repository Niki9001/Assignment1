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
                else{
                    System.out.println("IT IS OUT OF RANGE, THE POSITION WILL NOT BE CHANGED!");
                }
                break;
            case "right":
                if (position[0] + n <= 7){
                    position[0] = position[0] + n;
                    setterPosition(position);
                }
                else {
                    System.out.println("IT IS OUT OF RANGE, THE POSITION WILL NOT BE CHANGED!");
                }
                break;
        }

    }
    @Override
    public String toString() {
        int[] position = positionGetter();
        return "Slow Piece: \n" +
                "Name: " + nameGetter() + "\n" +
                "Color: " + colorGetter() + "\n" +
                "Position: [" + position[0] + "], [" + position[1] + "]";
    }

}
