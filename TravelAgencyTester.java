class TravelAgencyTester{

	public static void main(String args[]){
	
	TravelAgency.addplace("chickmagalur");
	TravelAgency.addplace("udupi");
	TravelAgency.addplace("joga");
	TravelAgency.addplace("dharmastala");
	TravelAgency.addplace("coorg");
	TravelAgency.addplace("dandeli");
	TravelAgency.addplace("mysore");
	TravelAgency.addplace("gokarna");
	
	TravelAgency.getTouristPlace();
	
	TravelAgency.updatePlace("chickmagalur","Chickmagalur");
	TravelAgency.updatePlace("udupi","Udupi");
	TravelAgency.updatePlace("joga","Joga");
	TravelAgency.updatePlace("dharmastala","Dharmastala");
	TravelAgency.updatePlace("coorg","Coorg");
	TravelAgency.updatePlace("dandeli","Dandeli");
	TravelAgency.updatePlace("mysore","Mysore");
	TravelAgency.updatePlace("gokarna","Gokarna");
	
	TravelAgency.getTouristPlace();
	
	TravelAgency.deletePlace("Chickmagalur");
	TravelAgency.getDeletedPlace(6);
}
}
