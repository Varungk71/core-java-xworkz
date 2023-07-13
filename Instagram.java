class Instagram{
	static long number=8431017474L;
	static String passWord = "Varungk@8431";
	static String eMail = "varungk@gmail.com";
	

	public static void login(long mobileNumber,String password){

		if(mobileNumber==number){
			if(password==passWord){
				System.out.println("login successfully");
			}
			else {
				System.out.println("incorrect password");
			}	
		}
		else {
			System.out.println("incorrect mobile number");
		}
	}
	public static void login(String email,String password){

		if(email==eMail){
			if(password==passWord){
				System.out.println("login successfully");
			}
			else {
				System.out.println("incorrect password");
			}	
		}
		else {
			System.out.println("incorrect e-mail");
		}
	}
	
}