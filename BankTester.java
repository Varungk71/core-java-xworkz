class BankTester{
	public static void main(String args[]){
		Bank bank=new Bank();
			bank.setBankId(1);
			bank.setBankName("Canara Bank");
			bank.setBranch("Rajajinagar Bangalore");
			System.out.println(bank.getBankId()+"\n"+bank.getBankName()+"\n"+bank.getBranch());
		Bank bank1=new Bank();
			bank.setBranchCode("010408");
			bank.setAddress("Sri Ragavendra Kripa 3rd Block Ramamandir Road Rajajinagar");
			bank.setHelplineNo(18004250018l);
			bank.setBranchManager("Mr.Satyanarayana");
			bank.setIfscCode("CNRB0010408");
			System.out.println(bank.getBranchCode()+"\n"+bank.getAddress()+"\n"+bank.getHelplineNo()+"\n"+bank.getBranchManager()+"\n"+
		    bank.getIfscCode());
		Bank bank2=new Bank();
			bank.setMicrCode("560015234");
			bank.setNoOfLockers(100);
			bank.setNoOfEmployees(500);
			bank.setTimings("9:00am to 4:00pm");
			bank.setWebsiteDetails("www.canarabankraj.com");
			System.out.println(bank.getMicrCode()+"\n"+bank.getNoOfLockers()+"\n"+bank.getNoOfEmployees()
			+"\n"+bank.getTimings()+"\n"+bank.getWebsiteDetails());
	}
}