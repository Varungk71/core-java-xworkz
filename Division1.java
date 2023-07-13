class Division1{
	
	public static void main(String[] args){
		System.out.println(div(100,2));
		System.out.println(div(120,3));
		System.out.println(div(120,12,2));
		System.out.println(div(140,6,2));
		System.out.println(div(120,3,46));
		System.out.println(div(120,3,7));
		System.out.println(div(120,3,3));
        System.out.println(div(180,3));	
System.out.println(div(200,3,2));		
	}
	
	public static int div(int a,int b){
		return a/b;
	}
	
	public static int div(int a,int b, int c){
		return a/b/c;
	}
	
	
	
}