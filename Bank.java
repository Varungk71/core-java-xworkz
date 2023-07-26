class Bank{
	private int bankId;
	private String bankName;
	private String branch;
	private String branchCode;
	private String address;
	private long helplineNo;
	private String branchManager;
	private String ifscCode;
	private String micrCode;
	private int noOfLockers;
	private int noOfEmployees;
	private String timings;
	private String websiteDetails;
	//getter and setter
	public void setBankId(int bankId){
		this.bankId=bankId;
	}
	public int getBankId(){
		return bankId;
	}
	 // Getter and Setter for bankName
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    // Getter and Setter for branch
    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getBranch() {
        return branch;
    }

    // Getter and Setter for branchCode
    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getBranchCode() {
        return branchCode;
    }

    // Getter and Setter for address
    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    // Getter and Setter for helplineNo
    public void setHelplineNo(long helplineNo) {
        this.helplineNo = helplineNo;
    }

    public long getHelplineNo() {
        return helplineNo;
    }

    // Getter and Setter for branchManager
    public void setBranchManager(String branchManager) {
        this.branchManager = branchManager;
    }

    public String getBranchManager() {
        return branchManager;
    }

    // Getter and Setter for ifscCode
    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    // Getter and Setter for miscCode
    public void setMicrCode(String micrCode) {
        this.micrCode = micrCode;
    }

    public String getMicrCode() {
        return micrCode;
    }

    // Getter and Setter for noOfLockers
    public void setNoOfLockers(int noOfLockers) {
        this.noOfLockers = noOfLockers;
    }

    public int getNoOfLockers() {
        return noOfLockers;
    }

    // Getter and Setter for noOfEmployees
    public void setNoOfEmployees(int noOfEmployees) {
        this.noOfEmployees = noOfEmployees;
    }

    public int getNoOfEmployees() {
        return noOfEmployees;
    }

    // Getter and Setter for timings
    public void setTimings(String timings) {
        this.timings = timings;
    }

    public String getTimings() {
        return timings;
    }

    // Getter and Setter for websiteDetails
    public void setWebsiteDetails(String websiteDetails) {
        this.websiteDetails = websiteDetails;
    }

    public String getWebsiteDetails() {
        return websiteDetails;
    }
}