package MetroStation;

public class Test{
    public static void main(String[] args) {

        Address address = new Address();
        address.mobileNo = "7989453985";
        address.destination = "LBNagar";
        Ticket ticket = new Ticket();
        ticket.noOfPersons = 3;
        ticket.mobileNo = "7989453985";
        ticket.price = 150;
        ticket.destination = "LBNagar";
        ticket.paymentMethod = "online";
        CheckIn checkIn = new CheckIn();
       // checkIn.platForm = 3;
        //checkIn.time = "6:45";
        checkIn.ticket = ticket;
        checkIn.address = address;
        CheckOut checkOut = new CheckOut();
        checkOut.time = "7:00";
        checkOut.platForm = 5;
        checkOut.address = address;
        checkOut.ticket = ticket;
        System.out.println();
    }
    }
