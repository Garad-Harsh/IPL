package repository;

import entity.Team;

public class TeamRepository {

	// should returns CSK team Details.
	public static Team getCSKTeamDetails() {
		Team team = new Team();
		team.setId(101);
		team.setTeamName("Chennai Super Kings");
		team.setCaptainName("Ruturaj Gaikwad");
		team.setCoachName("Stephen Fleming");
		team.setOwnerName("N. Srinivasan");
		team.setQualified(true);
		team.setnRR(+0.652f);
		return team;

	}

	// should returns MI team Details.
	public static Team getMITeamDetails() {
		Team team = new Team();
		team.setId(102);
		team.setTeamName("Mumbai Indians");
		team.setCaptainName("Hardik Pandya");
		team.setCoachName("Mahela Jayawardene");
		team.setOwnerName("Reliance Industries");
		team.setQualified(false);
		team.setnRR(-0.044f);
		return team;

	}

	// should returns GT team Details.
	public static Team getGTTeamDetails() {
		Team team = new Team();
		team.setId(103);
		team.setTeamName("Gujarat Titans");
		team.setCaptainName("Shubman Gill");
		team.setCoachName("Ashish Nehra");
		team.setOwnerName("CVC Capitals");
		team.setQualified(true);
		team.setnRR(+0.809f);
		return team;

	}

	// should returns LSG team Details.
	public static Team getLSGTeamDetails() {
		Team team = new Team();
		team.setId(104);
		team.setTeamName("Lucknow Super Giants");
		team.setCaptainName("Rishabh Pant");
		team.setCoachName("Justin Langer");
		team.setOwnerName(" Sanjiv Goenka ");
		team.setQualified(false);
		team.setnRR(0.284f);
		return team;

	}

	// should returns PBSK team Details.
	public static Team getPBSKTeamDetails() {
		Team team = new Team();
		team.setId(105);
		team.setTeamName("Punjab Kings");
		team.setCaptainName("Shreyas Iyer");
		team.setCoachName("Ricky Ponting");
		team.setOwnerName("Preity Zinta");
		team.setQualified(false);
		team.setnRR(-0.304f);
		return team;

	}

	// should returns SRH team Details.
	public static Team getSRHTeamDetails() {
		Team team = new Team();
		team.setId(106);
		team.setTeamName("Sunrisers Hyderabad");
		team.setCaptainName("Pat Cummins");
		team.setCoachName("Daniel Vettori");
		team.setOwnerName("Kalanidhi Maran");
		team.setQualified(false);
		team.setnRR(-0.590f);
		return team;

	}

	// should returns KKR team Details.
	public static Team getKKRTeamDetails() {
		Team team = new Team();
		team.setId(107);
		team.setTeamName("Kolkata Knight Riders");
		team.setCaptainName("Ajinkya Rahane");
		team.setCoachName("Mahela Jayawardene");
		team.setOwnerName("Shahrukh Khan ");
		team.setQualified(false);
		team.setnRR(-0.239f);
		return team;

	}

	// should returns RCB team Details.
	public static Team getRCBTeamDetails() {
		Team team = new Team();
		team.setId(108);
		team.setTeamName("Royal Challengers Bengaluru");
		team.setCaptainName("Rajat Patidar");
		team.setCoachName("Andy Flower");
		team.setOwnerName("Diageo through United Spirits Limited");
		team.setQualified(false);
		team.setnRR(0.135f);
		return team;

	}

	// should returns RR team Details.
	public static Team getRRTeamDetails() {
		Team team = new Team();
		team.setId(109);
		team.setTeamName("Rajasthan Royals");
		team.setCaptainName("Sanju Samson");
		team.setCoachName("Rahul Dravid");
		team.setOwnerName("Manoj Badale");
		team.setQualified(false);
		team.setnRR(0.148f);
		return team;

	}

	// should returns DD team Details.
	public static Team getDDTeamDetails() {
		Team team = new Team();
		team.setId(110);
		team.setTeamName("Delhi Capitals");
		team.setCaptainName("Axar Patel");
		team.setCoachName("Hemang Badani");
		team.setOwnerName("GMR Sports Pvt Ltd, JSW Sports");
		team.setQualified(false);
		team.setnRR(-0.808f);
		return team;

	}

	// add similar methods for remaining 9 teams.

}
