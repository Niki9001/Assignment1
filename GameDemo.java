import java.util.Scanner;

public class GameDemo {
    public static void main(String[] args) {
        Board board = new Board(); // 初始化棋盘
        Scanner scanner = new Scanner(System.in);

        // 使用 while 循环持续处理用户输入
        while (true) {
            System.out.println("Enter a command (type help for details): ");
            String input = scanner.nextLine().trim().toLowerCase();

            // 判断用户输入的命令
            if (input.equalsIgnoreCase("help")) {
                // 输出帮助信息
                System.out.println("Possible commands as follow: \n"
                        + "create location [fast][flexible]: Creates a new piece.\n"
                        + "move location direction [spaces]: Moves a piece.\n"
                        + "print: Displays the board.\n"
                        + "help: Displays help.\n"
                        + "Exits the program.");
            } else if (input.equalsIgnoreCase("exit")) {
                // 退出程序
                System.out.println("Exiting the game...");
                break;  // 跳出循环，结束程序
            } else if (input.startsWith("create")) {
                // 处理创建棋子的逻辑
                System.out.println("Creating a piece...");
                handleCreate(board,input,scanner);
                // 这里可以加入具体的逻辑来处理棋子创建
            } else if (input.startsWith("move")) {
                // 处理移动棋子的逻辑
                System.out.println("Moving a piece...");
                handleMovement(board, input);
                // 这里可以加入具体的逻辑来处理棋子移动
            } else if (input.equalsIgnoreCase("print")) {
                // 打印当前棋盘的状态
                board.boardShow();
            } else {
                // 如果用户输入的命令无效
                System.out.println("Invalid command. Please try again.");
            }
        }

        scanner.close();
    }
    public static void handleCreate(Board board, String input, Scanner scanner) {
        String[] inputArray = input.split(" ");
        if (inputArray.length < 3) {
            System.out.println("Invalid command. Usage: create x y [fast] [flexible]");
            return;
        }

        // 将输入的 x 和 y 转换为整数
        int x = Integer.parseInt(inputArray[1]);
        int y = Integer.parseInt(inputArray[2]);

        // 默认棋子的属性
        boolean isFast = false;
        boolean isFlexible = false;

        // 检查是否有 "fast" 或 "flexible" 参数
        for (int i = 3; i < inputArray.length; i++) {
            if (inputArray[i].equalsIgnoreCase("fast")) {
                isFast = true;
            } else if (inputArray[i].equalsIgnoreCase("flexible")) {
                isFlexible = true;
            }
        }

        // 询问用户输入棋子的名称和颜色
        System.out.println("Enter the name of the piece: ");
        String name = scanner.nextLine();
        System.out.println("Enter the color of the piece: ");
        String color = scanner.nextLine();

        // 创建适当类型的棋子
        Piece piece;
        if (isFast && isFlexible) {
            piece = new FastFlexiblePiece(name, color, new int[]{x, y});
        } else if (isFast) {
            piece = new FastPiece(name, color, new int[]{x, y});
        } else if (isFlexible) {
            piece = new SlowFlexiblePiece(name, color, new int[]{x, y});
        } else {
            piece = new SlowPiece(name, color, new int[]{x, y});
        }

        // 将棋子放置到棋盘上
        board.movePiece(piece, new int[]{x, y});
    }

    public static void handleMovement(Board board, String input) {
        String[] inputArray = input.split(" ");
        if (inputArray.length < 4) {
            System.out.println("Invalid command. Usage: move x y direction [spaces]");
            return;
        }

        // 提取棋子的位置和方向
        int x = Integer.parseInt(inputArray[1]);
        int y = Integer.parseInt(inputArray[2]);
        String direction = inputArray[3].toLowerCase();

        // 获取棋子
        int[] position = {x, y};
        Piece piece = board.getPieceAtPosition(position);
        if (piece == null) {
            System.out.println("No piece found at position (" + x + "," + y + ")");
            return;
        }

        // 检查是否为 FastPiece，并处理 spaces 参数
        if (piece instanceof FastPiece) {
            if (inputArray.length == 5) {
                try {
                    int spaces = Integer.parseInt(inputArray[4]);
                    ((FastPiece) piece).move(direction, spaces);
                    System.out.println("Moved " + piece.nameGetter() + " " + direction + " by " + spaces + " spaces.");
                } catch (NumberFormatException e) {
                    System.out.println("Invalid spaces value. It should be a number.");
                }
            } else {
                System.out.println("Invalid command. Fast pieces require a number of spaces to move.");
            }
        } else if (piece instanceof SlowPiece) {
            // 如果是 SlowPiece，不需要步数
            ((SlowPiece) piece).move(direction);
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
