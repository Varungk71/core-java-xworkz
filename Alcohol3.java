class Alcohol3{

//static String alcohol[]={"baileys","old monk","kingfisher","imperial blue","vodka","tuborg","rum","port wine","royal challenge","whiskey","tequila","sherry","brandy","carlsberg","budweiser","oxygen","vermouth","cognac","beer","gin","baijiu","singani","arrack","jenever","soju","mezcal","arak","absinthe","horilka","rye whiskey","mirin"};
public static void main(String args[]){

String alcohol[]={"baileys","old monk","kingfisher","imperial blue","vodka","tuborg","rum","port wine","royal challenge","whiskey","tequila","sherry","brandy","carlsberg","budweiser","oxygen","vermouth","cognac","beer","gin","baijiu","singani","arrack","jenever","soju","mezcal","arak","absinthe","horilka","rye whiskey","mirin"};

getAlcohols(alcohol);

}
public static void getAlcohols(String alcohol[]){
	for(String alcohols : alcohol)
		System.out.println(alcohols);

}
}