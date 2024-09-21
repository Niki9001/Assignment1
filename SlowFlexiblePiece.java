public class SlowFlexiblePiece extends Piece{
    // constructor first
    public SlowFlexiblePiece (String name, String color, int[] position){
        super(name, color, position);
    }
    public void move(String direction){
        // same thing
        direction = direction.toLowerCase();
        int[] position = positionGetter();

        switch (direction){
            case "left":
                if (position[0] > 0){
                    position[0] = position[0] - 1;
                    setterPosition(position);
                }
                else {
                    System.out.println("out of range");
                }
                break;
            case "right":
                if (position[0] <= 6){
                    position[0] = position[0] + 1;
                    setterPosition(position);
                }
                else {
                    System.out.println("out of range");
                }
                break;
            case "up":
                if (position[1] > 0) {
                    position[1] = position[1] - 1;
                    setterPosition(position);
                }
                else {
                    System.out.println("out of range");
                }
                break;
            case "down":
                if (position[1] <= 6) {
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
        return "Slow Flexible Piece: \n" +
                "Name: " + nameGetter() + "\n" +
                "Color: " + colorGetter() + "\n" +
                "Position: [" + position[0] + "], [" + position[1] + "]";
    }
}
