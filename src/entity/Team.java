package entity;

public class Team {

	private int id;
	private String teamName;
	private String captainName;
	private String coachName;
	private String ownerName;
	private float nRR;
	private boolean isQualified;
	private String shortName;

	// Setter and Getter.

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	
	

	@Override
	public String toString() {
		return "Team [id=" + id + ", teamName=" + teamName + ", captainName=" + captainName + ", coachName=" + coachName
				+ ", ownerName=" + ownerName + ", nRR=" + nRR + ", isQualified=" + isQualified + ", shortName="
				+ shortName + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCaptainName() {
		return captainName;
	}

	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}

	public String getCoachName() {
		return coachName;
	}

	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public float getnRR() {
		return nRR;
	}

	public void setnRR(float nRR) {
		this.nRR = nRR;
	}

	public boolean isQualified() {
		return isQualified;
	}

	public void setQualified(boolean isQualified) {
		this.isQualified = isQualified;
	}

}
