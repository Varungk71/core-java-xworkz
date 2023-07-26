public class TicketBookingsTester {
    public static void main(String[] args) {
        TicketBookings booking = new TicketBookings();
        booking.setBookingId(101);
        booking.setNoOfSeats(2);
        booking.setSource("New York");
        booking.setDestination("London");
        booking.setDate("2023-07-20");
        booking.setTimings("08:00 AM");
        booking.setPnr("ABC123");
        booking.setPrice(250.50);
        booking.setTicketClass("Business");
        booking.setBookingType("Online");
        booking.setTransportName("Flight");

        // Display Ticket Booking details
        System.out.println("Booking ID: " + booking.getBookingId());
        System.out.println("Number of Seats: " + booking.getNoOfSeats());
        System.out.println("Source: " + booking.getSource());
        System.out.println("Destination: " + booking.getDestination());
        System.out.println("Date: " + booking.getDate());
        System.out.println("Timings: " + booking.getTimings());
        System.out.println("PNR: " + booking.getPnr());
        System.out.println("Price: " + booking.getPrice());
        System.out.println("Ticket Class: " + booking.getTicketClass());
        System.out.println("Booking Type: " + booking.getBookingType());
        System.out.println("Transport Name: " + booking.getTransportName());
    }
}