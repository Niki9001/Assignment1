import java.util.Scanner;

public class GameDemo {
    public static void main(String[] args) {
        Board board = new Board(); // 初始化棋盘
        Scanner scanner = new Scanner(System.in);

        // 使用 while 循环持续处理用户输入
        while (true) {
            System.out.println("Enter a command (type help for details): ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equalsIgnoreCase("help")) {
                System.out.println("Possible commands as follow: \n"
                        + "create location [fast][flexible]: Creates a new piece.\n"
                        + "move location direction [spaces]: Moves a piece.\n"
                        + "print: Displays the board.\n"
                        + "help: Displays help.\n"
                        + "exit: Exits the program.");
            } else if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the game...");
                break;
            } else if (input.startsWith("create")) {
                handleCreate(board, input, scanner);
            } else if (input.startsWith("move")) {
                handleMovement(board, input);
            } else if (input.equalsIgnoreCase("print")) {
                board.boardShow();
            } else {
                System.out.println("Invalid command. Please try again.");
            }
        }

        scanner.close();
    }
    public static void handleCreate(Board board, String input, Scanner scanner) {
        String[] inputArray = input.split(" ");
        if (inputArray.length < 3) {
            System.out.println("Invalid command. Usage: create x y [fast|slow]");
            return;
        }

        int x = Integer.parseInt(inputArray[1]);
        int y = Integer.parseInt(inputArray[2]);

        boolean isFast = false;

        // TODO: 检查是否有 "fast" 或 "slow" 参数，希望只有这两个条件，要不然这下面要改
        for (int i = 3; i < inputArray.length; i = i + 1) {
            if (inputArray[i].equalsIgnoreCase("fast")) {
                isFast = true;
            }
        }

        // 询问用户输入棋子的名称和颜色
        System.out.println("Enter the name of the piece: ");
        String name = scanner.nextLine();
        System.out.println("Enter the color of the piece: ");
        String color = scanner.nextLine();

        Piece piece;
        if (isFast) {
            piece = new FastFlexiblePiece(name, color, new int[]{x, y});
        } else {
            piece = new SlowFlexiblePiece(name, color, new int[]{x, y});
        }

        board.movePiece(piece, new int[]{x, y});
    }

    public static void handleMovement(Board board, String input) {
        String[] inputArray = input.split(" ");
        if (inputArray.length < 4) {
            System.out.println("Invalid command. Usage: move x y direction [spaces]");
            return;
        }

        // 提取棋子的位置和方向
        int row = Integer.parseInt(inputArray[1]);
        int col = Integer.parseInt(inputArray[2]);
        String direction = inputArray[3].toLowerCase();

        int[] position = {row, col};  // 当前棋子的坐标
        Piece piece = board.getPieceAtPosition(position);

        if (piece == null) {
            System.out.println("No piece found at position (" + row + "," + col + ")");
            return;
        }

        // 如果是 FastFlexiblePiece
        if (piece instanceof FastFlexiblePiece) {
            if (inputArray.length == 5) {
                int spaces = Integer.parseInt(inputArray[4]);

                // 移动前先移除旧位置的棋子
                board.removePiece(position);

                // 调用 FastFlexiblePiece 的移动方法
                ((FastFlexiblePiece) piece).move(direction, spaces);

                // 获取更新后的位置
                int[] newPosition = piece.positionGetter();

                // 在新位置放置棋子
                board.movePiece(piece, newPosition);

                System.out.println("Moved " + piece.nameGetter() + " " + direction + " by " + spaces + " spaces.");
            } else {
                System.out.println("Invalid command. Fast flexible pieces require a number of spaces to move.");
            }
        }
        // 如果是 SlowFlexiblePiece
        else if (piece instanceof SlowFlexiblePiece) {
            board.removePiece(position);
            ((SlowFlexiblePiece) piece).move(direction);
            int[] newPosition = piece.positionGetter();
            board.movePiece(piece, newPosition);
            System.out.println("Moved " + piece.nameGetter() + " " + direction + ".");
        } else {
            System.out.println("Invalid move command.");
        }
    }


    //        dealWithInput(board,scanner);

//        scanner.close();
//    }
//    public static void dealWithInput(Board board, Scanner scanner){
//        System.out.println("Please input a command or input HELP for helping: ");
//        String input = scanner.nextLine();
//
//        if(input.contains("create")){
//
//        } else if (input.contains("move")) {
//
//        } else if (input.contains("help")) {
//
//        } else if (input.contains("exit")) {
//
//        }
//        else {
//            System.out.println("Please try it again.");
//        }
//        dealWithInput(board,scanner);
//    }

}
