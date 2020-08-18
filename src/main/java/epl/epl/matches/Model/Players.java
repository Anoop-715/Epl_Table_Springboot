package epl.epl.matches.Model;

public class Players {

	private String playername;
	private int goals;
	private int assist;
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public int getGoals() {
		return goals;
	}
	public void setGoals(int goals) {
		this.goals = goals;
	}
	public int getAssist() {
		return assist;
	}
	public void setAssist(int assist) {
		this.assist = assist;
	}
	public Players(String playername, int goals, int assist) {
		super();
		this.playername = playername;
		this.goals = goals;
		this.assist = assist;
	}
	@Override
	public String toString() {
		return "Players [playername=" + playername + ", goals=" + goals + ", assist=" + assist + "]";
	}
	
	
}
