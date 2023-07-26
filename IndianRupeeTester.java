public class IndianRupeeTester {
    public static void main(String[] args) {
        IndianRupee rupee = new IndianRupee();
        rupee.setRupeeId(1);
        rupee.setRupeeName("Indian Rupee");
        rupee.setPrintDate("2023-07-20");
        rupee.setColor("Green");
        rupee.setSerialNo("A12345");
        rupee.setNoOfLanguages(17);
        rupee.setSize("67 mm x 140 mm");
        rupee.setBacksidePlaceName("Hampi");
        rupee.setLocation("India");

        // Display Indian Rupee details
        System.out.println("Rupee ID: " + rupee.getRupeeId());
        System.out.println("Rupee Name: " + rupee.getRupeeName());
        System.out.println("Print Date: " + rupee.getPrintDate());
        System.out.println("Color: " + rupee.getColor());
        System.out.println("Serial No: " + rupee.getSerialNo());
        System.out.println("Number of Languages: " + rupee.getNoOfLanguages());
        System.out.println("Size: " + rupee.getSize());
        System.out.println("Backside Place Name: " + rupee.getBacksidePlaceName());
        System.out.println("Location: " + rupee.getLocation());
    }
}