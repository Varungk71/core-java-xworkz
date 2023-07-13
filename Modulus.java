class Modulus{

public static void main (String mag[]){
	mod(5,3);
	mod(987,37);
	mod(1232,58);
	mod(3422,2);
	mod(876,6);
	mod(111,2);
	mod(333,4);
	mod(555,6);
	mod(77,8);
	mod(99,4);
}

	public static void mod(int a, int b){
	
		int result = a%b;
		
		System.out.println("mod  is = " + result);
		}
}