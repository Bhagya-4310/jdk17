package Ticketbooking;

import collectiondemo.Restaurant;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        Test test=new Test();
        List<Ticket> tickets = new ArrayList<>();
        Ticket ticket1 = new Ticket();
        ticket1.status = "locked";
        Ticket ticket2 = new Ticket();
        ticket2.status = "locked";
        Ticket ticket3 = new Ticket();
        ticket3.status = "success";
        Ticket ticket4 = new Ticket();
        ticket4.status = "success";
        Ticket ticket5 = new Ticket();
        ticket5.status = "failed";
        tickets.add(ticket1);
        tickets.add(ticket2);
        tickets.add(ticket3);
        tickets.add(ticket4);
        tickets.add(ticket5);
      /* Iterator<Ticket> TicketIterator =tickets.iterator();
        for (;TicketIterator.hasNext();){
            Ticket ticket=TicketIterator.next();
            System.out.println(ticket.status);
        } */
        Iterator<Ticket> ticketIterator = tickets.iterator();
        for (int i = 0; i < tickets.size(); i++) {
            Ticket ticket = tickets.get(i);
            if (ticket.status.equals("locked")) {
                System.out.println(ticket.status);
            }
        }for (int i=0;i<tickets.size();i++){
            Ticket tickett=tickets.get(i);
            if(tickett.status.equals("success")){
                System.out.println(tickett.status);
            }
        }
        for(int i=0;i<tickets.size();i++){
            Ticket tickettt=tickets.get(i);
            if(tickettt.status.equals("failed")){
                System.out.println(tickettt.status);
            }
        }
        Predicate<Ticket> predicate = (ticket) -> ticket.status.equals("locked");
    }
}



       // BiPredicate<String,String> status=(
