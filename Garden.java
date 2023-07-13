class Garden{
     static int index;
    //String flowerName={"Hibiscus","Rose","lotus","sun flower","lily","tulips","jasmine"};
    static String flowerName[] ={null,null,null,null,null,null,null,};

    public static void getflowers(){

        for(int flower =0;flower<flowerName.length;flower++){
            String name = flowerName[flower];
            System.out.println(name);
        }
    }
    public static boolean createflower(String flower){
        boolean isCreated=false;
        if(flower !=null){
        flowerName[index++] = flower ;
        isCreated=true;
        }
        else{
            System.out.println("cannot add flower , it is null");
        }
		return isCreated;
    }
	
	public static boolean updateFlower(String existingFlower , String updatedFlower){
	   
	   boolean isUpdated=false;
	   for(int flowIndex=0;flowIndex<flowerName.length;flowIndex++){
		   
		   if(flowerName[flowIndex].equals(existingFlower)){
		   
		   flowerName[flowIndex] = updatedFlower ;
		   isUpdated = true;
		   }
	   }return isUpdated;
   }
   
   public static int deleteFlower(String deleteFlower ){
	   int flowerIndex;
	   boolean isDeleted=false;
	   
	   int noOfElements= flowerName.length;
	   
	   for(flowerIndex=0;flowerIndex<flowerName.length;flowerIndex++){
		   
		   if(flowerName[flowerIndex].equals(deleteFlower)){
			
		   }break;
	   }
		if(flowerIndex<noOfElements){
			noOfElements = noOfElements-1;
		for(int newflowerIndex= flowerIndex;newflowerIndex<noOfElements;newflowerIndex++){
				
			flowerName[newflowerIndex]=flowerName[newflowerIndex+1];
				
				}
			}return noOfElements;
}
	public static void getDeletedFlower(int newLength){
		for(int flowerIndex=0;flowerIndex<newLength;flowerIndex++){
			System.out.println(flowerName[flowerIndex]);
		}
	}
    

}