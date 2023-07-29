class TicketCounter {
    Ticket issueTicket(Money m){
        Ticket t = new Ticket();
        System.out.println(t + " Ticket_Object_reference");
        return t;
    }
}
