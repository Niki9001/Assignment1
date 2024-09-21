import java.util.Scanner;

public class GameDemo {
    public static void main(String[] args) {
        Board board = new Board(); // 初始化棋盘
        Scanner scanner = new Scanner(System.in); // 创建 Scanner 对象用于获取用户输入

        // 使用 while 循环持续处理用户输入
        while (true) {
            System.out.println("Enter a command (type help for details): ");
            String input = scanner.nextLine().trim(); // 获取输入并去掉空格

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
            } else if (input.equalsIgnoreCase("create")) {
                // 处理创建棋子的逻辑
                System.out.println("Creating a piece...");
                // 这里可以加入具体的逻辑来处理棋子创建
            } else if (input.equalsIgnoreCase("move")) {
                // 处理移动棋子的逻辑
                System.out.println("Moving a piece...");
                // 这里可以加入具体的逻辑来处理棋子移动
            } else if (input.equalsIgnoreCase("print")) {
                // 打印当前棋盘的状态
                board.boardShow(); // 假设 boardShow 是 Board 类中显示棋盘的方法
            } else {
                // 如果用户输入的命令无效
                System.out.println("Invalid command. Please try again.");
            }
        }

        scanner.close();
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
