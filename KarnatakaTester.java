class KarnatakaTester{

	public static void main(String args[]){
	
	Karnataka.createCity("chikkamagaluru");
	Karnataka.createCity("banglore");
	Karnataka.createCity("shimoga");
	Karnataka.createCity("davanagere");
	Karnataka.createCity("bidar");
	Karnataka.createCity("kolar");
	Karnataka.createCity("hassan");
	Karnataka.createCity("mandya");
	Karnataka.createCity("bidar");
	
	Karnataka.getDistricName();
	System.out.println();
	
	Karnataka.updateCity("chikkamagaluru","Chikmanglur");
	Karnataka.updateCity("banglore","Banglore");
	Karnataka.updateCity("shimoga","Shivamogga");
	Karnataka.updateCity("davanagere","Davanagere");
	Karnataka.updateCity("bidar","Bidar");
	Karnataka.updateCity("kolar","Kolar");
	Karnataka.updateCity("hassan","Hassan");
	Karnataka.updateCity("mandya","Mandya");
	Karnataka.updateCity("bidar","Bidar");
	
	Karnataka.getDistricName();
	Karnataka.deleteCity("Chikmanglur");

	Karnataka.getDeletedCity(7);
	
	}
}