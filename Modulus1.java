class Modulus1{
	
	public static void main(String[] args){
		System.out.println(mod(12,23));
		System.out.println(mod(12,23));
		System.out.println(mod(12,23,74));
		System.out.println(mod(12,23,97));
		System.out.println(mod(3542,23,7));
		System.out.println(mod(35872,3));
		System.out.println(mod(12,2,32));
		System.out.println(mod(42872,2));
		System.out.println(mod(42862,23,1));
		System.out.println(mod(487,23,2));
		
	}
	
	public static int mod(int a,int b){
		return a%b;
	}
	
	public static int mod(int a,int b, int c){
		return a%b%c;
	}
	
	
	
}