public class TicTacToe {

  private static char[][] board = new char[3][3];
  private char currentPlayer;
  private static final int MAX = 3;

  public TicTacToe() {
    initializeBoard();
    // choosePlayer();
  }

  // make all slots of the board empty
  private static void initializeBoard() {
    for (int i = 0; i < MAX; i++) {
      for (int j = 0; j < MAX; j++)
        board[i][j] = '-';
      }
  }

  // prints the current board
  private static void printBoard() {
    printDashes();
    for (int i = 0; i < MAX; i++) {
      System.out.print("| ");
      for (int j = 0; j < MAX; j++) {
        System.out.print(board[i][j] + " |");
      }
      System.out.println();
      printDashes();
    }
  }

  // checks whether the board is full or not. Returns true if board is full, and false otherwise
  private static boolean isBoardFull() {
    for (int i = 0; i < MAX; i++) {
      for (int j = 0; j < MAX; j++) {
        if (board[i][j] == '-') return false;
      }
    }
    return true;
  }

  // returns true if palyer is a winner
  // A player wins if there is a win either horizontally, vertically, or diagonally
  private static boolean isWinner() {
    return (checkRows() || checkColumns() || checkDiagonals());
  }

  // checks the rows for a win. Returns true if a win is found
  // There is a win in a row if all its elements are the same and not equal to '-'
  private static boolean checkRows() {
    for (int i = 0; i < MAX; i++) {
      if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true)
        return true;
    }
    return false;
  }

  // checks the columns for a win. Returns true if a win is found
  private static boolean checkColumns() {
    return true;
  }

  // checks the diagonals for a win. Returns true if a win is found
  private static boolean checkDiagonals() {
    return true;
  }

  // checks if c1, c2, and c3 are similar, i.e 'X' or 'O'. If so, returns true
  private static boolean checkRowCol(char c1, char c2, char c3) {
    return true;
  }

  public static void printDashes() {
    for (int i = 0; i < 11; i++)
      System.out.print("-");
      System.out.println();
  }

  public static void main(String[] args) {
    initializeBoard();
    printBoard();
    System.out.println("isBoardFull() = " + isBoardFull());
    System.out.println("checkRows() = " + checkRows());
  }
}

// Resources: https://medium.com/@ojusmilindsave/tutorial-to-implement-tic-tac-toe-in-java-ad639661a9b
