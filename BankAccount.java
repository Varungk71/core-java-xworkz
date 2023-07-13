class BankAccount{

	static double balance = 20000.0;
	////static boolean credit;
	static boolean debit;
	
	
	public static double credit(int  creditAmount){
	
	if(creditAmount>0){
	balance = balance + creditAmount;
	return creditAmount;
	}
	else {
		System.out.println("enter greater than 1");
		return 0;
	}
	
	}
	
	public static double debit(int debitAmount){
		
		if (balance >= debitAmount){
	
	balance = balance - debitAmount;
	return debitAmount;
		}
		else {
			System.out.println("minimum balance" + balance);
			return 0;
		}
	}// return balance;
}