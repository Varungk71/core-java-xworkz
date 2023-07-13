class FoodMenus3{

/*static String foodName[]={"Pizza","Burger","Biryani","Butter Chicken","Samosa","Tandoori Chicken","Masala Dosa","Palak Paneer","Rogan Josh","Chole Bhature",
"Aloo Tikki","aneer Tikka","Vada Pav","Pani Puri","Chicken Tikka Masala","Dal Makhani","Mutton Biryani","Pav Bhaji","Chicken Biryani","Hyderabadi Dum Biryani",
"Fish Curry","Malai Kofta","Chicken Korma","Rajma Chawal","Dahi Vada","Gulab Jamun","Jalebi","Chicken Curry","Prawn Curry","Bhindi Masala",
"Rasmalai","Gobi Manchurian","Pesarattu","Chicken 65","Aloo Paratha","Mysore Masala Dosa","Chicken Chettinad","Kheer","Bhel Puri","Chicken Biryani",
"Chicken Shawarma","Chicken Tandoori","Chicken Vindaloo","Baingan Bharta","Malabar Paratha","Kathi Roll","Rasgulla","Aloo Gobi","Chana Masala","Keema Paratha"};*/

public static void main(String args[]){

String foodName[]={"Pizza","Burger","Biryani","Butter Chicken","Samosa","Tandoori Chicken","Masala Dosa","Palak Paneer","Rogan Josh","Chole Bhature",
"Aloo Tikki","aneer Tikka","Vada Pav","Pani Puri","Chicken Tikka Masala","Dal Makhani","Mutton Biryani","Pav Bhaji","Chicken Biryani","Hyderabadi Dum Biryani",
"Fish Curry","Malai Kofta","Chicken Korma","Rajma Chawal","Dahi Vada","Gulab Jamun","Jalebi","Chicken Curry","Prawn Curry","Bhindi Masala",
"Rasmalai","Gobi Manchurian","Pesarattu","Chicken 65","Aloo Paratha","Mysore Masala Dosa","Chicken Chettinad","Kheer","Bhel Puri","Chicken Biryani",
"Chicken Shawarma","Chicken Tandoori","Chicken Vindaloo","Baingan Bharta","Malabar Paratha","Kathi Roll","Rasgulla","Aloo Gobi","Chana Masala","Keema Paratha"};

getFoodNames(foodName);

}
		public static void getFoodNames(String foodName[]){
			for(String foodNames : foodName)
			
			System.out.println(foodNames);
}
}