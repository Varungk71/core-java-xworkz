class PassportApplicationTester{

	public static void main(String test[]){
	
		PassportApplication details = new PassportApplication();
		
		details.setId(1);
		System.out.println(details.getId());
		
		details.setAge(23);
		System.out.println(details.getAge());
		
		details.setDob("april-18");
		System.out.println(details.getDob());
		
		details.setBirthPlace("karnataka");
		System.out.println(details.getBirthPlace());
		
		details.setMaritalStatus("unmarried");
		System.out.println(details.getMaritalStatus());
		
		details.setEmploymentStatus("Student");
		System.out.println(details.getEmploymentStatus());
		
		details.setQualification("graduate");
		System.out.println(details.getQualification());
		
		details.setAddress("ckm");
		System.out.println(details.getAddress());
		
		details.setNationality("india");
		System.out.println(details.getNationality());
		
		details.setType("e-passport");
		System.out.println(details.getType());
		
		details.setColor("orange");
		System.out.println(details.getColor());
		
		details.setPassportNo("123ganu56756");
		System.out.println(details.getPassportNo());
		
		details.setdateofissue("jan-20");
		System.out.println(details.getdateofissue());
		
		
	}


}