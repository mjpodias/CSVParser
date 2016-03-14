public class Bin {
	private int binNumber;
	private String trialNumber;
	private String actorID;
	private String centerDur;
	private String stayHideDur;
	private String socialContactDur;
	private String threeContactDur;
	private String fiveContactDur;
	private String sevenContactDur;
	private String oneContactDur; 
	private String twoContactDur;
	private String fourContactDur;
	private String sixContactDur;
	private String approachDur;
	private String leaveDur;
	private String followDur;
	private String sniffDur;
	private String mountDur;
	private String competeDur;

	public Bin(int binNumber, String trialNumber, String actorID) {
		this.binNumber = binNumber;
		this.trialNumber = trialNumber;
		this.actorID = actorID;
	}
	public int getBinNumber() {
		return binNumber;
	}
	public void setBinNumber(int binNumber) {
		this.binNumber = binNumber;
	}
	public String getTrialNumber() {
		return trialNumber;
	}
	public void setTrialNumber(String trialNumber) {
		this.trialNumber = trialNumber;
	}
	public String getActorID() {
		return actorID;
	}
	public void setActorID(String actorID) {
		this.actorID = actorID;
	}
	public String getCenterDur() {
		return centerDur;
	}
	public void setCenterDur(String centerDur) {
		this.centerDur = centerDur;
	}
	public String getStayHideDur() {
		return stayHideDur;
	}
	public void setStayHideDur(String stayHideDur) {
		this.stayHideDur = stayHideDur;
	}
	public String getSocialContactDur() {
		return socialContactDur;
	}
	public void setSocialContactDur(String socialContactDur) {
		this.socialContactDur = socialContactDur;
	}
	public String getThreeContactDur() {
		return threeContactDur;
	}
	public void setThreeContactDur(String threeContactDur) {
		this.threeContactDur = threeContactDur;
	}
	public String getFiveContactDur() {
		return fiveContactDur;
	}
	public void setFiveContactDur(String fiveContactDur) {
		this.fiveContactDur = fiveContactDur;
	}
	public String getSevenContactDur() {
		return sevenContactDur;
	}
	public void setSevenContactDur(String sevenContactDur) {
		this.sevenContactDur = sevenContactDur;
	}
	public String getOneContactDur() {
		return oneContactDur;
	}
	public void setOneContactDur(String oneContactDur) {
		this.oneContactDur = oneContactDur;
	}
	public String getTwoContactDur() {
		return twoContactDur;
	}
	public void setTwoContactDur(String twoContactDur) {
		this.twoContactDur = twoContactDur;
	}
	public String getFourContactDur() {
		return fourContactDur;
	}
	public void setFourContactDur(String fourContactDur) {
		this.fourContactDur = fourContactDur;
	}
	public String getSixContactDur() {
		return sixContactDur;
	}
	public void setSixContactDur(String sixContactDur) {
		this.sixContactDur = sixContactDur;
	}
	public String getApproachDur() {
		return approachDur;
	}
	public void setApproachDur(String approachDur) {
		this.approachDur = approachDur;
	}
	public String getLeaveDur() {
		return leaveDur;
	}
	public void setLeaveDur(String leaveDur) {
		this.leaveDur = leaveDur;
	}
	public String getFollowDur() {
		return followDur;
	}
	public void setFollowDur(String followDur) {
		this.followDur = followDur;
	}
	public String getSniffDur() {
		return sniffDur;
	}
	public void setSniffDur(String sniffDur) {
		this.sniffDur = sniffDur;
	}
	public String getMountDur() {
		return mountDur;
	}
	public void setMountDur(String mountDur) {
		this.mountDur = mountDur;
	}
	public String getCompeteDur() {
		return competeDur;
	}
	public void setCompeteDur(String competeDur) {
		this.competeDur = competeDur;
	}
	
	public String toString() {
		return this.binNumber + ",#" + 
			   this.trialNumber + ",#" + 
			   this.actorID + ",#" + 
			   this.centerDur + ",#" + 
			   this.stayHideDur + ",#" + 
			   this.socialContactDur + ",#" +
			   this.threeContactDur + ",#" + 
			   this.fiveContactDur + ",#" + 
			   this.sevenContactDur + ",#" + 
			   this.oneContactDur + ",#" + 
			   this.twoContactDur + ",#" + 
			   this.fourContactDur + ",#" + 
			   this.sixContactDur + ",#" + 
			   this.approachDur + ",#" + 
			   this.leaveDur + ",#" + 
			   this.followDur + ",#" + 
			   this.sniffDur + ",#" + 
			   this.mountDur + ",#" + 
			   this.competeDur;
	}
}
