class BankAccountTester{

public static void main(String args[]){

	double creditedAmount = BankAccount.credit(0);
	System.out.println("credited amount  is = " +creditedAmount + "rs");
	
	double debitedAmount = BankAccount.debit(2000);
	System.out.println("debited amount is =" + debitedAmount + "rs");
	
	double creditedAmount1 = BankAccount.credit(10000);
	System.out.println("credited amount   is = " +creditedAmount1 + "rs");
	
	double debitedAmount1 = BankAccount.debit(25000);
	System.out.println("balance is =" + debitedAmount1 + "rs");

}
}