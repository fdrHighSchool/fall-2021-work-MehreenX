import java.util.*;

public class ConnectFour {
  public static void main(String[] args) {
    System.out.println("Lets play!! Put a X or O with the row and column number :");
    Scanner s = new Scanner(System.in);
    String Userinput = s.nextLine();

    String[][] board = new String[6][7];

    //System.out.println(Arrays.deepToString(board));
    fillBoard(board);
    displayBoard(board);

    playRound(userInput, board);
    displayBoard(board);

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

  public static String PlayRound(int input, String[] borad){
     for(int i = board.length - 1; i >= 0; i--) {
     }//end PlayRound
     return borad;
  }


} // end class
