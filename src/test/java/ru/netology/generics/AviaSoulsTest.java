package ru.netology.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class AviaSoulsTest {

    @Test
    public void sortFewTickets() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("YAR", "BEL", 300, 20, 15);
        Ticket ticket2 = new Ticket("ORL", "MSK", 200, 10, 18);
        Ticket ticket3 = new Ticket("YAR", "MSK", 200, 4, 5);
        Ticket ticket4 = new Ticket("BEL", "MSK", 400, 6, 20);
        Ticket ticket5 = new Ticket("SPB", "YAR", 200, 12, 14);
        Ticket ticket6 = new Ticket("YAR", "MSK", 100, 8, 10);
        Ticket ticket7 = new Ticket("YAR", "MSK", 300, 15, 15);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] actual = manager.search("YAR", "MSK");
        Ticket[] expected = {ticket6, ticket3, ticket7};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void sortZeroTickets() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("YAR", "BEL", 300, 20, 15);
        Ticket ticket2 = new Ticket("ORL", "MSK", 200, 10, 18);
        Ticket ticket3 = new Ticket("YAR", "MSK", 200, 4, 5);
        Ticket ticket4 = new Ticket("BEL", "MSK", 400, 6, 20);
        Ticket ticket5 = new Ticket("SPB", "YAR", 200, 12, 14);
        Ticket ticket6 = new Ticket("YAR", "MSK", 100, 8, 10);
        Ticket ticket7 = new Ticket("YAR", "MSK", 300, 15, 15);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] actual = manager.search("YAR", "ORL");
        Ticket[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void sortOneTickets() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("YAR", "BEL", 300, 20, 15);
        Ticket ticket2 = new Ticket("ORL", "MSK", 200, 10, 18);
        Ticket ticket3 = new Ticket("YAR", "MSK", 200, 4, 5);
        Ticket ticket4 = new Ticket("BEL", "MSK", 400, 6, 20);
        Ticket ticket5 = new Ticket("SPB", "YAR", 200, 12, 14);
        Ticket ticket6 = new Ticket("YAR", "MSK", 100, 8, 10);
        Ticket ticket7 = new Ticket("YAR", "MSK", 300, 15, 15);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] actual = manager.search("BEL", "MSK");
        Ticket[] expected = {ticket4};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void sortTicketsComparator() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("YAR", "BEL", 300, 20, 15);
        Ticket ticket2 = new Ticket("ORL", "MSK", 200, 10, 18);
        Ticket ticket3 = new Ticket("YAR", "MSK", 200, 4, 5);
        Ticket ticket4 = new Ticket("BEL", "MSK", 400, 6, 20);
        Ticket ticket5 = new Ticket("SPB", "YAR", 200, 12, 14);
        Ticket ticket6 = new Ticket("YAR", "MSK", 100, 8, 10);
        Ticket ticket7 = new Ticket("YAR", "MSK", 300, 15, 15);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = manager.searchAndSortBy("YAR", "MSK", comparator);
        Ticket[] expected = {ticket7, ticket3, ticket6};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void sortZeroTicketsComparator() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("YAR", "BEL", 300, 20, 15);
        Ticket ticket2 = new Ticket("ORL", "MSK", 200, 10, 18);
        Ticket ticket3 = new Ticket("YAR", "MSK", 200, 4, 5);
        Ticket ticket4 = new Ticket("BEL", "MSK", 400, 6, 20);
        Ticket ticket5 = new Ticket("SPB", "YAR", 200, 12, 14);
        Ticket ticket6 = new Ticket("YAR", "MSK", 100, 8, 10);
        Ticket ticket7 = new Ticket("YAR", "MSK", 300, 15, 15);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = manager.searchAndSortBy("YAR", "ORL", comparator);
        Ticket[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void sortOneTicketsComparator1() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("YAR", "BEL", 300, 20, 15);
        Ticket ticket2 = new Ticket("ORL", "MSK", 200, 10, 18);
        Ticket ticket3 = new Ticket("YAR", "MSK", 200, 4, 5);
        Ticket ticket4 = new Ticket("BEL", "MSK", 400, 6, 20);
        Ticket ticket5 = new Ticket("SPB", "YAR", 200, 12, 14);
        Ticket ticket6 = new Ticket("YAR", "MSK", 100, 8, 10);
        Ticket ticket7 = new Ticket("YAR", "MSK", 300, 15, 15);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = manager.searchAndSortBy("BEL", "MSK", comparator);
        Ticket[] expected = {ticket4};

        Assertions.assertArrayEquals(expected, actual);
    }
}
