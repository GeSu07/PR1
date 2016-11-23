
public class DemoApp {

	public static void main(String[] args) {

		FourWins spielRow = new FourWins(7, 5);
		
		spielRow.playerA(0, 0);
		spielRow.playerB(0, 1);
		System.out.println("Hat jemand gewonnen: " + spielRow.winner());
		spielRow.playerA(1, 0);
		spielRow.playerB(1, 1);
		System.out.println("Hat jemand gewonnen: " + spielRow.winner());
		spielRow.playerA(2, 0);
		spielRow.playerB(2, 1);
		System.out.println("Hat jemand gewonnen: " + spielRow.winner());
		spielRow.playerA(3, 0);
		spielRow.playerB(2, 4);
		System.out.println("Hat jemand gewonnen: " + spielRow.winner());

		FourWins spielColumn = new FourWins(7,5);
		spielColumn.playerA(0, 0);
		spielColumn.playerB(1, 0);
		System.out.println("Hat jemand gewonnen: " + spielColumn.winner());
		spielColumn.playerA(0, 1);
		spielColumn.playerB(1, 1);
		System.out.println("Hat jemand gewonnen: " + spielColumn.winner());
		spielColumn.playerA(0, 2);
		spielColumn.playerB(1, 2);
		System.out.println("Hat jemand gewonnen: " + spielColumn.winner());
		spielColumn.playerA(2, 0);
		spielColumn.playerB(1, 3);
		System.out.println("Hat jemand gewonnen: " + spielColumn.winner());
		
		
		
	
	}

}
