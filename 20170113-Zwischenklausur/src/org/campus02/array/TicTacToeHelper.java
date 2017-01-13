package org.campus02.array;

public class TicTacToeHelper {

	public static void main(String[] args) {
		char[][] myBoard = generateEmptyBoard();
		
		System.out.println("Board 3x3?: " + validateBoard(myBoard));
		System.out.println("\n");
		myBoard[0][0] = 'X';
		myBoard[1][0] = 'X';
		myBoard[2][0] = 'O';
		myBoard[0][1] = 'X';
		myBoard[0][2] = 'O';
		myBoard[1][2] = 'O';
		myBoard[2][2] = 'X';
		printBoard(myBoard);
	}

	public static char[][] generateEmptyBoard() {
		char[][] board = new char[3][3];

		for (int x = 0; x < board.length; x++) {
			for (int y = 0; y < board[x].length; y++) {
				board[x][y] = ' ';
			}
		}
		return board;
	}

	private static boolean validateBoard(char[][] board) {

		// Validierung erste Dimension
		if (board.length != 3) {
			return false;
		}

		// Validierung zweite Dimensionen
		for (int r = 0; r < board.length; r++) {

			if (board[r].length != 3) {
				return false;
			}

		}

		return true;
	}

	public static void printBoard(char[][] board) {
		for (int x = 0; x < board.length; x++) {
			for (int y = 0; y < board[x].length; y++) {
				System.out.print(board[x][y] + "\t");
			}
			System.out.println();
		}
	}

}
