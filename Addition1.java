class Addition1{
	
	    public static void main(String[] args){
	add(2,3);
	add(10,37);
	add(1234,5678);
	add(3434,23563);
	add(876,876);
	add(111,222);
	add(333,444);
	add(555,666);
	add(7777,8888);
	add(876,87,6);
	add(111,222,6);
	add(333,44,4);
	add(555,66,6);
	add(7777,88,88);
	add(9999,44,44);
		
	}
	
	public static void add(int a,int b){
		
		int sum=a+b;
		System.out.println(sum);
	}
	
	public static void add(int a,int b, int c){
		int sum = a+b+c;
		System.out.println(sum);
	}
	
	
	
}