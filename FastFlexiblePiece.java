public class FastFlexiblePiece extends Piece{
    public FastFlexiblePiece (String name, String color, int[] position){
        super(name, color, position);
    }
    public void move(String direction, int n){
        direction = direction.toLowerCase();
        int[] position = positionGetter();

        switch (direction){
            case "left":
                if (position[0] - n >= 0){
                    position[0] = position[0] - n;
                    setterPosition(position);
                }
                else {
                    System.out.println("out of range");
                }
                break;

            case "right":
                if (position[0] + n <= 6){
                    position[0] = position[0] + 1;
                    setterPosition(position);
                }
                else {
                    System.out.println("out of range");
                }
                break;

            case "up":
                if (position[1] - n >= 0){
                    position[1] = position[1] - n;
                    setterPosition(position);
                }
                else {
                    System.out.println("out of range");
                }
                break;

            case "down":
                if (position[1] + n <= 6){
                    position[1] = position[1] + 1;
                    setterPosition(position);
                }
                else {
                    System.out.println("out of range");
                }
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
