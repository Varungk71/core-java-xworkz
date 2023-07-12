class IceCream{
     static int index;
    //String flavourName={"venila","chocolate","mango","cherry","strawberry","pineapple"};
    static String flavourName[] ={null,null,null,null,null,null};

     public static void getFlavours(){

        for(int flavour =0;flavour<flavourName.length;flavour++){
            String name = flavourName[flavour];
            System.out.println(name);
        }
    }
    public static boolean saveflavour(String flavour){
        boolean isSaved=false;
        if(flavour !=null){
        flavourName[index++] = flavour ;
        isSaved=true;
        }
        else{
            System.out.println("cannot add flavour , it is null");
        }
		return isSaved;
    }
	
	public static boolean updateFlavour(String existingFlavour , String updatedFlavour){
	   boolean isUpdated=false;
	   for(int flavourIndex=0;flavourIndex<flavourName.length;flavourIndex++){
		   
		   if(flavourName[flavourIndex].equals(existingFlavour)){
		   
		   flavourName[flavourIndex] = updatedFlavour ;
		   isUpdated = true;
		   }
	   }return isUpdated;
   }
   
   public static int deleteFlavour(String deleteFlavour ){
	   int flavourIndex;
	   boolean isDeleted=false;
	   
	   int noOfElements= flavourName.length;
	   
	   for(flavourIndex=0;flavourIndex<flavourName.length;flavourIndex++){
		   
		   if(flavourName[flavourIndex].equals(deleteFlavour)){
			
		   }break;
	   }
		if(flavourIndex<noOfElements){
			noOfElements = noOfElements-1;
		for(int newFlavourIndex= flavourIndex;newFlavourIndex<noOfElements;newFlavourIndex++){
				
			flavourName[newFlavourIndex]=flavourName[newFlavourIndex+1];
				
				}
			}return noOfElements;
}
	public static void getDeletedFlavour(int newLength){
		for(int flavourIndex=0;flavourIndex<newLength;flavourIndex++){
			System.out.println(flavourName[flavourIndex]);
		}
	}
	
	
	public static String searchFlavourByname(String flavour){
		
		System.out.println("invoking search flavour by name");
		
		String fName= null;
		
		for(String name : flavourName){
			
			if(name.equals(flavour)){
				fName=name;
			System.out.println("the searched floavor is = " + fName);
			}
		}
			return fName;
		
	}
}