package org.example;

import java.util.Date;

public class TicketBookTest {
    public static void main(String[] args) {

        Ticket ticket=new Ticket();
        ticket.seatNumber=1;
        ticket.rowNumber="A";
        ticket.movieName="DIJTILLU";
        ticket.showTime=new Date();

        Ticket ticket1=new Ticket();
        ticket1.seatNumber=2;
        ticket1.rowNumber="A";
        ticket1.movieName="DIJTILLU";
        ticket1.showTime=new Date();

        Ticket ticket2=new Ticket();
        Ticket ticket3=new Ticket();
        Ticket ticket4=new Ticket();
        Ticket ticket5=new Ticket();

    }
}
