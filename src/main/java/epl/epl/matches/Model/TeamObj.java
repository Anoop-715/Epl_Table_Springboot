package epl.epl.matches.Model;

public class TeamObj {
	
	private String teamname;
	private int points;
	private int win;
	private int loss;
	private int totalgame;
	
	public String getTeamname() {
	return teamname;
	}
	
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	
	public int getPoints() {
		return points;
		}
	
	public void setPoints(int points) {
	this.points =points;	
	}
	
	public int getWin() {
	return win;
	}
	
	public void setWin(int win) {
		this.win =win;
	}
	
	public int getLoss() {
		return loss;
	}
	
	public void setLoss(int loss) {
		this.loss=loss;
	}
	
	public int getTotalgame() {
		return totalgame;
	}
	
	public void setTotalgame(int totalgame) {
		this.totalgame=totalgame;
	}

	public TeamObj(String teamname, int points, int win, int loss, int totalgame) {
		this.teamname = teamname;
		this.points = points;
		this.win = win;
		this.loss = loss;
		this.totalgame = totalgame;
	}

	@Override
	public String toString() {
		return "TeamObj [teamname=" + teamname + ", points=" + points + ", win=" + win + ", loss=" + loss
				+ ", totalgame=" + totalgame + "]";
	}
	
}