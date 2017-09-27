public class TicTacToe {

  private char[][] board = new char[2][2];
  private char currentPlayer;

  public TicTacToe() {
    initializeBoard();
    // choosePlayer();
  }

  // make all slots of the board empty
  private void initializeBoard() {
    for (int i = 0; i < 3; i++)
      for (int j = 0; j < 3; j++)
        board[i][j] = '-';

  }

  // prints the current board
  private void printBoard() {

  }

  // checks whether the board is full or not. Returns true if board is full, and false otherwise
  private boolean isBoardFull() {
    return true;
  }

  // returns true if palyer is a winner
  private boolean isWinner() {
    return true;
  }

  // checks the rows for a win. Returns true if a win is found
  private boolean checkRows() {
    return true;
  }

  // checks the columns for a win. Returns true if a win is found
  private boolean checkColumns() {
    return true;
  }

  // checks the diagonals for a win. Returns true if a win is found
  private boolean checkDiagonals() {
    return true;
  }

  // checks if c1, c2, and c3 are similar, i.e 'X' or 'O'. If so, returns true
  private boolean checkRowCol(char c1, char c2, char c3) {
    return true;
  }

  public static void main(String[] args) {

  }
}

// Resources: https://medium.com/@ojusmilindsave/tutorial-to-implement-tic-tac-toe-in-java-ad639661a9b
