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
                if (position[1] > 0){
                    position[1] = position[1] - 1;
                    setterPosition(position);
                }
                else {
                    System.out.println("IT IS OUT OF RANGE, THE POSITION WILL NOT BE CHANGED!");
                }
                break;
            case "right":
                if (position[1] <= 7){
                    position[1] = position[1] + 1;
                    setterPosition(position);
                }
                else {
                    System.out.println("IT IS OUT OF RANGE, THE POSITION WILL NOT BE CHANGED!");
                }
                break;
            case "up":
                if (position[0] > 0) {
                    position[0] = position[0] - 1;
                    setterPosition(position);
                }
                else {
                    System.out.println("IT IS OUT OF RANGE, THE POSITION WILL NOT BE CHANGED!");
                }
                break;
            case "down":
                if (position[0] <= 7) {
                    position[0] = position[0] + 1;
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
        return "Slow Flexible Piece: \n" +
                "Name: " + nameGetter() + "\n" +
                "Color: " + colorGetter() + "\n" +
                "Position: [" + position[0] + "], [" + position[1] + "]";
    }
}
