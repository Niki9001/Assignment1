import java.util.Scanner;

public class GameDemo {
    public static void main(String[] args){
        Board board = new Board();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please input a command or input HELP for help: ");
            String input = scanner.nextLine()

            if (input.equalsIgnoreCase("help")) {
                System.out.println("Available commands: \n"
                        + "create [x] [y] [type] [flexible] - Create a piece at the specified location\n"
                        + "move [x] [y] [direction] [spaces] - Move a piece from the specified location\n"
                        + "print - Display the board\n"
                        + "exit - Exit the game");
            } else if (input.equalsIgnoreCase("exit")) {
                // 退出程序
                System.out.println("Exiting the game...");
                break;  // 跳出循环，结束程序
            } else if (input.contains("create")) {
                // 处理创建棋子的逻辑
                System.out.println("Creating a piece...");
                // 在这里处理创建棋子的具体代码
            } else if (input.contains("move")) {
                // 处理移动棋子的逻辑
                System.out.println("Moving a piece...");
            } else if (input.equalsIgnoreCase("print")) {
                // 打印棋盘
                board.boardShow();
            } else {
                System.out.println("Invalid command. Please try again.");
            }
        }

        scanner.close(); // 关闭 Scanner 资源
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
