class MedicalStoreTester{

	public static void main(String args[]){
	
	MedicalStore.addMedicine("aspirin");
	MedicalStore.addMedicine("dolo");
	MedicalStore.addMedicine("paracetamol");
	MedicalStore.addMedicine("cyclizine");
	MedicalStore.addMedicine("acetaminophen");
	MedicalStore.addMedicine("phenylphrine");
	MedicalStore.addMedicine("vicks");
	MedicalStore.addMedicine("citrizine");
	MedicalStore.addMedicine("rantac");
	
	MedicalStore.getMedicineName();
	
	MedicalStore.updateMedicine("aspirin","Aspirin");
	MedicalStore.updateMedicine("dolo","Dolo");
	MedicalStore.updateMedicine("paracetamol","Paracetamol");
	MedicalStore.updateMedicine("cyclizine","Cyclizine");
	MedicalStore.updateMedicine("acetaminophen","Pcetaminophen");
	MedicalStore.updateMedicine("phenylphrine","Phenylphrine");
	MedicalStore.updateMedicine("vicks","Vicks");
	MedicalStore.updateMedicine("citrizine","Citrizine");
	MedicalStore.updateMedicine("rantac","Rantac");
	
	MedicalStore.getMedicineName();

	MedicalStore.deleteMedicine("Aspirin");
	
	MedicalStore.getDeletedMedicine(5);
	}
}