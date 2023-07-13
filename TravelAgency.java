class TravelAgency{
    static int index;
    //touristPlaces={"chickmagalur","gokarna","udupi","joga","dharmastala","coorg","dandeli","mysore";}
    static String touristPlaces[] ={null,null,null,null,null,null,null,null};

    public static void getTouristPlace(){
        for(int tourist=0 ;tourist<touristPlaces.length;tourist++){
            String name = touristPlaces[tourist];
            System.out.println(name);
        }
    }
    public static boolean addplace(String place){
        boolean isAdded=false;
        if(place !=null){
            touristPlaces[index++] = place;
            isAdded=true;
        }
        else {
            System.out.println("cannot add places,it is null");
        }
		return isAdded;
    }
	
	public static boolean updatePlace(String existingPlace , String updatedPlace){
	   
	   boolean isUpdated=false;
	   for(int placeIndex=0;placeIndex<touristPlaces.length;placeIndex++){
		   
		   if(touristPlaces[placeIndex].equals(existingPlace)){
		   
		   touristPlaces[placeIndex] = updatedPlace ;
		   isUpdated = true;
		   }
	   }return isUpdated;
   }
   
   public static int deletePlace(String deletePlace){
	   int touristIndex;
	   boolean isDeleted=false;
	   
	   int noOfElements= touristPlaces.length;
	   
	   for(touristIndex=0;touristIndex<touristPlaces.length;touristIndex++){
		   
		   if(touristPlaces[touristIndex].equals(deletePlace)){
			
		   }break;
	   }
		if(touristIndex<noOfElements){
			noOfElements = noOfElements-1;
		for(int newtouristIndex= touristIndex;newtouristIndex<noOfElements;newtouristIndex++){
				
			touristPlaces[newtouristIndex]=touristPlaces[newtouristIndex+1];
				
				}
			}return noOfElements;
}
	public static void getDeletedPlace(int newLength){
		for(int touristIndex=0;touristIndex<newLength;touristIndex++){
			System.out.println(touristPlaces[touristIndex]);
		}
	}

}