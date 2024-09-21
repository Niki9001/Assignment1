import java.util.Scanner;

public class GameDemo {
    public static void main(String[] args){
        Board board = new Board();
        Scanner scanner = new Scanner(System.in);
    }
    public static void dealWithInput(Board board, Scanner scanner){
        System.out.println("Please input a command or input HELP for helping: ");
        String input = scanner.nextLine();

        if(input.contains("create")){

        } else if (input.contains("move")) {

        } else if (input.contains("help")) {

        } else if (input.contains("exit")) {

        }
        else {
            System.out.println("Please try it again.");
        }
        dealWithInput(board,scanner);
    }
}
