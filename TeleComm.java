class TeleComm{
     static int index;
    //String simName={"Airtel"."jio","vodaphone","idea","bsnl","Vi","Docomo","Aircel"};
    static String simName[] = {null,null,null,null,null,null,null,null};

    public static void getSimCard(){

        for(int sim =0;sim<simName.length;sim++){
            String name = simName[sim];
            System.out.println(name);
        }
    }
    public static boolean createSim(String sim){
        boolean iscreated=false;
        if(sim !=null){
        simName[index++] = sim ;
        iscreated=true;
        }
        else{
            System.out.println("cannot add sim , it is null");
        }
		return iscreated;
    }
	
	
	public static boolean updateSim(String existingSim , String updatedSim){
	   
	   boolean isUpdated=false;
	   for(int simIndex=0;simIndex<simName.length;simIndex++){
		   
		   if(simName[simIndex].equals(existingSim)){
		   
		   simName[simIndex] = updatedSim ;
		   isUpdated = true;
		   }
	   }return isUpdated;
   }
   
   public static int deteleSim(String deteleSim ){
	   int simIndex;
	   boolean isDeleted=false;
	   int noOfElements= simName.length;
	   
	   for(simIndex=0;simIndex<simName.length;simIndex++){
		   
		   if(simName[simIndex].equals(deteleSim)){
			
		   }break;
	   }
		if(simIndex<noOfElements){
			noOfElements = noOfElements-1;
		for(int newsimIndex= simIndex;newsimIndex<noOfElements;newsimIndex++){
				
			simName[newsimIndex]=simName[newsimIndex+1];
				
				}
			}return noOfElements;
}
	public static void getDeletedSim(int newLength){
		for(int simIndex=0;simIndex<newLength;simIndex++){
			System.out.println(simName[simIndex]);
		}
	}
    
}
