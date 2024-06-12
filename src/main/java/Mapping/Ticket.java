package Mapping;

import java.util.Objects;

public class Ticket {
    String pnrId;
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return Objects.equals(pnrId, ticket.pnrId) && Objects.equals(name, ticket.name);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "pnrId='" + pnrId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(pnrId, name);
    }
}


