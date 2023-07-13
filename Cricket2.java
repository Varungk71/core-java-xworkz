class Cricket{

static String batsMan[]={"surya kumar yadav","mohammad rizwan","babar azam","aiden markram","Rilee rossouw","muhannad waseem","devon convey","Dawid malan","aaron finch","joa butler"};
static String teamRanking[]={"India","England","newzeal land","Pakistan","South africa","Australia","West Indies","Srilanka","Bangladesh","Afghanisthan"};
static String iplteam[]={"Chennai Super Kings","Delhi Capitals","Gujarat Titans","Punjab Kings","Kolkata Knight Riders","Lucknow Sugergaints","Mumbai Indians","Rajasthan Royals","Royal Challengers Bangalore","Sunrisers Hyderabad "};

public static void main (String args[]){
	getBatsMan();
	getteamRanking();
	getIplTeam();
	
	}
		public static void getBatsMan(){
		for(String batsMans: batsMan)
		System.out.println(batsMans);
		}
		public static void getteamRanking(){
		for(String teamRankings: teamRanking)
		System.out.println(teamRankings);
		}
		public static void getIplTeam(){
		for(String iplTeam: iplteam)
		System.out.println(iplTeam);
		}
}