
public class FourWins {

	private char[][] charArray;

	public FourWins(int sizeX, int sizeY) {
		charArray = new char[sizeX][sizeY];

		for (int x = 0; x < charArray.length; x++) {
			for (int y = 0; y < charArray[x].length; y++) {
				charArray[x][y] = ' ';
			}
		}
	}

	public int getSizeX() {
		return charArray.length;
	}

	public int getSizeY() {
		return charArray[0].length;
	}

	public boolean playerA(int x, int y) {
		if (charArray[x][y] == ' ') {
			charArray[x][y] = 'A';
			return true;
		}
		return false;
	}

	public boolean playerB(int x, int y) {
		if (charArray[x][y] == ' ') {
			charArray[x][y] = 'B';
			return true;
		}
		return false;
	}

	private char fourInRow() {
		char lastCharacter = ' ';
		byte cntSameCharaters = 0;

		for (int y = 0; y < charArray[0].length; y++) {
			for (int x = 0; x < charArray.length; x++) {

				if (charArray[x][y] != lastCharacter) {
					lastCharacter = charArray[x][y];
					cntSameCharaters = 1;
				} else if (charArray[x][y] != ' ') {
					cntSameCharaters++;
				}

				if (cntSameCharaters == 4) {
					return lastCharacter;
				}
			}
			cntSameCharaters = 0;
			lastCharacter = ' ';
		}
		return '-';
	}

	private char fourInColumn() {
		char lastCharacter = ' ';
		byte cntSameCharaters = 0;

		for (int x = 0; x < charArray.length; x++) {
			for (int y = 0; y < charArray[0].length; y++) {

				if (charArray[x][y] != lastCharacter) {
					lastCharacter = charArray[x][y];
					cntSameCharaters = 1;
				} else if (charArray[x][y] != ' ') {
					cntSameCharaters++;
				}

				if (cntSameCharaters == 4) {
					return lastCharacter;
				}
			}
			cntSameCharaters = 0;
			lastCharacter = ' ';
		}
		return '-';
	}
	
	public char winner()
	{
		if (fourInColumn() != '-')
			return fourInColumn();
			
		return fourInRow();
	}
}
