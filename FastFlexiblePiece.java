public class FastFlexiblePiece extends Piece{
    public FastFlexiblePiece (String name, String color, int[] position){
        super(name, color, position);
    }
    public void move(String direction, int n){
        direction = direction.toLowerCase();
        int[] position = positionGetter();

        switch (direction){
            case "left":
                break;
            case "right":
                break;
            case "up":
                break;
            case "down":
                break;
        }
    }
    @Override
    public String toString() {
        int[] position = positionGetter();
        return "Fast Flexible Piece: \n" +
                "Name: " + nameGetter() + "\n" +
                "Color: " + colorGetter() + "\n" +
                "Position: [" + position[0] + "], [" + position[1] + "]";
    }
}
