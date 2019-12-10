import java.util.Arrays;

public class Team {

	int teamid;
	String teamName;
	Players[] player;
	public int getTeamid() {
		return teamid;
	}
	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	public Players[] getPlayer() {
		return player;
	}
	public void setPlayer(Players[] player) {
		this.player = player;
	}
	public Team(int teamid, String teamName, Players[] player) {
		super();
		this.teamid = teamid;
		this.teamName = teamName;
		this.player = player;
	}
	public Team() {
		
	}
	
	
}
