public class board
{
    String [][] boardContents = new String[3][3];

    board(){
        for (int y = 0; y < boardContents.length; y++){
            System.out.println();
            for (int x = 0; x < boardContents.length; x++){
                boardContents[x][y] = "[ ]";
            }
        }
    }

    void boardDisplay(){
        for (int j = 0; j < boardContents.length; j++){
            System.out.println();
            for (int k = 0; k < boardContents.length; k++){
                System.out.print(boardContents[j][k]);
            }
        }
    }

    void changeBoardDisplay(int row, int column, String symbol){
        boardContents[row][column] = ("["+symbol+"]");
    }

    boolean ifWon(String symbol){
        if (boardContents[0][0].equals("["+symbol+"]") && boardContents[0][1].equals("["+symbol+"]") && boardContents[0][2].equals("["+symbol+"]"))
            return true;
        if (boardContents[1][0].equals("["+symbol+"]") && boardContents[1][1].equals("["+symbol+"]") && boardContents[1][2].equals("["+symbol+"]"))
            return true;
        if (boardContents[2][0].equals("["+symbol+"]") && boardContents[2][1].equals("["+symbol+"]") && boardContents[2][2].equals("["+symbol+"]"))
            return true;
        if (boardContents[0][0].equals("["+symbol+"]") && boardContents[1][1].equals("["+symbol+"]") && boardContents[2][2].equals("["+symbol+"]"))
            return true;
        if (boardContents[0][2].equals("["+symbol+"]") && boardContents[1][1].equals("["+symbol+"]") && boardContents[2][0].equals("["+symbol+"]"))
            return true;
        if (boardContents[0][0].equals("["+symbol+"]") && boardContents[1][0].equals("["+symbol+"]") && boardContents[2][0].equals("["+symbol+"]"))
            return true;
        if (boardContents[0][1].equals("["+symbol+"]") && boardContents[1][1].equals("["+symbol+"]") && boardContents[2][1].equals("["+symbol+"]"))
            return true;
        if (boardContents[0][2].equals("["+symbol+"]") && boardContents[1][2].equals("["+symbol+"]") && boardContents[2][2].equals("["+symbol+"]"))
            return true;
        return false;
    }

    boolean ifFull(){
        int counter = 0;
        for (int k = 0; k < boardContents.length; k++){
            for (int j = 0; j < boardContents[0].length; j++){
                if (boardContents[k][j].equals("[X]") || boardContents[k][j].equals("[O]"))
                    counter++;
            }
        }
        if (counter == 9)
            return true;
        return false;
    }
}
