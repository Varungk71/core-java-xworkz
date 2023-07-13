class Multiplication1{
	
	public static void main(String[] args){
		System.out.println(mul(12,23,3));
		System.out.println(mul(12,23,345));
		System.out.println(mul(12,23,74));
		System.out.println(mul(12,23,97));
		System.out.println(mul(2,23,97));
		System.out.println(mul(12,7));
		System.out.println(mul(23,98));
		System.out.println(mul(1,23,97));
		System.out.println(mul(12,3,9));
		System.out.println(mul(2,23,97));
		
	}
	
	public static int mul(int a,int b){
		return a*b;
	}
	
	public static int mul(int a,int b, int c){
		return a*b*c;
	}
	
	
	
}