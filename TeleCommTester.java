class TeleCommTester{

public static void main(String args[]){

TeleComm.createSim("jio");
TeleComm.createSim("airtel");
TeleComm.createSim("aircel");
TeleComm.createSim("vi");
TeleComm.createSim("vodaphone");
TeleComm.createSim("idea");
TeleComm.createSim("docomo");
TeleComm.createSim("bsnl");

TeleComm.getSimCard();


TeleComm.updateSim("jio","Jio");
TeleComm.updateSim("airtel","Airtel");
TeleComm.updateSim("aircel","Aircel");
TeleComm.updateSim("vi","VI");
TeleComm.updateSim("vodaphone","Vodaphone");
TeleComm.updateSim("idea","Idea");
TeleComm.updateSim("docomo","Docomo");
TeleComm.updateSim("bsnl","Bsnl");

TeleComm.getSimCard();

TeleComm.deteleSim("Jio");
TeleComm.getDeletedSim(7);

}
}