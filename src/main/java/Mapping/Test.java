package Mapping;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        Map<Integer, Ticket> ticketBookMap = new HashMap<>();
        List<Ticket> ticketBookList = new ArrayList<>();
        for (int i = 0; i < 1000000; i++){
            Ticket ticketBook = new Ticket();
            ticketBook.name = "venkat";
            ticketBook.pnrId = "123456789" + i;
            ticketBookMap.put(ticketBook.hashCode(), ticketBook);
            ticketBookList.add(ticketBook);
        }
        Set<Map.Entry<Integer, Ticket>> entrySet = ticketBookMap.entrySet();
        Iterator<Map.Entry<Integer, Ticket>> entryIterator = entrySet.iterator();
        for (; entryIterator.hasNext(); ) {
            Map.Entry<Integer, Ticket> mapNext = entryIterator.next();
            System.out.println("Iterator loop ----" + mapNext.toString());
        }
        ticketBookMap.forEach((k, v) -> {
            System.out.println("key from foreach" + k + "value" + v.toString());
        });
        Ticket ticketBook1 = new Ticket();
        ticketBook1.name = "venkat";
        ticketBook1.pnrId = "123456789900000";
        System.out.println("getting from list");
        long listStartTime = System.currentTimeMillis();
        Iterator<Ticket> bookIterator = ticketBookList.iterator();
        for (; bookIterator.hasNext(); ) {
            Ticket tt = bookIterator.next();
            if (tt.equals(ticketBook1)) {
                System.out.println("Find the ticket from list" + tt.pnrId);
                break;
            }
        }
        long listEndTime = System.currentTimeMillis();
        System.out.println("time taken" + (listEndTime - listStartTime));
        System.out.println("getting ticket from map");
        long mapStartTime = System.currentTimeMillis();
        Ticket mapTicket = ticketBookMap.get(ticketBook1.hashCode());
        System.out.println("Find the ticket from map" + mapTicket.pnrId);
        long mapEndTime = System.currentTimeMillis();
        System.out.println("Time taken map" + (mapEndTime - mapStartTime));
    }
}