import java.util.*;

public class ConnectFour {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String Userinput = s.nextLine();

    String[][] board = new String[6][7];

    System.out.println("\u001B[32mConnect Four!\nPress enter to start.");
    s.nextLine();

    fillBoard(board);
    displayBoard(board);

    PlayRound(Userinput, board);
    displayBoard(board);

    // example, player 1 chooses col 3
    //board[5][2] = "[X]";
    //s.nextLine();
    //displayBoard(board);

    // player 2 also chooses col 3
    //board[4][2] = "[O]";
    //s.nextLine();
    //displayBoard(board);

  } // end main method

  public static void fillBoard(String[][] board) {
    for(int row = 0; row < board.length; row++) {
      for(int col = 0; col < board[row].length; col++) {
        board[row][col] = "[ ]";
      } // end inner loop
    } // end outer loop
  } // end fillBoard method

  public static void displayBoard(String[][] board) {
    for(int row = 0; row < board.length; row++) {
      for(int col = 0; col < board[row].length; col++) {
        System.out.print(board[row][col] + " ");
      } // end inner for loop
      System.out.println();
    } // end outer for loop
  } // end displayBoard method

 public static String[][] playTurn(int col, String[][] board, int player){
   

// }//end playTurn

} // end class
