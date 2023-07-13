class Cricket1{

static String batsMan[]={"surya kumar yadav","mohammad rizwan","babar azam","aiden markram","Rilee rossouw","muhannad waseem","devon convey","Dawid malan","aaron finch","joa butler"};

public static void main (String args[]){

System.out.println("bats man names are");
{
	int i=0;

	/*for ( ;i<=batsMan.length; ){
		
			System.out.println(batsMan[i]);
			i++;
	}*/
	System.out.println("bats man are = ");
	for (String batsMans: batsMan){
		
		System.out.println(batsMans);
	}

}
		

}
}