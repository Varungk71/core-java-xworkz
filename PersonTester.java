class PersonTester{

	public static void main(String test[]){
	
		Person person = new Person("xyz", "stable", "good", "male", 25);
		System.out.println(person.name + ", " + person.type + ", " + person.character + ", " + person.gender + ", " + person.age);
	
	
		Person person1 = new Person("abc", "mental", "super", "female", 20);
		System.out.println(person1.name + ", " + person1.type + ", " + person1.character + ", " + person1.gender + ", " + person1.age);
	
	
		Person person2 = new Person("baby", "good", "bad", "male", 30);
		System.out.println(person2.name + ", " + person2.type + ", " + person2.character + ", " + person2.gender + ", " + person2.age);
	
	
		Person person3 = new Person("wer", "constant", "good", "female", 2);
		System.out.println(person3.name + ", " + person3.type + ", " + person3.character + ", " + person3.gender + ", " + person3.age);
	
		Person person4 = new Person("xyz", "reserved", "good", "other", 34);
		System.out.println(person4.name + ", " + person4.type + ", " + person4.character + ", " + person4.gender + ", " + person4.age);
	
	
		Person person5 = new Person("xyz", "stable", "good", "male", 25);
		System.out.println(person5.name + ", " + person5.type + ", " + person5.character + ", " + person5.gender + ", " + person5.age);
		
		Person person6 = new Person("xyz", "stable", "good", "male", 25);
		System.out.println(person6.name + ", " + person6.type + ", " + person6.character + ", " + person6.gender + ", " + person6.age);
		
		
		Person person7 = new Person("wan", "role model", "good", "female", 56);
		System.out.println(person7.name + ", " + person7.type + ", " + person7.character + ", " + person7.gender + ", " + person7.age);
	
	
		Person person8 = new Person("xyz", "self centered", "bad", "male", 67);
		System.out.println(person8.name + ", " + person8.type + ", " + person8.character + ", " + person8.gender + ", " + person8.age);
		
		
		Person person9 = new Person("xyz", "average", "worst", "male", 20);
		System.out.println(person9.name + ", " + person9.type + ", " + person9.character + ", " + person9.gender + ", " + person9.age);
	
	}

}

