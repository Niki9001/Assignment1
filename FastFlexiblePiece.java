public class FastFlexiblePiece extends Piece {
    public FastFlexiblePiece(String name, String color, int[] position) {
        super(name, color, position);
    }

    public void move(String direction, int n) {
        direction = direction.toLowerCase();
        int[] position = positionGetter(); // 获取当前位置
        int row = position[0];  // 对应行 (x)，从上往下数
        int col = position[1];  // 对应列 (y)，从左往右数

        switch (direction) {
            case "left":
                if (col - n >= 0) {  // 左移时，更新列 (y)
                    col = col - n;
                } else {
                    System.out.println("IT IS OUT OF RANGE, THE POSITION WILL NOT BE CHANGED!");
                }
                break;

            case "right":
                if (col + n <= 7) {  // 右移时，更新列 (y)
                    col = col + n;
                } else {
                    System.out.println("IT IS OUT OF RANGE, THE POSITION WILL NOT BE CHANGED!");
                }
                break;

            case "up":
                if (row - n >= 0) {  // 上移时，更新行 (x)
                    row = row - n;
                } else {
                    System.out.println("IT IS OUT OF RANGE, THE POSITION WILL NOT BE CHANGED!");
                }
                break;

            case "down":
                if (row + n <= 7) {  // 下移时，更新行 (x)
                    row = row + n;
                } else {
                    System.out.println("IT IS OUT OF RANGE, THE POSITION WILL NOT BE CHANGED!");
                }
                break;

            default:
                System.out.println("Invalid direction! Please use 'left', 'right', 'up', or 'down'.");
                return;
        }

        // 更新坐标
        int[] newPosition = {row, col};
        setterPosition(newPosition);
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
