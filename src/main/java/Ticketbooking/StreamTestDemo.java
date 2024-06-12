package Ticketbooking;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
//it satisfies dry principle
public class StreamTestDemo {
    public void tickeStatus(List<Ticket> ticketList, Predicate<Ticket> predicate){
        Iterator<Ticket> itr =ticketList.iterator();
        for(;itr.hasNext();){
            Ticket ticket= itr.next();
            if(predicate.test(ticket)){
                System.out.println("Ticket status"+ticket.status);
            }
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
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

        Predicate<Ticket> statuspredicate = (ticket) -> ticket.status.equals("locked");
        Predicate<Ticket> successpredicate = (ticket) -> ticket.status.equals("success");
        Predicate<Ticket> failedpredicate = (ticket) -> ticket.status.equals("failed");
        StreamTestDemo streamTestDemo = new StreamTestDemo();
        streamTestDemo.tickeStatus(tickets, statuspredicate);
        streamTestDemo.tickeStatus(tickets, successpredicate);
        streamTestDemo.tickeStatus(tickets, failedpredicate);
    }
}
