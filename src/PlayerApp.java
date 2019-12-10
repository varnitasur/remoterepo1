import java.util.Scanner;

public class PlayerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*
		 * Players[] p=new Players[2]; for (int i = 0; i < p.length; i++) { //Players
		 * player=new Players(); System.out.println("Enter the player id "); int
		 * playerid=sc.nextInt(); System.out.println("Enter the player name"); String
		 * playername=sc.next(); System.out.println("Enter the player Address"); String
		 * playerAddress=sc.next(); Players player=new
		 * Players(playerid,playername,playerAddress); p[i]=player; } 
		 * for (int i = 0; i
		 * < p.length; i++) {
		 * 
		 * System.out.println(p[i].getId()+" "+p[i].getPname()+" "+p[i].getPadd()); }
		 */
		Team[] team = new Team[2];
		for (int i = 0; i < team.length; i++) {
			System.out.println("Enter team id");
			int teamid = sc.nextInt();
			System.out.println("Enter the team name");
			String teamname = sc.next();
			// System.out.println("Enter the number of players");
			Players[] p = new Players[2];
			for (int j = 0; j < p.length; j++) {
				System.out.println("Enter the player id ");
				int playerid = sc.nextInt();
				System.out.println("Enter the player name");
				String playername = sc.next();
				System.out.println("Enter the player Address");
				String playerAddress = sc.next();
				Players player = new Players(playerid, playername, playerAddress);
				p[j] = player;
			}
			team[i] = new Team(teamid, teamname, p);
		}
		
		System.out.println("Enter the player name whose team you want to find");
		String searchName = sc.next();
		for(int i=0;i<team.length;i++) {
			System.out.println("Team ID:: "+team[i].getTeamid());
			System.out.println("Team ID:: "+team[i].getTeamName());
			for(int j = 0; j<team[i].getPlayer().length;j++) {
				if(team[i].getPlayer()[j].getPname().equals(searchName)){
					System.out.println("Player "+searchName+" Belongs to "+team[i].getTeamName());
				}
				System.out.println("Player ID:: "+team[i].getPlayer()[j].getId());
				System.out.println("Player Name:: "+team[i].getPlayer()[j].getPname());
				System.out.println("Player Address:: "+team[i].getPlayer()[j].getPadd());
			}
		}

	}

}
