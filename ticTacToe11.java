import java.util.Scanner;
public class ticTacToe11
{
    public static void main (String[] args){
        Scanner scanning = new Scanner(System.in);

        board game = new board();

        while (true) {
            game.boardDisplay();
            System.out.println();
            System.out.println("-- PLAYER 1 --");
            System.out.println("ROW: ");
            int row = scanning.nextInt() - 1;
            System.out.println("COLUMN: ");
            int column = scanning.nextInt() - 1;
            game.changeBoardDisplay(row, column, "X");
                if (game.ifWon("X") || game.ifFull()){
                    break;
                }

            game.boardDisplay();
            System.out.println();
            System.out.println("-- PLAYER 2 --");
            System.out.println("ROW: ");
            int row2 = scanning.nextInt() - 1;
            System.out.println("COLUMN: ");
            int column2 = scanning.nextInt() - 1;
            game.changeBoardDisplay(row2, column2, "O");
                if (game.ifWon("O") || game.ifFull()){
                break;
                }
        }

        game.boardDisplay();
        System.out.println();

        if (game.ifWon("X"))
            System.out.print("PlAYER 1 WON!");
        else if (game.ifWon("O"))
            System.out.println("PlAYER 2 WON!");
        else if(game.ifFull()){
            System.out.println("TIED - NO ONE WON!");
        }
    }
}
