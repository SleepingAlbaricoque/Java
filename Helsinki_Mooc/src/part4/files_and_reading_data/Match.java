package part4.files_and_reading_data;

public class Match {
	String homeTeam;
	String visitingTeam;
	int homeScore;
	int visitingScore;
	
	public Match(String homeTeam, String visitingTeam, int homeScore, int visitingScore) {
		this.homeTeam = homeTeam;
		this.visitingTeam = visitingTeam;
		this.homeScore = homeScore;
		this.visitingScore = visitingScore;
	}
	
	public String winner() {
		String winner = "";
		if (this.homeScore > this.visitingScore) {
			winner = this.homeTeam;
		}else if(this.homeScore < this.visitingScore) {
			winner = this.visitingTeam;
		}
		return winner;
	}
	
	public String getName() {
		return homeTeam;
	}
	
	public String getVName() {
		return visitingTeam;
	}
	
	public int getHScore() {
		return homeScore;
	}
	
	public int getVScore() {
		return visitingScore;
	}
	
	@Override
	public String toString() {
		return this.homeTeam + " " + this.visitingTeam + " " + this.homeScore + this.visitingScore + this.winner();
	}
}
