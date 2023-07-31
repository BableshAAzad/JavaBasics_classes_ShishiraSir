class Passanger {
    void takeTicket(){
        Money m = new Money();
        System.out.println(m + " Money_Object_reference");
        TicketCounter tc = new TicketCounter();
        System.out.println(tc + " TicketCounter_Object_Reference");
        Ticket t = tc.issueTicket(m);
    }
}
